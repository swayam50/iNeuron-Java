package com.assignment1.app;

import java.util.Scanner; 

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBApp {
	
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/cricket_db";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root123";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("--------------------------------------------------");
		System.out.println("------- Welcome to the Cricket Player's App ------");
		System.out.println("--------------------------------------------------");
		do {
			System.out.println();
			System.out.println("--------------------------");
			System.out.println("-- Select an Operation: --");
			System.out.println("--   1. Search a Player --");
			System.out.println("--   2. Insert a Player --");
			System.out.println("--   3. Update a Player --");
			System.out.println("--   4. Delete a Player --");
			System.out.println("--------------------------");
			System.out.println();
			System.out.println("Select an Option: ");
			
			
			int option = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			switch (option) {
				case 1 -> {
						System.out.println("Enter the Full Name of the Player to be inserted: ");
						String playerName = sc.nextLine().trim();
						searchPlayer(playerName);
					}
				case 2 -> {
						System.out.println("Enter the Player Information:: ");
						System.out.println("Enter Full Name: ");
						String name = sc.nextLine().trim();
						System.out.println("Enter Jersey Number: ");
						int jersey = sc.nextInt();
						sc.nextLine();
						System.out.println("Enter Domestic Team: ");
						String team = sc.nextLine().trim();
						System.out.println("Enter Country: ");
						String country = sc.nextLine().trim();
						insertPlayer(name, jersey, team, country);
					}
				case 3 -> {
						System.out.println("Enter Player to be Updated: ");
						String name = sc.nextLine().trim();
						System.out.println("Enter Field to be Updated (jersey/team/country): ");
						String field = "p".concat(sc.nextLine().trim());
						System.out.println("Enter Value to be Updated: ");
						String value = sc.nextLine().trim();
						updatePlayer(name, field, value);
					}
				case 4 -> {
						System.out.println("Enter the Full Name of the Player to be deleted: ");
						String playerName = sc.nextLine().trim();
						deletePlayer(playerName);
					}
				default -> System.out.println("\nPlease Select a Valid Option\n");			
			}
			
			System.out.println("Do you want to Exit? Y/N");
			char exit = sc.next().charAt(0);
			if (exit == 'Y')
				break;
			
		} while (true);
		System.out.println("--------------------------------------------------");
		System.out.println("----------- Thank You For Using Our App ----------");
		System.out.println("--------------------------------------------------");
		
		sc.close();
	}
	
	private static void searchPlayer(String playerName) {	
		String sqlSelectQuery = String.format("SELECT * FROM players WHERE pname = '%s'", playerName);
		
		try (
				Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery(sqlSelectQuery);
			) {
			
			if (!resultSet.next()) {
				System.out.println("\nPlayer Not Found\n");
				return;
			}
			
			System.out.println("\nPlayer Info::");
			System.out.printf("Name    : %s\n", resultSet.getString("pname"));
			System.out.printf("Jersey  : %d\n", resultSet.getInt("pjersey"));
			System.out.printf("Team    : %s\n", resultSet.getString("pteam"));
			System.out.printf("Country : %s\n\n", resultSet.getString("pcountry"));
			
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void insertPlayer(String playerName, int playerJersey, String playerTeam, String playerCountry) {
		String sqlInsertQuery = String.format("INSERT INTO players (pname, pjersey, pteam, pcountry) VALUES ('%s', %d, '%s', '%s');", playerName, playerJersey, playerTeam, playerCountry);
	
		try (
				Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				Statement statement = connection.createStatement();
			) {
				int rowsAffected = statement.executeUpdate(sqlInsertQuery);
			
				if (rowsAffected != 0)
					System.out.println("\nPlayer Successfully Inserted\n");
				else
					System.out.println("\nPlayer Insertion was not Successful\n");
				
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void updatePlayer(String playerName, String fieldToUpdate, String valueToUpdate) {
		String sqlUpdateQuery = String.format("UPDATE players SET %s = '%s' WHERE pname = '%s'", fieldToUpdate, valueToUpdate, playerName);
		
		try (
				Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				Statement statement = connection.createStatement();
			) {
				int rowsAffected = statement.executeUpdate(sqlUpdateQuery);
			
				if (rowsAffected != 0)
					System.out.println("\nPlayer Successfully Updated\n");
				else
					System.out.println("\nPlayer Updation was not Successful\n");
				
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void deletePlayer(String playerName) {
		String sqlDeleteQuery = String.format("DELETE FROM players WHERE pname = '%s'", playerName);
		
		try (
				Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				Statement statement = connection.createStatement();
			) {
				int rowsAffected = statement.executeUpdate(sqlDeleteQuery);
			
				if (rowsAffected != 0)
					System.out.println("\nPlayer Successfully Deleted\n");
				else
					System.out.println("\nPlayer Deletion was not Successful\n");
				
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
