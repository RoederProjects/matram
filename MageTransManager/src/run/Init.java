package run;

public class Init {

	public Init() {
		frontend.forms.AuthForm login = new frontend.forms.AuthForm();
		login.setVisible(true);
		if (login.credCheck()) {
			new frontend.views.MainView(login.getUser()).setVisible(true);
		}
	}
}
