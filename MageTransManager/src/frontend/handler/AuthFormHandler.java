package frontend.handler;

import core.entities.bricks.User;
import core.entities.service.AuthService;
import frontend.forms.AuthForm;

public class AuthFormHandler {
	
	AuthForm authView;
	private User currentUser;
	private boolean credCorrect = false;
	
	public AuthFormHandler() {
		
	}
	
	public void authUser() {
		authView.sel_store.setEnabled(false);
		authView.txtf_userName.setEnabled(false);
		authView.txtf_userPwd.setEnabled(false);
		
		AuthService authService = new AuthService(authView.sel_store.getSelectedItem(), authView.txtf_userName.getText(), authView.txtf_userPwd.getPassword());
		
		if (authService.credCheck()) {
			loginUser();
		}
	}
	
	public void loginUser() {
		setUser(authView.txtf_userName.getText());
		new frontend.handler.MainHandler(currentUser);
	}
	
	public boolean credCheck() {
		String user = authView.txtf_userName.getText();
		String password = authView.txtf_userPwd.getText();
		credCorrect=true;
		return credCorrect;
	}
	
	public void setUser(String userName) {
		User currentUser = new User();
		currentUser.setUserName(userName);
	}
	
	public User getUser() {
		return this.currentUser;
	}

}
