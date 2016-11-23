package frontend.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.BoxLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.ComponentOrientation;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.util.Locale.Category;
import java.awt.Dimension;
import javax.swing.Box;
import org.eclipse.wb.swing.FocusTraversalOnArray;

public class MainView extends frontend.handler.MainHandler {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainView frame = new MainView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 751, 554);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnStart = new JMenu("Start");
		menuBar.add(mnStart);
		
		JMenu mnExport = new JMenu("Export");
		mnStart.add(mnExport);
		
		JMenuItem mntmcsv = new JMenuItem(".csv");
		mnExport.add(mntmcsv);
		
		JMenu mnPublish = new JMenu("Push to");
		mnStart.add(mnPublish);
		
		JMenu mntmMagentopublisher = new JMenu("Magento");
		mnPublish.add(mntmMagentopublisher);
		
		JMenuItem mntmLive = new JMenuItem("Live");
		mntmMagentopublisher.add(mntmLive);
		
		JMenuItem mntmTest = new JMenuItem("Test");
		mntmMagentopublisher.add(mntmTest);
		
		JSeparator separator = new JSeparator();
		mnStart.add(separator);
		
		JMenuItem mntmSearch = new JMenuItem("Search");
		mnStart.add(mntmSearch);
		
		JSeparator separator_1 = new JSeparator();
		mnStart.add(separator_1);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnStart.add(mntmExit);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Items");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openItemEditor();
			}
		});
		mnEdit.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Item Categories");
		mnEdit.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Item Types");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openItemTypeEditor();
			}
		});
		mnEdit.add(mntmNewMenuItem_2);
		
		JMenu mnView = new JMenu("View");
		menuBar.add(mnView);
		
		JMenu mnToolbar = new JMenu("Toolbars");
		mnView.add(mnToolbar);
		
		JCheckBoxMenuItem chckbxmntmItemTypes = new JCheckBoxMenuItem("Item Types");
		mnToolbar.add(chckbxmntmItemTypes);
		
		JCheckBoxMenuItem chckbxmntmItemCategories = new JCheckBoxMenuItem("Item Categories");
		mnToolbar.add(chckbxmntmItemCategories);
		
		JCheckBoxMenuItem chckbxmntmItemSearch = new JCheckBoxMenuItem("Search Field");
		mnToolbar.add(chckbxmntmItemSearch);
		
		JMenu mnItemTypes = new JMenu("Item Types");
		mnView.add(mnItemTypes);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem = new JCheckBoxMenuItem("Identifier");
		chckbxmntmNewCheckItem.setSelected(true);
		mnItemTypes.add(chckbxmntmNewCheckItem);
		
		JMenu mnUser = new JMenu("User");
		menuBar.add(mnUser);
		
		JMenuItem mntmProfile = new JMenuItem("Profile");
		mnUser.add(mntmProfile);
		
		JMenu mnAdministration = new JMenu("Administration");
		menuBar.add(mnAdministration);
		
		JMenuItem mntmUsers = new JMenuItem("Users");
		mnAdministration.add(mntmUsers);
		
		JMenuItem mntmConfiguration = new JMenuItem("Configuration");
		mnAdministration.add(mntmConfiguration);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel, BorderLayout.NORTH);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBorder(new TitledBorder(UIManager.getBorder("ToolBar.border"), "Show/Hide", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, Color.GRAY));
		panel.add(toolBar);
		
		JToggleButton tglbtnGerman = new JToggleButton("German");
		toolBar.add(tglbtnGerman);
		
		JToggleButton tglbtnEnglish = new JToggleButton("English");
		toolBar.add(tglbtnEnglish);
		
		JToggleButton tglbtnFrensh = new JToggleButton("French");
		toolBar.add(tglbtnFrensh);
		
		JToggleButton tglbtnItalian = new JToggleButton("Italian");
		toolBar.add(tglbtnItalian);
		
		JToggleButton tglbtnSpanish = new JToggleButton("Spanish");
		toolBar.add(tglbtnSpanish);
		
		JToolBar toolBar_2 = new JToolBar();
		toolBar_2.setBorder(new TitledBorder(UIManager.getBorder("ToolBar.border"), "Filter", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(128, 128, 128)));
		panel.add(toolBar_2);
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		toolBar_2.add(verticalBox);
		
		JLabel lblCategory = new JLabel("Category");
		lblCategory.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblCategory.setHorizontalTextPosition(SwingConstants.LEADING);
		verticalBox.add(lblCategory);
		
		JComboBox comboBox = new JComboBox();
		verticalBox.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Default"}));
		verticalBox.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblCategory, comboBox}));
		
		JLabel lblStatus = new JLabel("Status");
		toolBar_2.add(lblStatus);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"All"}));
		toolBar_2.add(comboBox_1);
		
		JToolBar toolBar_1 = new JToolBar();
		toolBar_1.setBorder(new TitledBorder(UIManager.getBorder("ToolBar.border"), "Search Items", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(128, 128, 128)));
		panel.add(toolBar_1);
		
		textField = new JTextField();
		toolBar_1.add(textField);
		textField.setColumns(20);
		
		JButton btnSearch = new JButton("Search");
		toolBar_1.add(btnSearch);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new CompoundBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5), new LineBorder(new Color(0, 0, 0))), new EmptyBorder(5, 5, 5, 5)));
		panel_1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		contentPane.add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		JLabel label = new JLabel("");
		panel_1.add(label);
		
		Box verticalBox_1 = Box.createVerticalBox();
		verticalBox_1.setAutoscrolls(true);
		panel_1.add(verticalBox_1);
		
		JButton btnNewButton = new JButton("New");
		verticalBox_1.add(btnNewButton);
		
		Component rigidArea = Box.createRigidArea(new Dimension(0, 5));
		verticalBox_1.add(rigidArea);
		
		JButton btnNewButton_2 = new JButton("Edit");
		verticalBox_1.add(btnNewButton_2);
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(0, 5));
		verticalBox_1.add(rigidArea_1);
		
		JButton btnNewButton_1 = new JButton("Disable");
		verticalBox_1.add(btnNewButton_1);
		btnNewButton_1.setHorizontalTextPosition(SwingConstants.CENTER);
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(0, 5));
		verticalBox_1.add(rigidArea_2);
		
		JButton btnDelete = new JButton("Delete");
		verticalBox_1.add(btnDelete);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new CompoundBorder(new CompoundBorder(new EmptyBorder(5, 5, 5, 5), new LineBorder(new Color(0, 0, 0))), new EmptyBorder(5, 5, 5, 5)));
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setShowHorizontalLines(false);
		table.setRowMargin(4);
		table.setRowHeight(20);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(table);
	}
}
