package core.entities.service;

import core.entities.utils.*;

/**
 * 
 * @author Nicolas Mehl
 *
 */
public class AuthService {
	private SqlReader db;
	
	public AuthService() {
		db = new SqlReader();
	}
	
	public boolean credCheck(String name, String pw) {
		String query = "SELECT UserPass FROM tbl_Users WHERE UserName="+name;
		
		String userPw = db.sqlExecute(query).get(0).toString();
		if (userPw.equals(pw)) {
			return true;
		} else {
			return false;
		}
	}
}