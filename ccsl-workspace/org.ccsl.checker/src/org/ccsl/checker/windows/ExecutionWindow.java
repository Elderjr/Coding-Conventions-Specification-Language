package org.ccsl.checker.windows;


import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.text.DefaultCaret;

import org.ccsl.checker.ccslChecker.CcslCheckerRunner;
import org.ccsl.checker.ccslChecker.Violation;
import org.ccsl.checker.ccslChecker.output.CcslCheckerReportWritter;
import org.ccsl.checker.modisco.ModiscoJavaModel;
import org.ccsl.checker.modisco.ModiscoJavaModelDiscover;
import org.ccsl.checker.rule.Rule;
import org.ccsl.checker.rule.RuleFactory;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.modisco.infra.discovery.core.exception.DiscoveryException;
import org.eclipse.ocl.pivot.utilities.ParserException;

import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExecutionWindow {

	private JFrame frame;

	/*
	 * Forms
	 */
	private JTextArea taLog;
	private JTextArea taErrorLog;
	private JProgressBar progressBar;
	private JLabel lblExecutingRuleR;
	private Thread thread;
	
	public void start(Set<IJavaProject> javaProjects, Set<File> specificationFiles, File outputFolder) {
		frame.setVisible(true);
		thread = new Thread(createRunnableTask(javaProjects, specificationFiles, outputFolder));
		thread.start();
	}

	/**
	 * Create the application.
	 */
	public ExecutionWindow() {
		initialize();
	}

	private Runnable createRunnableTask(final Set<IJavaProject> javaProjects, final Set<File> specificationFiles,
			final File outputFolder) {
		return new Runnable() {
			@Override
			public void run() {
				// Discover java projects
				Set<ModiscoJavaModel> discoverProjects = new HashSet<>();
				int progressBarValue = 0;
				setMinAndMaxProgressBar(0, javaProjects.size());
				for (IJavaProject javaProject : javaProjects) {
					if (Thread.interrupted())
						break;
					updateProgress("Discovering java model of project: " + javaProject.getElementName() + " ("
							+ progressBarValue + " / " + javaProjects.size() +")", progressBarValue);
					try {
						ModiscoJavaModel javaModel = ModiscoJavaModelDiscover.getInstance()
								.discoverProject(javaProject);
						discoverProjects.add(javaModel);
						addLog("Extraction of java model from project " + javaProject.getElementName()
								+ " was successfully completed");
					} catch (DiscoveryException ex) {
						addErrorLog("An error occurred while trying to extract Java Model from project "
								+ javaProject.getElementName() + ": " + ex.getMessage());
					}
					progressBarValue++;

				}
				// Get Rule (ocl query, rule name) from files
				Set<Rule> rules = new HashSet<>();
				progressBarValue = 0;
				setMinAndMaxProgressBar(0, specificationFiles.size());
				for (File f : specificationFiles) {
					if (Thread.interrupted())
						break;
					updateProgress("Opening file: " + f.getName() + " (" + progressBarValue + " / "
							+ specificationFiles.size() +")", progressBarValue);
					try {
						Rule r = RuleFactory.createRuleFromFile(f);
						rules.add(r);
						addLog("Extraction of OCL query from file " + f.getName() + " was successfully completed");
					} catch (IOException ex) {
						addErrorLog("An error occurred while trying to extract OCL query from file " + f.getName()
								+ ": " + ex.getMessage());
					}
					progressBarValue++;
				}
				// Executing rules in java models
				Map<String, Set<Violation>> ruleViolations = new HashMap<>();
				progressBarValue = 0;
				setMinAndMaxProgressBar(0, rules.size() * discoverProjects.size());
				for (ModiscoJavaModel javaModel : discoverProjects) {
					if (Thread.interrupted())
						break;
					for (Rule r : rules) {
						if (Thread.interrupted())
							break;
						updateProgress("Executing rule " + r.getRuleName() + " in project "
								+ javaModel.getJavaModel().getName() + " (" + progressBarValue +" / " + rules.size() * discoverProjects.size() + ")" , progressBarValue);
						try {
							List<Violation> violations = CcslCheckerRunner.runRule(r, javaModel);
							if (!ruleViolations.containsKey(r.getRuleName())) {
								ruleViolations.put(r.getRuleName(), new HashSet<>());
							}
							ruleViolations.get(r.getRuleName()).addAll(violations);
							addLog(violations.size() + " violations found of rule " + r.getRuleName() + " in project " + javaModel.getJavaModel().getName());
						} catch (ParserException e) {
							addErrorLog("The OCL from rule " + r.getRuleName() + " has syntax errors");
						} catch (Exception e) {
							addErrorLog("An error occured while executing rule " + r.getRuleName() + " on project "
									+ javaModel.getJavaModel().getName()+": " + e.getMessage());
						}
						progressBarValue++;
					}
				}
				//Saving Rule Violations
				progressBarValue = 0;
				setMinAndMaxProgressBar(0, ruleViolations.size());
				for(Entry<String, Set<Violation>> entry : ruleViolations.entrySet()) {
					updateProgress("Saving violations of rule " + entry.getKey() + " (" + progressBarValue + " / " + ruleViolations.size() + ")", progressBarValue);
					File dest = new File(outputFolder.getAbsolutePath().replace("\\", "/") + "/" + entry.getKey() + "-ccsl-violations.txt");
					try {
						CcslCheckerReportWritter.writeRuleViolations(dest, entry.getValue());
						addLog("Violations of the rule " + entry.getKey() + " were successfully saved on file " + dest.getName());
					} catch (IOException e) {
						addLog("Can not save violations of the rule " + entry.getKey() + " on file " + dest.getName() +": " + e.getMessage());
					}
					progressBarValue++;
				}
				updateProgress("Done!", progressBarValue);
				JOptionPane.showMessageDialog(null, "Execucao finalizada! Clique no botao cancel para fechar a janela");
			}
		};
	}

	private void updateProgress(String message, int percentage) {
		lblExecutingRuleR.setText(message);
		progressBar.setValue(percentage);
	}

	private void setMinAndMaxProgressBar(int min, int max) {
		progressBar.setMinimum(min);
		progressBar.setMaximum(max);
	}

	private void addLog(String log) {
		taLog.setText(taLog.getText() + "\n" + log);
	}

	private void addErrorLog(String log) {
		taErrorLog.setText(taErrorLog.getText() + "\n" + log);
	}

	private void cancel() {
		thread.interrupt();
		frame.dispose();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 444, 343);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lblExecutingRuleR = new JLabel("Executing rule r in project p (x / t) ");

		progressBar = new JProgressBar();

		JButton btnCancelar = new JButton("Cancel");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cancel();
			}
		});

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Log Details", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Error Log Details", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
							.addGap(168))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblExecutingRuleR, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 408, Short.MAX_VALUE)
								.addComponent(progressBar, GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE))
							.addContainerGap())))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addComponent(lblExecutingRuleR)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnCancelar)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);

		JScrollPane scrollPane_1 = new JScrollPane();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING).addComponent(scrollPane_1,
				GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING).addComponent(scrollPane_1,
				Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE));

		taErrorLog = new JTextArea();
		taErrorLog.setLineWrap(true);
		((DefaultCaret) taErrorLog.getCaret()).setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		scrollPane_1.setViewportView(taErrorLog);
		panel_1.setLayout(gl_panel_1);

		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addComponent(scrollPane,
				GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addComponent(scrollPane,
				GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE));

		taLog = new JTextArea();
		taLog.setLineWrap(true);
		((DefaultCaret) taLog.getCaret()).setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		scrollPane.setViewportView(taLog);
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
	}

}
