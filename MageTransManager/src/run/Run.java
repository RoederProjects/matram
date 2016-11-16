package run;

public class Run {
	
	public static void main(String[] args) {
		
		gui.dialogs.AuthForm login = new gui.dialogs.AuthForm();
		login.setVisible(true);
		if (login.credCheck()) {
			new gui.views.MainView().setVisible(true);
		}
	}

}
