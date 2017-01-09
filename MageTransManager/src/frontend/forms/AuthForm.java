package frontend.forms;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import core.entities.bricks.Store;
import core.entities.bricks.User;
import renderer.StoreCellRenderer;

import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
//import javax.swing.DefaultComboBoxModel;

public class AuthForm extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public JTextField txtf_userName;
	public JPasswordField txtf_userPwd;
	private JButton cancelButton;
	private JButton btnLogin;
	
	private boolean credCorrect = false;
	public JComboBox<Store> sel_store;

	/**
	 * Create the dialog.
	 */
	public AuthForm() {
		setLocationByPlatform(true);
		setUndecorated(true);
		setAlwaysOnTop(true);
		setModal(true);
		setType(Type.POPUP);
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		setAutoRequestFocus(false);
		setTitle("Authentification");
		setResizable(false);
		setBounds(100, 100, 258, 247);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			txtf_userName = new JTextField();
			txtf_userName.setColumns(10);
		}
		txtf_userPwd = new JPasswordField();
		JLabel inputUserNameLabel = new JLabel("User");
		inputUserNameLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		JLabel inputUserPassLabel = new JLabel("Password");
		inputUserPassLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		JLabel lblAuthentificationIsRequired = new JLabel("Authentification is required");
		lblAuthentificationIsRequired.setFont(new Font("Calibri", Font.BOLD, 13));
		
		JLabel selectShopLabel = new JLabel("Shop");
		
		//sel_store = new JComboBox<Store>();
		//sel_store.setModel((ComboBoxModel) new StoreCellRenderer());
		//sel_store.setModel(new DefaultComboBoxModel<Store>());
		sel_store = new JComboBox<Store>();
		sel_store.setRenderer(new StoreCellRenderer());
		sel_store.setModel(new DefaultComboBoxModel());
		sel_store.addItem(new Store("weinregal-profi.de", "magento"));
		sel_store.addItem(new Store("promondo.de", "websale"));
		
		
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblAuthentificationIsRequired)
						.addComponent(selectShopLabel)
						.addComponent(sel_store, 0, 228, Short.MAX_VALUE)
						.addComponent(inputUserNameLabel, GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
						.addComponent(txtf_userName, GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
						.addComponent(inputUserPassLabel, GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
						.addComponent(txtf_userPwd, GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAuthentificationIsRequired)
					.addGap(18)
					.addComponent(selectShopLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(sel_store, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(inputUserNameLabel)
					.addGap(3)
					.addComponent(txtf_userName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(inputUserPassLabel)
					.addGap(2)
					.addComponent(txtf_userPwd, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(69))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
			}
			{
				btnLogin = new JButton("Login");
				btnLogin.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						credCheck();
					}
				});
				btnLogin.setActionCommand("OK");
				getRootPane().setDefaultButton(btnLogin);
			}
			GroupLayout gl_buttonPane = new GroupLayout(buttonPane);
			gl_buttonPane.setHorizontalGroup(
				gl_buttonPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_buttonPane.createSequentialGroup()
						.addContainerGap()
						.addComponent(cancelButton)
						.addPreferredGap(ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
						.addComponent(btnLogin)
						.addContainerGap())
			);
			gl_buttonPane.setVerticalGroup(
				gl_buttonPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_buttonPane.createSequentialGroup()
						.addGap(8)
						.addGroup(gl_buttonPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(cancelButton)
							.addComponent(btnLogin))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			);
			buttonPane.setLayout(gl_buttonPane);
		}
	}

	public boolean credCheck() {
		String user = txtf_userName.getText();
		String password = txtf_userPwd.getText();
		credCorrect=true;
		this.dispose();
		return credCorrect;
	}

	
}
