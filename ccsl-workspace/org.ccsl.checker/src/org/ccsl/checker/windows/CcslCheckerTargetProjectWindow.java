package org.ccsl.checker.windows;




import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.TitledBorder;

import org.eclipse.jdt.core.IJavaProject;

import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

public class CcslCheckerTargetProjectWindow {

	private JFrame frmCcslChecker;

	/*
	 * Form attributes
	 */
	private JTextField tfOutputFolder;
	private JFileChooser outputFolderFileChooser;
	private JComboBox<IJavaProject> cbTargetProjects;
	private DefaultComboBoxModel<IJavaProject> defaultComboBoxModelTargetProjets;
	private JList<IJavaProject> jListJavaProjects;
	private DefaultListModel<IJavaProject> defaultListModelJavaProjects;
	private JList<File> jListRules;
	private DefaultListModel<File> defaultListModelRules;
	private JFileChooser ruleFileChooser;

	public void show() {
		frmCcslChecker.setVisible(true);
	}

	public CcslCheckerTargetProjectWindow(Collection<IJavaProject> javaProjects) {
		setLookAndFeel();
		initialize();
		initializeFileChoosers();
		fillTargetProjectComboBox(javaProjects);
	}

	private final void initializeFileChoosers() {
		ruleFileChooser = new JFileChooser();
		ruleFileChooser.setMultiSelectionEnabled(true);
		outputFolderFileChooser = new JFileChooser();
		outputFolderFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	}

	private final void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private final void fillTargetProjectComboBox(Collection<IJavaProject> javaProjects) {
		for (IJavaProject p : javaProjects) {
			defaultComboBoxModelTargetProjets.addElement(p);
		}
	}

	private final void addTargetProject() {
		if (cbTargetProjects.getSelectedItem() != null) {
			IJavaProject javaProject = (IJavaProject) cbTargetProjects.getSelectedItem();
			defaultListModelJavaProjects.addElement(javaProject);
		}

	}

	private final void removeTargetProject() {
		int selectedLine = jListJavaProjects.getSelectedIndex();
		if (selectedLine != -1) {
			defaultListModelJavaProjects.remove(selectedLine);
		}
	}

	private final void addRule() {
		if (ruleFileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			File selectedFiles[] = ruleFileChooser.getSelectedFiles();
			for (File f : selectedFiles) {
				defaultListModelRules.addElement(f);
			}
		}
	}

	private final void removeRule() {
		int selectedLine = jListRules.getSelectedIndex();
		if (selectedLine != -1) {
			defaultListModelRules.remove(selectedLine);
		}
	}

	private final void runChecker() {
		File outputFolder = new File(tfOutputFolder.getText());
		Set<IJavaProject> targetProjects = new HashSet<IJavaProject>();
		for (int i = 0; i < defaultListModelJavaProjects.getSize(); i++) {
			targetProjects.add(defaultListModelJavaProjects.get(i));
		}
		Set<File> specificationFiles = new HashSet<>();
		for (int i = 0; i < defaultListModelRules.getSize(); i++) {
			specificationFiles.add(defaultListModelRules.get(i));
		}
		new ExecutionWindow().start(targetProjects, specificationFiles, outputFolder);
	}

	private void chooseOutputFolder() {
		if (outputFolderFileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			File f = outputFolderFileChooser.getSelectedFile();
			tfOutputFolder.setText(f.getAbsolutePath());
		}
	}

	private void cancel() {
		frmCcslChecker.dispose();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCcslChecker = new JFrame();
		frmCcslChecker.setTitle("Ccsl Checker");
		frmCcslChecker.setBounds(100, 100, 347, 471);
		frmCcslChecker.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel targetProjectsPanel = new JPanel();
		targetProjectsPanel.setBorder(
				new TitledBorder(null, "Target Projects", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		cbTargetProjects = new JComboBox<IJavaProject>();
		defaultComboBoxModelTargetProjets = new DefaultComboBoxModel<IJavaProject>();
		cbTargetProjects.setModel(defaultComboBoxModelTargetProjets);
		JScrollPane scrollPane = new JScrollPane();

		JButton btAddTarget = new JButton("Add Project");
		btAddTarget.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addTargetProject();
			}
		});
		btAddTarget.setIcon(null);

