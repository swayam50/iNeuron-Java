/*
	WAP to sort a String Alphabetically.
*/

package ineuron.assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Ques6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		String str = sc.next();
		
		char[] letters = str.toCharArray();
		Arrays.sort(letters);
		
		str = String.valueOf(letters);
		System.out.println("The sorted String is: ");
		System.out.print(str);
		
		sc.close();
	}
	
}
