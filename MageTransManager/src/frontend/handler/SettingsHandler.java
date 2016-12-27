package frontend.handler;

import java.io.File;

import core.entities.utils.SqlReader;
import frontend.views.SettingsView;

public class SettingsHandler extends SettingsView {

	public void testSqlConnection(File dbFile) {
		new SqlReader().getConnection(dbFile);
	}
}
