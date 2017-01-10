package frontend.handler;

import core.entities.bricks.User;
import frontend.views.UserProfileView;

public class UserProfileHandler {

	public UserProfileView view;
	public User currentUser;
	
	public UserProfileHandler(User currentUser) {
		
		this.currentUser = currentUser;
		
		/*
		 * Init (Frontend-)View
		 */
		initViewLayout();
		initViewContent();
		
	}
	
	public void initViewLayout() {
		view = new frontend.views.UserProfileView();
		view.setVisible(true);
	}
	
	public void initViewContent() {
		view.lbl_userName.setText(currentUser.getUserName());
	}
}
