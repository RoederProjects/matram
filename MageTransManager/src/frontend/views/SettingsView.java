package frontend.views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import frontend.handler.SettingsHandler;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

public class SettingsView extends JFrame {

	private JPanel contentPane;
	private JTextField txtApparchivescom;
	private JTextField textField_1;
	private JTextField txtF_user;
	private JPasswordField txtF_pwd;
	private JTable table;
	private JTextField textField_dbAbsPathFileName;

	/**
	 * Create the frame.
	 */
	public SettingsView() {
		setTitle("Settings");
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 596, 419);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		
		JSeparator separator_2 = new JSeparator();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(tabbedPane, 0, 0, Short.MAX_VALUE)
					.addContainerGap())
				.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
				.addComponent(separator_2, GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separator_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(3)
					.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 40, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JButton btnSave_1 = new JButton("Save");
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cancelView();
			}
		});
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnCancel)
					.addPreferredGap(ComponentPlacement.RELATED, 428, Short.MAX_VALUE)
					.addComponent(btnSave_1)
					.addContainerGap())
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(9)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(btnCancel)
						.addComponent(btnSave_1))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_4.setLayout(gl_panel_4);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("FTP Connection", null, panel, null);
		
		JLabel lblConnectionDataOf = new JLabel("Connection data of your Webspace");
		
		JSeparator separator = new JSeparator();
		
		JLabel lblNewLabel = new JLabel("Server/Host");
		
		txtApparchivescom = new JTextField();
		txtApparchivescom.setText("app-archives.com");
		txtApparchivescom.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Port");
		
		textField_1 = new JTextField();
		textField_1.setText("21");
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("User");
		
		txtF_user = new JTextField();
		txtF_user.setText("webadmin");
		txtF_user.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		
		txtF_pwd = new JPasswordField();
		txtF_pwd.setText("ultraPassword");
		txtF_pwd.setColumns(10);
		
		JButton btnTestConnection = new JButton("Test Connection");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(separator, GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
								.addComponent(lblConnectionDataOf)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel)
										.addComponent(lblNewLabel_2))
									.addGap(18)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
										.addComponent(txtF_user)
										.addComponent(txtApparchivescom, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
										.addComponent(txtF_pwd, Alignment.TRAILING))
									.addGap(18)
									.addComponent(lblNewLabel_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap())
						.addComponent(lblNewLabel_3)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(btnTestConnection)
							.addContainerGap(352, Short.MAX_VALUE))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblConnectionDataOf)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(txtApparchivescom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(txtF_user, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(txtF_pwd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(44)
					.addComponent(btnTestConnection)
					.addContainerGap(81, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Database", null, panel_2, null);
		
		JLabel lblNewLabel_4 = new JLabel("Set the path of the .accdb - file.");
		
		JSeparator separator_1 = new JSeparator();
		
		textField_dbAbsPathFileName = new JTextField("I:\\\\Daten\\Access\\MTMApp\\mtm_db.accdb");
		textField_dbAbsPathFileName.setEditable(false);
		textField_dbAbsPathFileName.setEnabled(false);
		textField_dbAbsPathFileName.setBorder(new CompoundBorder(new LineBorder(new Color(102, 102, 255)), new EmptyBorder(4, 4, 4, 4)));
		textField_dbAbsPathFileName.setOpaque(true);
		textField_dbAbsPathFileName.setBackground(Color.WHITE);
		
		JButton btnNewButton = new JButton("Browse");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				openFileChooser();
			}
		});
		
		JButton btnTestConnection_1 = new JButton("Test Connection");
		btnTestConnection_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SettingsHandler().testSqlConnection(new File(textField_dbAbsPathFileName.getSelectedText()));
			}
		});
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_4)
						.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(gl_panel_2.createSequentialGroup()
								.addComponent(textField_dbAbsPathFileName, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(btnNewButton))
							.addComponent(separator_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 397, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnTestConnection_1))
					.addContainerGap(44, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_4)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_dbAbsPathFileName, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addGap(18)
					.addComponent(btnTestConnection_1)
					.addContainerGap(167, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Conversion", null, panel_3, null);
		
		JScrollPane scrollPane = new JScrollPane();
		
		table = new JTable();
		table.setCellSelectionEnabled(true);
		table.setEditingRow(0);
		table.setEditingColumn(0);
		table.setShowVerticalLines(false);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"", "\u00C4", "&Auml;"},
				{null, "\u00E4", "&auml;"},
				{null, "\u00DC", "&Uuml;"},
				{null, "\u00FC", "&uuml;"},
				{null, "\u00D6", "&Ouml;"},
				{null, "\u00F6", "&ouml;"},
				{null, "\u00DF", "&szlig;"},
				{null, "&", "&amp;"},
				{null, "", null},
				{null, null, null},
			},
			new String[] {
				"Status", "Text elements", "HTML code"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		table.getColumnModel().getColumn(0).setPreferredWidth(42);
		table.getColumnModel().getColumn(2).setResizable(false);
		
		JButton btnSave = new JButton("Save");
		btnSave.setEnabled(false);
		
		JButton btnDiscardChanges = new JButton("Reset");
		btnDiscardChanges.setEnabled(false);
		
		JButton btnEditMode = new JButton("Edit Mode");
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(btnEditMode)
							.addPreferredGap(ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
							.addComponent(btnDiscardChanges)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSave)))
					.addContainerGap())
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnEditMode)
						.addComponent(btnSave)
						.addComponent(btnDiscardChanges))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_3.setLayout(gl_panel_3);
		
		JPanel panel_1 = new JPanel();
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Export", null, panel_7, null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "CSV", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel lblSeperator = new JLabel("Seperator");
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {";", ",", "Tab"}));
		GroupLayout gl_panel_7 = new GroupLayout(panel_7);
		gl_panel_7.setHorizontalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addGap(10)
					.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 406, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_7.setVerticalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addGap(11)
					.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
		);
		GroupLayout gl_panel_6 = new GroupLayout(panel_6);
		gl_panel_6.setHorizontalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addGap(10)
					.addComponent(lblSeperator)
					.addGap(10)
					.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_6.setVerticalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addGap(14)
					.addComponent(lblSeperator))
				.addGroup(gl_panel_6.createSequentialGroup()
					.addGap(11)
					.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
		);
		panel_6.setLayout(gl_panel_6);
		panel_7.setLayout(gl_panel_7);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Push2Live", null, panel_5, null);
		
		JCheckBox chckbxAutoFormatting = new JCheckBox("Auto. Formatting");
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addComponent(chckbxAutoFormatting)
					.addContainerGap(358, Short.MAX_VALUE))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addComponent(chckbxAutoFormatting)
					.addContainerGap(373, Short.MAX_VALUE))
		);
		panel_5.setLayout(gl_panel_5);
		
		JPanel panel_8 = new JPanel();
		tabbedPane.addTab("Backup", null, panel_8, null);
		contentPane.setLayout(gl_contentPane);
	}
	
	private void openFileChooser() {
		//frontend.dialogs.FileChooser fileChooser2 = new frontend.dialogs.FileChooser();
		//fileChooser2.setVisible(true);
		JFileChooser chooser = new JFileChooser();
	    FileNameExtensionFilter filter = new FileNameExtensionFilter(
	        "JPG & GIF Images", "jpg", "gif");
	    chooser.setFileFilter(filter);
	    int returnVal = chooser.showOpenDialog(this);
	    if(returnVal == JFileChooser.APPROVE_OPTION) {
	       System.out.println("You chose to open this file: " +
	            chooser.getSelectedFile().getName());
	       this.textField_dbAbsPathFileName.setText(chooser.getSelectedFile().getName());
	    }
	}
	
	public void cancelView() {
		this.dispose();
	}
}
