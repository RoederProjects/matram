package core.entities.utils;

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
 * 
 * @edit method conCheck() by Timo Röder
 */

public class SqlReader {
	
	/**
	 * DB Path for Testing
	 */
	File dbMain = new File("db\\db_matram_filled.accdb");
	/**
	 * Config-Database (exists within the app-dir)
	 */
	File dbCoreConfig = new File("db/core_config.accdb");
	
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
	
	public SqlReader() {
		/*File file = new File (relPathFilename);
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
		}*/
		
		//Get DB Path
		//statement = createStatement(dbCoreConfig);
		
		
	}
	
	public Connection getConnection(File dbFilePath) {
		//File file = new File (absPathFilename);
		System.out.println("Try access to " + dbFilePath.getAbsolutePath());
		
		try {
			// establish the connection with the DriverManager
			conn = DriverManager.getConnection("jdbc:ucanaccess://" + dbFilePath.getAbsolutePath());
			
			// create a statement to send requests
			statement = conn.createStatement();
		} 
		catch (SQLException e) {
			closeDatabase();
			e.printStackTrace();
		}
		
		return conn;
	}
	
	
	public Statement createStatement(File dbFilePath) {
		try {
			// create a statement to send requests
			statement = getConnection(dbFilePath).createStatement();
	}
		catch (SQLException e) {
			closeDatabase();
			e.printStackTrace();
		}
		
		return statement;
	}
	
	/**
	 * COMMENTARY BY TIMO:
	 * Ich denke, wir sollten hier einfach nur das ResultSet zurückgeben
	 * und dann je nach Abfrage vielleicht jeweils in einer eigenen Methode oder Klasse
	 * aus dem ResultSet eine ArrayList mit dem entsprechendem "type of argument" generieren.
	 * Also z.B. für eine User-Abfrage wird eine ArrayList<User> zurückgegeben,
	 * oder für Item-Abfragen ArrayList<Item>.... You agreeeee to meeeee ?
	 * @param sqlQuery
	 * @return
	 */
	public ArrayList sqlExecute(String sqlQuery) {
		result = new ArrayList<>();
		
		try {
			ResultSet res = statement.executeQuery(sqlQuery);
			while (res.next()) {
				System.out.println(res.getString("UserName"));
				//ResultSet r = new ResultSet(res.getLong(1), res.getLong(2), res.getLong(3), res.getLong(4));
				result.add(res);
			}
			res.close();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
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
	
	/**
	 * EDIT BY TIMO:
	 * For longer sessions it would be nice to have a conCheck()-method, which checks if a statement/connection is closed.
	 * And open/create a statement/connection again, if its closed.
	 */
	public void conCheck() {

		try {
			if (conn == null || conn.isClosed() || statement == null || statement.isClosed()) {
				statement = getConnection(null).createStatement();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

    }

}