package run;

public class Run {
	
	public static void main(String[] args) {
		
		frontend.forms.AuthForm login = new frontend.forms.AuthForm();
		login.setVisible(true);
		if (login.credCheck()) {
			new frontend.views.MainView().setVisible(true);
		}
	}

}
