/*
	WAP to check if the String is Pangram or not.
*/

package ineuron.assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Ques4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		String str = sc.nextLine().trim();
		
		Boolean[] letters = new Boolean[26];
		Arrays.fill(letters, false);
		
		for(char ch : str.toCharArray())
			if(Character.isAlphabetic(ch))
				letters[(int)Character.toLowerCase(ch) - (int)'a'] = true;
		
		if(Arrays.asList(letters).contains(false))
			System.out.printf("The String %s is not a Pangram.", str);
		else
			System.out.printf("The String %s is a Pangram", str);
		
		sc.close();
	}
	
}
