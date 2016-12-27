package frontend.handler;

import core.entities.utils.SqlReader;
import frontend.views.SettingsView;

public class SettingsHandler extends SettingsView {

	testSqlConnection(String dbFile) {
		new SqlReader.getConnection(textField_dbAbsPathFilename.getText());
	}
}
