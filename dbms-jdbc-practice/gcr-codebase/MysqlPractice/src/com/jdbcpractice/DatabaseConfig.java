package com.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {
	public static Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/practice_capge";
		// Connection properties
		java.util.Properties properties = new java.util.Properties();
		properties.setProperty("user", "root");
		properties.setProperty("password", "Meraaz@8904");
		properties.setProperty("useSSL", "false");
		properties.setProperty("serverTimezone", "UTC");
		properties.setProperty("allowPublicKeyRetrieval", "true");
		return DriverManager.getConnection(url, properties);
		}
	
	public static void main(String[] args) throws SQLException {
		Connection conn = getConnection();
		if (conn != null) {
			try 
			{
				conn.close();
				System.out.println("Connection closed.");
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
