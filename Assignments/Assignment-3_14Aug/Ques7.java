/*
	WAP to count the number of Vowels and Consonants of a String value.
*/

package ineuron.assignment3;

import java.util.Scanner;

public class Ques7 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		String str = sc.next();
		
		int consonants = 0, vowels = 0;
		for(char ch : str.toCharArray()) {
			switch(ch) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					vowels++;
					break;
				default:
					consonants++;
			}
		}
		
		System.out.printf("There are %d Vowels and %d Consonants in the String %s", vowels, consonants, str);
		
		sc.close();
	}
	
}
