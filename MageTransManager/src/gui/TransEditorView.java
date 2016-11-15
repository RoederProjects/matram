package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.DefaultComboBoxModel;

public class TransEditorView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JComboBox textField_1;
	private JTextArea txtA_textInput;

	/**
	 * Create the frame.
	 */
	public TransEditorView() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 681, 762);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel_2 = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 686, Short.MAX_VALUE)
		);
		
		JPanel pnl_titleBar = new JPanel();
		
		JLabel label = new JLabel("<<Identifier>>");
		
		JLabel label_1 = new JLabel("<<Today's date>>");
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		
		JLabel lblLastEdit = new JLabel("last edit");
		
		JLabel label_2 = new JLabel("<<edit date>>");
		
		JLabel lblBy = new JLabel("by");
		
		JLabel label_3 = new JLabel("<<username>>");
		
		JLabel lblNewLabel_1 = new JLabel("<<action>>");
		GroupLayout gl_pnl_titleBar = new GroupLayout(pnl_titleBar);
		gl_pnl_titleBar.setHorizontalGroup(
			gl_pnl_titleBar.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnl_titleBar.createSequentialGroup()
					.addContainerGap()
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
					.addGap(19)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnl_titleBar.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnl_titleBar.createSequentialGroup()
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblBy)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_3))
						.addGroup(gl_pnl_titleBar.createSequentialGroup()
							.addComponent(lblLastEdit)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_2)))
					.addGap(130)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
					.addComponent(label_1)
					.addContainerGap())
		);
		gl_pnl_titleBar.setVerticalGroup(
			gl_pnl_titleBar.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnl_titleBar.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnl_titleBar.createParallelGroup(Alignment.LEADING)
						.addComponent(separator, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
						.addGroup(gl_pnl_titleBar.createSequentialGroup()
							.addGroup(gl_pnl_titleBar.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnl_titleBar.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblLastEdit)
									.addComponent(label_2))
								.addGroup(gl_pnl_titleBar.createSequentialGroup()
									.addGap(2)
									.addGroup(gl_pnl_titleBar.createParallelGroup(Alignment.BASELINE)
										.addComponent(label)
										.addComponent(label_1))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnl_titleBar.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_1)
								.addComponent(lblBy)
								.addComponent(label_3)))
						.addComponent(separator_1, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
					.addContainerGap())
		);
		pnl_titleBar.setLayout(gl_pnl_titleBar);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "Properties", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "Notifications", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JCheckBox chckbxSendNotificationsTo = new JCheckBox("");
		chckbxSendNotificationsTo.setSelected(true);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("icon");
		
		JLabel lblSendNotificationsTo = new JLabel("Send to #Email");
		
		JLabel lblUseTo = new JLabel("Use \";\" to seperate ");
		lblUseTo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUseTo.setForeground(Color.GRAY);
		lblUseTo.setFont(new Font("Tahoma", Font.ITALIC, 10));
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblSendNotificationsTo))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addGap(4)
							.addComponent(chckbxSendNotificationsTo)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_panel_4.createSequentialGroup()
							.addGap(31)
							.addComponent(lblUseTo, GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(lblSendNotificationsTo))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.TRAILING)
						.addComponent(chckbxSendNotificationsTo)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblUseTo)
					.addContainerGap())
		);
		panel_4.setLayout(gl_panel_4);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "State", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "History", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panel_13 = new JPanel();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(10)
							.addComponent(panel_6, GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(panel_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 285, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(panel_13, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_11, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_6, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(20, Short.MAX_VALUE))
		);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "Category", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Default", "Control Element", "Checkout"}));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(comboBox_1, 0, 130, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(15, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "Status", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Active", "Inactive", "Archived"}));
		GroupLayout gl_panel_12 = new GroupLayout(panel_12);
		gl_panel_12.setHorizontalGroup(
			gl_panel_12.createParallelGroup(Alignment.LEADING)
				.addGap(0, 160, Short.MAX_VALUE)
				.addGroup(gl_panel_12.createSequentialGroup()
					.addContainerGap()
					.addComponent(comboBox_2, 0, 130, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_12.setVerticalGroup(
			gl_panel_12.createParallelGroup(Alignment.LEADING)
				.addGap(0, 45, Short.MAX_VALUE)
				.addGroup(gl_panel_12.createSequentialGroup()
					.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_12.setLayout(gl_panel_12);
		GroupLayout gl_panel_13 = new GroupLayout(panel_13);
		gl_panel_13.setHorizontalGroup(
			gl_panel_13.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_13.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_panel_13.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_12, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_13.setVerticalGroup(
			gl_panel_13.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_13.createSequentialGroup()
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
					.addComponent(panel_12, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
		);
		panel_13.setLayout(gl_panel_13);
		
		textField_1 = new JComboBox();
		textField_1.setModel(new DefaultComboBoxModel(new String[] {"Now [used data]", "1. History [old]", "2. History [older]", "3. History [oldest]"}));
		
		JButton btnNewButton_5 = new JButton("Restore");
		GroupLayout gl_panel_11 = new GroupLayout(panel_11);
		gl_panel_11.setHorizontalGroup(
			gl_panel_11.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_11.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_11.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnNewButton_5, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
						.addComponent(textField_1, Alignment.LEADING, 0, 117, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_11.setVerticalGroup(
			gl_panel_11.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_11.createSequentialGroup()
					.addContainerGap()
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnNewButton_5)
					.addContainerGap())
		);
		panel_11.setLayout(gl_panel_11);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 153, 102));
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(153, 255, 102));
		
		JLabel lblReviewDone = new JLabel("Review done");
		
		JLabel lblBy_1 = new JLabel("by");
		
		JLabel label_5 = new JLabel("<<username>>");
		GroupLayout gl_panel_8 = new GroupLayout(panel_8);
		gl_panel_8.setHorizontalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_8.createSequentialGroup()
					.addGap(15)
					.addGroup(gl_panel_8.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_8.createSequentialGroup()
							.addComponent(lblBy_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_5))
						.addComponent(lblReviewDone))
					.addContainerGap(56, Short.MAX_VALUE))
		);
		gl_panel_8.setVerticalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_8.createSequentialGroup()
					.addGap(10)
					.addComponent(lblReviewDone)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_8.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBy_1)
						.addComponent(label_5))
					.addContainerGap(15, Short.MAX_VALUE))
		);
		panel_8.setLayout(gl_panel_8);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(153, 204, 255));
		
		JLabel lblDataPusplished = new JLabel("Data puplished");
		GroupLayout gl_panel_9 = new GroupLayout(panel_9);
		gl_panel_9.setHorizontalGroup(
			gl_panel_9.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_9.createSequentialGroup()
					.addGap(15)
					.addComponent(lblDataPusplished)
					.addContainerGap(52, Short.MAX_VALUE))
		);
		gl_panel_9.setVerticalGroup(
			gl_panel_9.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_9.createSequentialGroup()
					.addGap(10)
					.addComponent(lblDataPusplished)
					.addContainerGap(40, Short.MAX_VALUE))
		);
		panel_9.setLayout(gl_panel_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(255, 255, 153));
		GroupLayout gl_panel_6 = new GroupLayout(panel_6);
		gl_panel_6.setHorizontalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_10, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_8, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_6.setVerticalGroup(
			gl_panel_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_6.createSequentialGroup()
					.addComponent(panel_9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_panel_6.createSequentialGroup()
					.addGroup(gl_panel_6.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_8, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_10, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_7, Alignment.LEADING, 0, 0, Short.MAX_VALUE))
					.addGap(13))
		);
		
		JLabel lblNewData = new JLabel("New Data");
		lblNewData.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnRequestReview = new JButton("Request review");
		GroupLayout gl_panel_10 = new GroupLayout(panel_10);
		gl_panel_10.setHorizontalGroup(
			gl_panel_10.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_10.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_10.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnRequestReview, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewData, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_10.setVerticalGroup(
			gl_panel_10.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_10.createSequentialGroup()
					.addContainerGap()
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewData)
					.addGap(4)
					.addComponent(btnRequestReview, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_10.setLayout(gl_panel_10);
		
		JButton btnConfirmData = new JButton("Confirm Data");
		
		JLabel lblReviewRequested = new JLabel("Review requested");
		lblReviewRequested.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_7 = new GroupLayout(panel_7);
		gl_panel_7.setHorizontalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_7.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_7.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnConfirmData, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
						.addComponent(lblReviewRequested, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_7.setVerticalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblReviewRequested)
					.addGap(4)
					.addComponent(btnConfirmData, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_7.setLayout(gl_panel_7);
		panel_6.setLayout(gl_panel_6);
		panel_1.setLayout(gl_panel_1);
		
		JPanel pnl_textEditor = new JPanel();
		
		JPanel pnl_textInput = new JPanel();
		
		txtA_textInput = new JTextArea();
		txtA_textInput.setText("asdfasdfasdf");
		GroupLayout gl_pnl_textInput = new GroupLayout(pnl_textInput);
		gl_pnl_textInput.setHorizontalGroup(
			gl_pnl_textInput.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnl_textInput.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtA_textInput, GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_pnl_textInput.setVerticalGroup(
			gl_pnl_textInput.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnl_textInput.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtA_textInput, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
					.addContainerGap())
		);
		pnl_textInput.setLayout(gl_pnl_textInput);
		
		JPanel pnl_format = new JPanel();
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(TransEditorView.class.getResource("/res/icon_text-bold.png")));
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println(txtA_textInput.getText());
				insertTagFat(txtA_textInput);
			}
		});
		
		JButton btnNewButton_1 = new JButton("<u>");
		
		JButton btnNewButton_2 = new JButton("<i>");
		GroupLayout gl_pnl_format = new GroupLayout(pnl_format);
		gl_pnl_format.setHorizontalGroup(
			gl_pnl_format.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnl_format.createSequentialGroup()
					.addGap(6)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnNewButton_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_2)
					.addContainerGap(431, Short.MAX_VALUE))
		);
		gl_pnl_format.setVerticalGroup(
			gl_pnl_format.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnl_format.createSequentialGroup()
					.addGroup(gl_pnl_format.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1)
						.addComponent(btnNewButton_2))
					.addContainerGap(12, Short.MAX_VALUE))
				.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
		);
		pnl_format.setLayout(gl_pnl_format);
		GroupLayout gl_pnl_textEditor = new GroupLayout(pnl_textEditor);
		gl_pnl_textEditor.setHorizontalGroup(
			gl_pnl_textEditor.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnl_textEditor.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnl_textEditor.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(pnl_textInput, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
						.addComponent(pnl_format, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE))
					.addContainerGap(95, Short.MAX_VALUE))
		);
		gl_pnl_textEditor.setVerticalGroup(
			gl_pnl_textEditor.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnl_textEditor.createSequentialGroup()
					.addContainerGap()
					.addComponent(pnl_format, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pnl_textInput, GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
					.addContainerGap())
		);
		pnl_textEditor.setLayout(gl_pnl_textEditor);
		
		JPanel panel = new JPanel();
		
		JButton btnNewButton_3 = new JButton("Save");
		
		JButton btnNewButton_4 = new JButton("Cancel");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton_4)
					.addPreferredGap(ComponentPlacement.RELATED, 458, Short.MAX_VALUE)
					.addComponent(btnNewButton_3)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(2)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_4)
						.addComponent(btnNewButton_3))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_5 = new JPanel();
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addComponent(pnl_textEditor, GroupLayout.PREFERRED_SIZE, 636, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1, 0, 0, Short.MAX_VALUE)
						.addComponent(panel_5, 0, 0, Short.MAX_VALUE)
						.addComponent(pnl_titleBar, GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(pnl_titleBar, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pnl_textEditor, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JLabel lblValueFor = new JLabel("Language Version");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Identifier", "German", "English"}));
		
		JLabel label_4 = new JLabel("<<icon>>");
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_4)
					.addGap(18)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBox, 0, 85, Short.MAX_VALUE)
						.addComponent(lblValueFor, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(472))
		);
		gl_panel_5.setVerticalGroup(
			gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup()
					.addGap(8)
					.addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup()
							.addComponent(lblValueFor)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_5.setLayout(gl_panel_5);
		panel_2.setLayout(gl_panel_2);
		contentPane.setLayout(gl_contentPane);
	}

	public void insertTagFat(JTextArea txtA_textInput) {
		if (txtA_textInput.getSelectedText() != null) {
			txtA_textInput.insert("<b>", txtA_textInput.getSelectionStart());
			txtA_textInput.insert("</b>", txtA_textInput.getSelectionEnd());
		}
	}
}
