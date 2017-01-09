package frontend.handler;

import core.entities.bricks.User;
import core.entities.service.AuthService;
import frontend.forms.AuthForm;

public class AuthFormHandler {
	
	AuthForm authView;
	User currentUser;
	
	public AuthFormHandler() {
		
		frontend.forms.AuthForm authView = new frontend.forms.AuthForm();
		authView.setVisible(true);
		if (authView.credCheck()) {
			new frontend.views.MainView(getUser()).setVisible(true);
		}
	}
	public void authUser() {
		authView.sel_store.setEnabled(false);
		authView.txtf_userName.setEnabled(false);
		authView.txtf_userPwd.setEnabled(false);
		
		AuthService authService = new AuthService(authView.sel_store.getSelectedItem() , authView.txtf_userName.getText(),authView.txtf_userPwd.getPassword());
		
		if (authService.credCheck()) {
			loginUser();
		}
	}
	
	public void loginUser() {
		setUser(authView.txtf_userName.getText());
		new frontend.views.MainView(getUser()).setVisible(true);
	}
	
	public void setUser(String userName) {
		User currentUser = new User();
		currentUser.setUserName(userName);
	}
	
	public User getUser() {
		return this.currentUser;
	}

}
