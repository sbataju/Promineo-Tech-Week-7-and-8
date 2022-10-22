package projects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import projects.exception.DbException;

public class DbConnection {
	//Constants
	private static String HOST = "localhost";
	private static String PASSWORD = "projects";
	private static int PORT = 3306;
	private static String SCHEMA = "projects";
	private static String USER = "projects";
	
	/*
	 * This method returns a Connection object if the connection is successful,
	 * and prints an error message if the connection is not successful.
	 */
	public static Connection getConnection() {
		//Creating a MySQL connection URL using the constants
		String uri = String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s"
				, HOST, PORT, SCHEMA, USER, PASSWORD);
		//Checked exception returns Connection if successful:
		Connection conn;
		try {
			conn = DriverManager.getConnection(uri);
			System.out.println("Successful getting connection!");
			return conn;
		} catch (SQLException e) {
			System.out.println("Error getting connection.");
			throw new DbException(e);
		}
	}

}
