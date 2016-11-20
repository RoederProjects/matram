package frontend.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.ListSelectionModel;
import java.awt.Font;
import javax.swing.SpinnerNumberModel;
import java.awt.Insets;
import java.awt.Point;
import javax.swing.border.CompoundBorder;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class ItemTypeEditorView extends JFrame {

	private JPanel contentPane;
	private JTextField txtGerman;
	private JTextField txtIcogermanpng;

	/**
	 * Create the frame.
	 */
	public ItemTypeEditorView() {
		setTitle("Language Version Editor");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 477, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 11, 450, 30);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblAddeditDeleteLanguage = new JLabel("Add,Edit, Delete Language Version");
		lblAddeditDeleteLanguage.setForeground(Color.GRAY);
		lblAddeditDeleteLanguage.setFont(new Font("Consolas", lblAddeditDeleteLanguage.getFont().getStyle() | Font.ITALIC, lblAddeditDeleteLanguage.getFont().getSize() + 2));
		lblAddeditDeleteLanguage.setBounds(10, 0, 430, 30);
		panel.add(lblAddeditDeleteLanguage);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_1.setBounds(10, 52, 179, 312);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JList list = new JList();
		list.setSelectionForeground(new Color(255, 255, 255));
		list.setSelectionBackground(Color.DARK_GRAY);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setBorder(new LineBorder(Color.DARK_GRAY));
		list.setBackground(SystemColor.control);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Identifier (cannot be changed)", "German", "English", "French", "Italian", "Spain"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setSelectedIndex(1);
		list.setBounds(10, 11, 159, 257);
		panel_1.add(list);
		
		JButton btnNewButton = new JButton("Add New");
		btnNewButton.setBounds(10, 279, 81, 23);
		panel_1.add(btnNewButton);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(101, 279, 68, 23);
		panel_1.add(btnDelete);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_2.setBounds(199, 52, 261, 312);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnApply = new JButton("Apply");
		btnApply.setBounds(178, 278, 73, 23);
		panel_2.add(btnApply);
		
		txtGerman = new JTextField();
		txtGerman.setMargin(new Insets(2, 4, 2, 2));
		txtGerman.setText("German");
		txtGerman.setBackground(new Color(204, 204, 255));
		txtGerman.setBounds(57, 11, 194, 20);
		panel_2.add(txtGerman);
		txtGerman.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 14, 46, 14);
		panel_2.add(lblName);
		
		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.setBounds(95, 278, 73, 23);
		panel_2.add(btnNewButton_2);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spinner.setBounds(57, 61, 29, 20);
		panel_2.add(spinner);
		
		JLabel lblOrder = new JLabel("Order");
		lblOrder.setBounds(10, 64, 46, 14);
		panel_2.add(lblOrder);
		
		JCheckBox chckbxNotification = new JCheckBox("Notification");
		chckbxNotification.setBounds(10, 231, 97, 23);
		panel_2.add(chckbxNotification);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(10, 103, 241, 14);
		panel_2.add(lblDescription);
		
		JTextArea txtrDeutscheTextesollte = new JTextArea();
		txtrDeutscheTextesollte.setWrapStyleWord(true);
		txtrDeutscheTextesollte.setLineWrap(true);
		txtrDeutscheTextesollte.setBorder(new CompoundBorder(new LineBorder(new Color(0, 0, 0)), new EmptyBorder(2, 4, 2, 4)));
		txtrDeutscheTextesollte.setColumns(15);
		txtrDeutscheTextesollte.setRows(4);
		txtrDeutscheTextesollte.setMargin(new Insets(2, 4, 2, 4));
		txtrDeutscheTextesollte.setText("Deutsche Texte (sollte auch als Text-Inhalt Vorgabe dienen.) Und ausserdem blablalbalb asdsad asda sdngfdng jinfdgisdfb iasf bsdai fosdijg\u00FC er0i berpv rbgfbsdhvcbsad dbfhsdabf bsda fdvbsh whef df  asdas dghte ujg xcfsrduj v");
		txtrDeutscheTextesollte.setBackground(SystemColor.control);
		txtrDeutscheTextesollte.setBounds(10, 125, 241, 74);
		panel_2.add(txtrDeutscheTextesollte);
		
		JCheckBox chckbxActivated = new JCheckBox("Activated");
		chckbxActivated.setBounds(109, 231, 97, 23);
		panel_2.add(chckbxActivated);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 265, 241, 2);
		panel_2.add(separator_1);
		
		JLabel lblDefaultProperties = new JLabel("Default Properties");
		lblDefaultProperties.setBounds(10, 210, 241, 14);
		panel_2.add(lblDefaultProperties);
		
		JLabel lblIcon = new JLabel("Icon");
		lblIcon.setBounds(10, 39, 46, 14);
		panel_2.add(lblIcon);
		
		txtIcogermanpng = new JTextField();
		txtIcogermanpng.setMargin(new Insets(2, 4, 2, 2));
		txtIcogermanpng.setEnabled(false);
		txtIcogermanpng.setText("ico_german.png");
		txtIcogermanpng.setBounds(57, 36, 125, 20);
		panel_2.add(txtIcogermanpng);
		txtIcogermanpng.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 125, 241, 74);
		panel_2.add(scrollPane);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(10, 375, 450, 46);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.setBounds(351, 11, 89, 23);
		panel_3.add(btnNewButton_1);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(10, 11, 89, 23);
		panel_3.add(btnCancel);
	}
}
