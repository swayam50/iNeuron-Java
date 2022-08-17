/*
	WAP to check if the String is Anagram or not.
*/

package ineuron.assignment3;

import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String str = sc.next().trim();
		
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		
		String tmp = sb.toString();
		
		if(str.equals(tmp))
			System.out.printf("String %s is an Anagram", str);
		else
			System.out.printf("String %s is not an Anagram", str);
		
		sc.close();
	}
	
}
