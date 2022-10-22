package projects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import projects.exception.DbException;

public class DbConnection {
	private static String HOST = "localhost";
	private static String PASSWORD = "projects";
	private static int PORT = 3306;
	private static String SCHEMA = "projects";
	private static String USER = "projects";
	
	public static Connection getConnection() {
		String uri = String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s"
				, HOST, PORT, SCHEMA, USER, PASSWORD);
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
