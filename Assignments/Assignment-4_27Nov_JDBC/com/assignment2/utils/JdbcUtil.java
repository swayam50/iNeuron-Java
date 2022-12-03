package com.assignment2.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
	
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/ineuron_db";
	private static final String USERNAME = "swayam";
	private static final String PASSWORD = "samflynn50";
	
	private JdbcUtil() {}
	
	public static Connection getJdbcConnection() throws SQLException {
		Connection conn = null;
		conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		return conn;
	}
	
	public static void closeResources(ResultSet resultSet, Statement statement, Connection connection) throws SQLException {
		if (resultSet != null)
			resultSet.close();
		if (statement != null)
			statement.close();
		if (connection != null)
			connection.close();
	}
	
}
