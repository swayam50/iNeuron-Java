/*
	WAP to print repeatedly occurring characters in the given String.
*/

package ineuron.assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Ques5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		String str = sc.nextLine().trim();
		
		int[] freq = new int[26];
		Arrays.fill(freq, 0);
		
		for(char ch : str.toCharArray())
			freq[(int)ch - (int)'a']++;
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 26; i++)
			if(freq[i] > 1)
				sb.append((char)(i + (int)'a'));
		
		System.out.print("The repeatedly occuring characters are: ");
		System.out.print(String.join(", ", sb.toString().split("")));
		
		sc.close();
	}
	
}
