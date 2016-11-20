package frontend.handler;

import frontend.views.ItemEditorView;
import frontend.views.ItemTypeEditorView;

public class MainHandler extends javax.swing.JFrame {

	public void openItemEditor() {
    	new ItemEditorView().setVisible(true);
    }
	
	public void openItemTypeEditor() {
    	new ItemTypeEditorView().setVisible(true);
    }
    
    public void openSettings() {
        new frontend.views.SettingsView().setVisible(true);
    }
    
    public boolean requestAuth() {
    	new frontend.forms.AuthForm().setVisible(true);
    	return true;
    }
    
    public void openUserConfig(int tab) {
    	new frontend.views.UserMgrView(tab).setVisible(true);
    }
}
