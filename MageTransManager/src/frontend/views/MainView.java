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

import core.entities.bricks.User;
import frontend.handler.MainHandler;

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


/**
 * @author Timo Röder
 * {@docRoot}
 * @category
 * 
 */
public class MainView extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	
	private User currentUser;
	private MainHandler mainHandler;

	/**
	 * Create the frame.
	 */
	public MainView(User currentUser) {
		
		/**
		 * Init Fields
		 */
		this.currentUser = currentUser;
		
		// Init Handler
		MainHandler handler = new MainHandler(currentUser);
		
		/**
		 * Init GUI-Components
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 973, 554);
		
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
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnStart.add(mntmExit);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Items");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handler.openItemEditor();
			}
		});
		mnEdit.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Item Categories");
		mnEdit.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Item Types");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handler.openItemTypeEditor();
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
		mntmProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handler.openUserProfile();
			}
		});
		mnUser.add(mntmProfile);
		
		JMenu mnAdministration = new JMenu("Administration");
		menuBar.add(mnAdministration);
		
		JMenuItem mntmUsers = new JMenuItem("Users");
		mntmUsers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				handler.openUserConfig(0);
			}
		});
		mnAdministration.add(mntmUsers);
		
		JMenuItem mntmUsergroups = new JMenuItem("UserGroups");
		mntmUsergroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handler.openUserConfig(1);
			}
		});
		mnAdministration.add(mntmUsergroups);
		
		JMenuItem mntmUserteams = new JMenuItem("UserTeams");
		mntmUserteams.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handler.openUserConfig(2);
			}
		});
		mnAdministration.add(mntmUserteams);
		
		JMenuItem mntmConfiguration = new JMenuItem("Configuration");
		mntmConfiguration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handler.openSettings();
			}
		});
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
		
		Box verticalBox_3 = Box.createVerticalBox();
		toolBar.add(verticalBox_3);
		
		JLabel lblItemTypes = new JLabel("Item Types");
		lblItemTypes.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox_3.add(lblItemTypes);
		
		Box horizontalBox = Box.createHorizontalBox();
		verticalBox_3.add(horizontalBox);
		
		JToggleButton tglbtnGerman = new JToggleButton("DE");
		tglbtnGerman.setSelected(true);
		horizontalBox.add(tglbtnGerman);
		
		JToggleButton tglbtnEnglish = new JToggleButton("EN");
		tglbtnEnglish.setSelected(true);
		horizontalBox.add(tglbtnEnglish);
		
		JToggleButton tglbtnFrensh = new JToggleButton("FR");
		tglbtnFrensh.setSelected(true);
		horizontalBox.add(tglbtnFrensh);
		
		JToggleButton tglbtnItalian = new JToggleButton("IT");
		tglbtnItalian.setSelected(true);
		horizontalBox.add(tglbtnItalian);
		
		JToggleButton tglbtnSpanish = new JToggleButton("ES");
		tglbtnSpanish.setSelected(true);
		horizontalBox.add(tglbtnSpanish);
		
		JToolBar toolBar_2 = new JToolBar();
		toolBar_2.setBorder(new TitledBorder(UIManager.getBorder("ToolBar.border"), "Filter", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(128, 128, 128)));
		panel.add(toolBar_2);
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		toolBar_2.add(verticalBox);
		
		JLabel lblCategory = new JLabel("Category");
		lblCategory.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblCategory.setHorizontalTextPosition(SwingConstants.LEADING);
		verticalBox.add(lblCategory);
		
		JComboBox comboBox = new JComboBox();
		verticalBox.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"All", "Default", "Control Elements", "Checkout"}));
		comboBox.setSelectedIndex(2);
		verticalBox.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblCategory, comboBox}));
		
		Component rigidArea_3 = Box.createRigidArea(new Dimension(20, 20));
		toolBar_2.add(rigidArea_3);
		
		Box verticalBox_2 = Box.createVerticalBox();
		toolBar_2.add(verticalBox_2);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox_2.add(lblStatus);
		
		JComboBox comboBox_1 = new JComboBox();
		verticalBox_2.add(comboBox_1);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"All", "Inactive", "Active", "Archived"}));
		comboBox_1.setSelectedIndex(2);
		
		Component rigidArea_4 = Box.createRigidArea(new Dimension(20, 20));
		toolBar_2.add(rigidArea_4);
		
		Box verticalBox_4 = Box.createVerticalBox();
		toolBar_2.add(verticalBox_4);
		
		JLabel lblReviewState = new JLabel("Review State");
		lblReviewState.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox_4.add(lblReviewState);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"All", "Not reviewed", "Reviewed", "Published"}));
		verticalBox_4.add(comboBox_2);
		
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
		
		Box verticalBox_1 = Box.createVerticalBox();
		verticalBox_1.setAutoscrolls(true);
		panel_1.add(verticalBox_1);
		
		Box horizontalBox_4 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_4);
		
		JButton btnNewButton = new JButton("New");
		horizontalBox_4.add(btnNewButton);
		
		Component rigidArea = Box.createRigidArea(new Dimension(0, 5));
		verticalBox_1.add(rigidArea);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_3);
		
		JButton btnNewButton_2 = new JButton("Edit");
		horizontalBox_3.add(btnNewButton_2);
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(0, 5));
		verticalBox_1.add(rigidArea_1);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_2);
		
		JButton btnNewButton_1 = new JButton("Disable");
		horizontalBox_2.add(btnNewButton_1);
		btnNewButton_1.setHorizontalTextPosition(SwingConstants.CENTER);
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(0, 5));
		verticalBox_1.add(rigidArea_2);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_1);
		
		JButton btnDelete = new JButton("Delete");
		horizontalBox_1.add(btnDelete);
		
		Component rigidArea_5 = Box.createRigidArea(new Dimension(0, 5));
		panel_1.add(rigidArea_5);
		
		Component verticalGlue_2 = Box.createVerticalGlue();
		panel_1.add(verticalGlue_2);
		
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
				{"btn_basket", "Warenkorb", "Basket", null, null, null},
				{"btn_cart", "Einkaufswagen", "Cart", null, null, null},
				{"btn_next", "weiter", "next", null, null, null},
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
				"Identifier (ItemGroup)", "DE", "EN", "FR", "IT", "ES"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(125);
		scrollPane.setViewportView(table);
	}
}
