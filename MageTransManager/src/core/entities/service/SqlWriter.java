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

public class SqlWriter {
	
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
	
	File file = new File(relPathFilename);
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
