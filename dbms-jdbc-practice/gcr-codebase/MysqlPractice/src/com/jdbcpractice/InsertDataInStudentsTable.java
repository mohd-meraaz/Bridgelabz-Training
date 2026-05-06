package com.jdbcpractice;

import java.sql.*;

public class InsertDataInStudentsTable {
	public static void insertStudent(String name, String email, int age, String grade) {
		
		String sql = "Insert into students (name, email, age, grade, enrollment_date) values(?,?,?,?,?)";
		
		try(Connection con = DatabaseConnection.getConnection();
			PreparedStatement pstmt =con.prepareStatement(sql)){
				pstmt.setString(1, name);
				pstmt.setString(2, email);
				pstmt.setInt(3, age);
				pstmt.setString(4, grade);
				pstmt.setDate(5, new java.sql.Date(System.currentTimeMillis()));
				
				int rowAffected = pstmt.executeUpdate();
				System.out.println(rowAffected+" row(s) inserted successfully!");
			
		}
		catch(SQLException e) {
			System.err.println("Insert failed: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		insertStudent("Meraaz", "mohd.meraaz@email.com", 22, "A");
		insertStudent("Lucky", "lucky.pal@email.com", 22, "B");
		}
}