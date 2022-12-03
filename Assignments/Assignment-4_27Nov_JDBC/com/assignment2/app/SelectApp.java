package com.assignment2.app;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.assignment2.utils.JdbcUtil;

public class SelectApp {
	public static void main(String[] args) throws ParseException {
		// resources used
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name of Employee: ");
		String name = sc.nextLine();
		
		
		String sqlSelectQuery = "SELECT * FROM employees WHERE name = ?";
		
		try {
			conn = JdbcUtil.getJdbcConnection();
			
			if (conn != null)
				pstmt = conn.prepareStatement(sqlSelectQuery);
			
			if (pstmt != null) {
				pstmt.setString(1, name);
				
				rs = pstmt.executeQuery();
				
				if (rs != null && rs.next()) {
					String ename = rs.getString("name");
					String eaddr = rs.getString("address");
					Date edob = rs.getDate("dob");
					Date edoj = rs.getDate("doj");
					Date edom = rs.getDate("dom");
					
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					
					String sdob = sdf.format(edob);
					String sdoj = sdf.format(edoj);
					String sdom = sdf.format(edom);
					
					System.out.printf("Name: %s\nAddress: %s\nDOB: %s\nDOJ: %s\nDOM: %s\n", ename, eaddr, sdob, sdoj, sdom);
				}
			}
				
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				JdbcUtil.closeResources(rs, pstmt, conn);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if (sc != null)
				sc.close();
		}
	}
}
