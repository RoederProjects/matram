package core.entities.service;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import core.entities.bricks.User;

/**
 * Class SqlReader gets connection with Access-Database and read data from file
 * 
 * @author Kevin Wann
 * @version 1.0
 * @datum 22.11.2016
 */

public class SqlReader {
	/**
	 * Database connection from java.sql - package
	 */
	Connection conn = null;
	
	/**
	 * Statement for SQL-requests from java.sql - package
	 */
	Statement statement = null;
	
	
	/**
	 * Result-Array for SQL-Statement from java.sql - package
	 */
	ArrayList<ResultSet> result = null;
	
	/**
	 * Hashmap stores Result-Array
	 */
	HashMap<String, User> hashmapUsers = null;

	
	/**
	 * Constructor using the relative path file name to connect to the
	 * "db_matram_filled.accdb" file reading all informations.
	 * 
	 * @param relPathFilename
	 *            - the relative path and filename to the access file.
	 * 
	 */
	
	public SqlReader(String relPathFilename) {
		File file = new File (relPathFilename);
		System.out.println("Try access to " + file.getAbsolutePath());
		
		try {
			// establish the connection with the DriverManager
			conn = DriverManager.getConnection("jdbc:ucanaccess://" + file.getAbsolutePath());
			
			// create a statement to send requests
			statement = conn.createStatement();
		} 
		catch (SQLException e) {
			closeDatabase();
			e.printStackTrace();
		}
		
		String sql = "SELECT * FROM tbl_Users";
		hashmapUsers = new HashMap<>();
		
		try {
			ResultSet res = statement.executeQuery(sql);
			while (res.next()) {
				appendUser(res.getString("UserName"));
				System.out.println(res.getString("UserName"));
			}
			res.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Check if a user exists. If not add a new user to the hashmapUsers
	 * 
	 * @param string
	 */
	private void appendUser(String name) {
		if (hashmapUsers.containsKey(name)) {
			return;
		}
		hashmapUsers.put(name, new User());
	}
	
	/**
	 * Close all database stuff. Used by constructor.
	 */
	private void closeDatabase() {
		try {
			if (statement != null) {
				statement.close();
			}
				
			if (conn != null) {
				conn.close();
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
