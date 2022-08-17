/*
	WAP to reverse a sentence while preserving the position.
*/

package ineuron.assignment3;

import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String sentence = sc.nextLine().trim();
		
		String[] words = sentence.split(" ");
		for(int i = 0; i < words.length; i++)
			words[i] = new StringBuilder(words[i]).reverse().toString();
		
		sentence = String.join(" ", words).trim();
		
		System.out.print(sentence);
		
		sc.close();
	}
	
}
