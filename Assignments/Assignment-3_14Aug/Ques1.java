/*
	WAP to reverse a String.
*/

package ineuron.assignment3;

import java.util.Scanner;

public class Ques1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		
		str = sb.toString();
		
		System.out.print(str);
		
		sc.close();
	}
	
}
