package ineuron.project.numguesser;

import java.util.Arrays;
import java.util.Scanner;

class Player {

	private int playerNum, jerseyNum;
	
	Player(int j) {
		this.jerseyNum = j;
	}
	
	public void guessNumber() {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Player %d, kindly guess the number: \n", jerseyNum);
		this.playerNum = sc.nextInt();
		
	}
	
	public int getNumber() {
		return playerNum;
	}
	
	public int getJersey() {
		return jerseyNum;
	}
}

class Guesser {
	
	private int guesserNum;
	
	public void guessNumber() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Guesser, kindly guess the number: ");
		this.guesserNum = sc.nextInt();
		
	}
	
	public int getNumber() {
		return guesserNum;
	}
}

class Umpire {
	
	private Guesser guesser;
	private Player[] players;
	
	Umpire(Guesser g, Player[] ps) {
		this.guesser = g;
		this.players = ps;
	}
	
	public void findWinners() {
		String winners = getWinners().trim();
		if(winners.length() == 0)
			System.out.println("Every player lost the game");
		else
			System.out.printf("Players %s, are the players who guessed the correct number %d\n", winners, guesser.getNumber());
	}
	
	private String getWinners() {
		boolean[] winners = new boolean[players.length];
		Arrays.fill(winners, false);
		
		int guesserNum = collectGuesserNum();
		int[] playerNums = collectPlayerNums();
		
		for(int i = 0; i < playerNums.length; i++)
			if(guesserNum == playerNums[i])
				winners[i] = true;
		
		StringBuilder sb = new StringBuilder("");
		
		for(int i = 0; i < winners.length; i++)
			if(winners[i] == true)
				sb.append(players[i].getJersey()).append(' ');
		
		return sb.toString();
	}
	
	private int collectGuesserNum() {
		return guesser.getNumber();
	}
	
	private int[] collectPlayerNums() {
		int[] nums = new int[players.length];
		for(int i = 0; i < players.length; i++)
			nums[i] = players[i].getNumber();
		return nums;
	}
	
}

public class LaunchGame {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int playerCount;
		System.out.println("Enter the Number of Players: ");
		playerCount = sc.nextInt();
		
		Guesser guesser = new Guesser();
		guesser.guessNumber();
		
		Player[] players = new Player[playerCount];
		for(int i = 0; i < playerCount; i++)
			players[i] = new Player(i+1);
		
		for(int i = 0; i < playerCount; i++)
			players[i].guessNumber();
		
		Umpire umpire = new Umpire(guesser, players);
		umpire.findWinners();
		
		sc.close();
		
	}
	
}
