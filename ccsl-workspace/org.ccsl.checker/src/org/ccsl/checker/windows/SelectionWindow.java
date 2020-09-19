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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

public class SelectionWindow {

	private JFrame frmCcslChecker;

	/*
	 * Form attributes
	 */
	private JTextField tfOutputFolder;
	private JFileChooser outputFolderFileChooser;
	private JComboBox<String> cbTargetProjects;
	private DefaultComboBoxModel<String> defaultComboBoxModelTargetProjets;
	private JList<String> jListJavaProjects;
	private DefaultListModel<String> defaultListModelJavaProjects;
	private JList<File> jListRules;
	private DefaultListModel<File> defaultListModelRules;
	private JFileChooser ruleFileChooser;

	//Java Project map (Java Project Name) -> (IJavaProject)
	private Map<String, IJavaProject> javaProjects;
	
	public void show() {
		frmCcslChecker.setVisible(true);
	}

	public SelectionWindow(Collection<IJavaProject> javaProjects) {
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
		/*
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
		}*/
	}

	private final void fillTargetProjectComboBox(Collection<IJavaProject> javaProjects) {
		this.javaProjects = new HashMap<>();
		for (IJavaProject p : javaProjects) {
			this.javaProjects.put(p.getElementName(), p);
			defaultComboBoxModelTargetProjets.addElement(p.getElementName());
		}
	}

	private final void addTargetProject() {
		if (cbTargetProjects.getSelectedItem() != null) {
			String javaProjectName = (String) cbTargetProjects.getSelectedItem();			
			defaultListModelJavaProjects.addElement(javaProjectName);
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
		String javaProjectName;
		for (int i = 0; i < defaultListModelJavaProjects.getSize(); i++) {
			javaProjectName = defaultListModelJavaProjects.get(i);
			targetProjects.add(this.javaProjects.get(javaProjectName));
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
		frmCcslChecker.setBounds(100, 100, 512, 474);
		frmCcslChecker.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel targetProjectsPanel = new JPanel();
		targetProjectsPanel.setBorder(
				new TitledBorder(null, "Target Projects", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		cbTargetProjects = new JComboBox<>();
		cbTargetProjects.setBounds(17, 22, 285, 24);
		defaultComboBoxModelTargetProjets = new DefaultComboBoxModel<>();
		cbTargetProjects.setModel(defaultComboBoxModelTargetProjets);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(17, 59, 431, 75);

		JButton btAddTarget = new JButton("Add Project");
		btAddTarget.setBounds(314, 22, 134, 25);
		btAddTarget.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addTargetProject();
			}
		});
		btAddTarget.setIcon(null);

		JLabel lblNewLabel = new JLabel("*Press delete key to remove a selected project from the list");
		lblNewLabel.setBounds(17, 140, 463, 15);

		jListJavaProjects = new JList<>();
		defaultListModelJavaProjects = new DefaultListModel<>();
		jListJavaProjects.setModel(defaultListModelJavaProjects);
		jListJavaProjects.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent evt) {
				if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
					removeTargetProject();
				}
			}
		});
		scrollPane.setViewportView(jListJavaProjects);

		JPanel ccslRulesPanel = new JPanel();
		ccslRulesPanel.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Ccsl Rules (*.ccsl, *.ocl)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		JButton btRemoveCcslRule = new JButton("-");
		btRemoveCcslRule.setBounds(399, 65, 51, 33);
		btRemoveCcslRule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeRule();
			}
		});

		JButton btAddCcslRule = new JButton("+");
		btAddCcslRule.setBounds(399, 20, 51, 33);
		btAddCcslRule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addRule();
			}
		});

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(18, 17, 369, 81);

		jListRules = new JList<File>();
		defaultListModelRules = new DefaultListModel<File>();
		jListRules.setModel(defaultListModelRules);
		scrollPane_1.setViewportView(jListRules);

		JPanel outputSettingsPanel = new JPanel();
		outputSettingsPanel.setBorder(
				new TitledBorder(null, "Output Settings", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		JLabel lblOutputFolder = new JLabel("Output folder:");
		lblOutputFolder.setBounds(12, 22, 101, 24);

		tfOutputFolder = new JTextField();
		tfOutputFolder.setBounds(119, 23, 326, 24);
		tfOutputFolder.setColumns(10);

		JButton btChooseOutputFolder = new JButton("Choose...");
		btChooseOutputFolder.setBounds(328, 49, 117, 25);
		btChooseOutputFolder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chooseOutputFolder();
			}
		});
		
		JPanel confirmButtonsLayout = new JPanel();
		GroupLayout groupLayout = new GroupLayout(frmCcslChecker.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(confirmButtonsLayout, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
							.addGap(24))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(outputSettingsPanel, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
								.addComponent(ccslRulesPanel, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
								.addComponent(targetProjectsPanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE))
							.addContainerGap())))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(14)
					.addComponent(targetProjectsPanel, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(ccslRulesPanel, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(outputSettingsPanel, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(confirmButtonsLayout, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
					.addContainerGap())
		);
				confirmButtonsLayout.setLayout(null);
		
				JButton btRunCcslChecker = new JButton("Run Ccsl checkers");
				btRunCcslChecker.setBounds(210, 5, 160, 25);
				confirmButtonsLayout.add(btRunCcslChecker);
				
						JButton btCancel = new JButton("Cancel");
						btCancel.setBounds(382, 5, 81, 25);
						confirmButtonsLayout.add(btCancel);
						btCancel.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								cancel();
							}
						});
				btRunCcslChecker.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						runChecker();
					}
				});
		outputSettingsPanel.setLayout(null);
		outputSettingsPanel.add(lblOutputFolder);
		outputSettingsPanel.add(tfOutputFolder);
		outputSettingsPanel.add(btChooseOutputFolder);
		targetProjectsPanel.setLayout(null);
		targetProjectsPanel.add(lblNewLabel);
		targetProjectsPanel.add(scrollPane);
		targetProjectsPanel.add(cbTargetProjects);
		targetProjectsPanel.add(btAddTarget);
		ccslRulesPanel.setLayout(null);
		ccslRulesPanel.add(scrollPane_1);
		ccslRulesPanel.add(btAddCcslRule);
		ccslRulesPanel.add(btRemoveCcslRule);
		frmCcslChecker.getContentPane().setLayout(groupLayout);

	}
}
