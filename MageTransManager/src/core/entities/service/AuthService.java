package core.entities.service;
import java.beans.Statement;
import java.sql.Connection;

import core.entities.utils.*;

public class AuthService {
	private SqlReader db;
	private Statement statement;
	private Connection con;
	
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