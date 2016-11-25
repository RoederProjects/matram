package frontend.handler;

import core.entities.bricks.User;
import frontend.forms.AuthForm;
import frontend.views.ItemEditorView;
import frontend.views.ItemTypeEditorView;
import frontend.views.SettingsView;
import frontend.views.UserMgrView;
import frontend.views.UserProfileView;

public class MainHandler extends javax.swing.JFrame {

	private User currentUser;
	
	public void openItemEditor() {
    	new ItemEditorView().setVisible(true);
    }
	
	public void openItemTypeEditor() {
    	new ItemTypeEditorView().setVisible(true);
    }
    
    public void openSettings() {
        new SettingsView().setVisible(true);
    }
    
    public boolean requestAuth() {
    	new AuthForm().setVisible(true);
    	return true;
    }
    
    public void openUserConfig(int tab) {
    	new UserMgrView(tab).setVisible(true);
    }
    
    public void openUserProfile() {
    	new UserProfileView(this.currentUser).setVisible(true);
    }
}