		JLabel lblNewLabel = new JLabel("*Press delete key to remove a selected project from the list");
		GroupLayout gl_targetProjectsPanel = new GroupLayout(targetProjectsPanel);
		gl_targetProjectsPanel.setHorizontalGroup(gl_targetProjectsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_targetProjectsPanel.createSequentialGroup().addContainerGap()
						.addGroup(gl_targetProjectsPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
								.addGroup(gl_targetProjectsPanel.createSequentialGroup().addGroup(gl_targetProjectsPanel
										.createParallelGroup(Alignment.TRAILING)
										.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 276,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(Alignment.LEADING, gl_targetProjectsPanel.createSequentialGroup()
												.addComponent(cbTargetProjects, GroupLayout.PREFERRED_SIZE, 176,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED).addComponent(btAddTarget,
														GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))));
		gl_targetProjectsPanel.setVerticalGroup(gl_targetProjectsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_targetProjectsPanel.createSequentialGroup().addGap(5)
						.addGroup(gl_targetProjectsPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(cbTargetProjects, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(btAddTarget))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(lblNewLabel)
						.addContainerGap(20, Short.MAX_VALUE)));

		jListJavaProjects = new JList<IJavaProject>();
		defaultListModelJavaProjects = new DefaultListModel<IJavaProject>();
		jListJavaProjects.setModel(defaultListModelJavaProjects);
		jListJavaProjects.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent evt) {
				if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
					removeTargetProject();
				}
			}
		});
		scrollPane.setViewportView(jListJavaProjects);
		targetProjectsPanel.setLayout(gl_targetProjectsPanel);

		JPanel ccslRulesPanel = new JPanel();
		ccslRulesPanel.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Ccsl Rules (*.ccsl, *.ocl)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		JButton btRemoveCcslRule = new JButton("-");
		btRemoveCcslRule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeRule();
			}
		});

		JButton btAddCcslRule = new JButton("+");
		btAddCcslRule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addRule();
			}
		});

		JScrollPane scrollPane_1 = new JScrollPane();
		GroupLayout gl_ccslRulesPanel = new GroupLayout(ccslRulesPanel);
		gl_ccslRulesPanel
				.setHorizontalGroup(gl_ccslRulesPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_ccslRulesPanel.createSequentialGroup().addContainerGap()
								.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_ccslRulesPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(btAddCcslRule, GroupLayout.PREFERRED_SIZE, 51,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btRemoveCcslRule, GroupLayout.PREFERRED_SIZE, 51,
												GroupLayout.PREFERRED_SIZE))
								.addContainerGap(46, Short.MAX_VALUE)));
		gl_ccslRulesPanel
				.setVerticalGroup(gl_ccslRulesPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_ccslRulesPanel.createSequentialGroup()
								.addComponent(btAddCcslRule, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
								.addComponent(btRemoveCcslRule, GroupLayout.PREFERRED_SIZE, 33,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap(16, Short.MAX_VALUE))
						.addGroup(gl_ccslRulesPanel.createSequentialGroup()
								.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
								.addContainerGap()));

		jListRules = new JList<File>();
		defaultListModelRules = new DefaultListModel<File>();
		jListRules.setModel(defaultListModelRules);
		scrollPane_1.setViewportView(jListRules);
		ccslRulesPanel.setLayout(gl_ccslRulesPanel);

		JPanel outputSettingsPanel = new JPanel();
		outputSettingsPanel.setBorder(
				new TitledBorder(null, "Output Settings", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		JLabel lblOutputFolder = new JLabel("Output folder:");

		tfOutputFolder = new JTextField();
		tfOutputFolder.setColumns(10);

		JButton btChooseOutputFolder = new JButton("Choose...");
		btChooseOutputFolder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chooseOutputFolder();
			}
		});
		GroupLayout gl_outputSettingsPanel = new GroupLayout(outputSettingsPanel);
		gl_outputSettingsPanel.setHorizontalGroup(gl_outputSettingsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_outputSettingsPanel.createSequentialGroup().addContainerGap()
						.addGroup(gl_outputSettingsPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_outputSettingsPanel.createSequentialGroup().addComponent(lblOutputFolder)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(tfOutputFolder, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
								.addComponent(btChooseOutputFolder, Alignment.TRAILING))
						.addContainerGap()));
		gl_outputSettingsPanel.setVerticalGroup(gl_outputSettingsPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_outputSettingsPanel.createSequentialGroup().addGap(6)
						.addGroup(gl_outputSettingsPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(tfOutputFolder, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblOutputFolder))
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(btChooseOutputFolder)
						.addContainerGap(27, Short.MAX_VALUE)));
		outputSettingsPanel.setLayout(gl_outputSettingsPanel);

		JButton btRunCcslChecker = new JButton("Run Ccsl checkers");
		btRunCcslChecker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				runChecker();
			}
		});

		JButton btCancel = new JButton("Cancel");
		btCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cancel();
			}
		});
		GroupLayout groupLayout = new GroupLayout(frmCcslChecker.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(outputSettingsPanel, Alignment.LEADING,
														GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
												.addComponent(ccslRulesPanel, Alignment.LEADING,
														GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
												.addComponent(targetProjectsPanel, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGap(15))
								.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
										.addComponent(btRunCcslChecker, GroupLayout.PREFERRED_SIZE, 124,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(btCancel,
												GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
										.addGap(14)))));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(14)
						.addComponent(targetProjectsPanel, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(ccslRulesPanel, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(outputSettingsPanel, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btRunCcslChecker).addComponent(btCancel))
						.addContainerGap(20, Short.MAX_VALUE)));
		frmCcslChecker.getContentPane().setLayout(groupLayout);

	}
}
