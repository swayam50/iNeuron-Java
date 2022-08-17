/*
	WAP to count the number of special characters.
*/

package ineuron.assignment3;

import java.util.Scanner;

public class Ques8 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		String str = sc.next();
		
		int special = 0;
		for(char ch : str.toCharArray())
			if(!Character.isLetterOrDigit(ch))
				special++;
		
		System.out.printf("There are %d Special characters in the String.", special);
		
		sc.close();
	}
	
}
