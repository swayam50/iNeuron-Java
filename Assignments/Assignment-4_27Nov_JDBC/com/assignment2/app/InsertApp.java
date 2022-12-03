package com.assignment2.app;

import java.util.Scanner;

import com.assignment2.utils.JdbcUtil;

import java.text.SimpleDateFormat;
import java.text.ParseException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class InsertApp {
	public static void main(String[] args) throws ParseException {
		// resources used
		Connection conn = null;
		PreparedStatement pstmt = null;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name of Employee: ");
		String name = sc.nextLine().trim();
		
		System.out.println("Enter the Address: ");
		String address = sc.nextLine();
		
		System.out.println("Enter the Date of Birth (dd-MM-yyyy): ");
		String sdob = sc.next();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date utildob = sdf1.parse(sdob);
		long time1 = utildob.getTime();
		java.sql.Date sqldob = new java.sql.Date(time1);
		
		System.out.println("Enter the Date of Joining (MM-dd-yyyy): ");
		String sdoj = sc.next();
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM-dd-yyyy");
		java.util.Date utildoj = sdf2.parse(sdoj);
		long time2 = utildoj.getTime();
		java.sql.Date sqldoj = new java.sql.Date(time2);
		
		System.out.println("Enter the Date of Marriage (yyyy-MM-dd): ");
		String sdom = sc.next();
		
		java.sql.Date sqldom = java.sql.Date.valueOf(sdom);
		
		String sqlInsertQuery = "INSERT INTO employees (`name`, `address`, `dob`, `doj`, `dom`) VALUES (?, ?, ?, ?, ?)";
		
		try {
			conn = JdbcUtil.getJdbcConnection();
			
			if (conn != null)
				pstmt = conn.prepareStatement(sqlInsertQuery);
			
			if (pstmt != null) {
				pstmt.setString(1, name);
				pstmt.setString(2, address);
				pstmt.setDate(3, sqldob);
				pstmt.setDate(4, sqldoj);
				pstmt.setDate(5, sqldom);
				
				int rowsAffected = pstmt.executeUpdate();
				
				System.out.println("No of rows affected are:: " + rowsAffected);
			}
				
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				JdbcUtil.closeResources(null, pstmt, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if (sc != null)
				sc.close();
		}
	}
}
