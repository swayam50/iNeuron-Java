/*
	WAP to print
	
	*            *
	**          **
	***        ***
	****      ****
	*****    *****
	******  ******
	**************
	**************
*/

package ineuron.assignment1;

public class Ques4 {
	
	public static void main(String[] args) {
		
		for(int i = 0, s = 1; i < 8; i++, s++) {
			for(int j = 0; j < 13; j++) {
				if(j < s)
					System.out.print('*');
				else if(j < 13 - s)
					System.out.print(' ');
				else
					System.out.print('*');
			}
			System.out.println();
		}
		
	}
	
}
