package run;

public class Run {
	
	public static void main(String[] args) {
		
		gui.user.AuthForm login = new gui.user.AuthForm();
		login.setVisible(true);
		if (login.credCheck()) {
			new gui.MainView().setVisible(true);
		}
	}

}
