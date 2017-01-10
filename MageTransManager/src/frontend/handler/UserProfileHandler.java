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
		frontend.views.UserProfileView userProfileView = new frontend.views.UserProfileView();
		userProfileView.setVisible(true);
	}
	
	public void initViewContent() {
		view.lbl_userName.setText(currentUser.getUserName());
	}
}
