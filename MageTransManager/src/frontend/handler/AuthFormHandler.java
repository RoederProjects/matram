package frontend.handler;

import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import core.entities.bricks.Store;
import core.entities.bricks.User;
import core.entities.service.AuthService;

public class AuthFormHandler {
	
	private User currentUser;
	
	public AuthFormHandler() {
		
	}
	
	public void authUser(JComboBox<Store> sel_store, JTextField txtF_userName, JPasswordField txtF_userPwd) {
		sel_store.setEnabled(false);
		txtF_userName.setEnabled(false);
		txtF_userPwd.setEnabled(false);
		
		AuthService authService = new AuthService(sel_store.getSelectedItem(), txtF_userName.getText(), txtF_userPwd.getPassword());
		
		if (authService.credCheck()) {
			setUser(txtF_userName.getText());
			
			loginUser();
		}
	}
	
	public void loginUser() {
		new frontend.views.MainView(getUser()).setVisible(true);
	}
	
	public void setUser(String userName) {
		this.currentUser = new User();
		currentUser.setUserName(userName);
	}
	
	public User getUser() {
		return this.currentUser;
	}

}
