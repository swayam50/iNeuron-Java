/*
	WAP to print
	
	**************
	******
	*****
	****
	***
	**
	*
	**
	***
	****
	*****
	******
	*******
	**************
*/

package ineuron.assignment1;

public class Ques5 {
	
	public static void main(String[] args) {
		
		boolean invert = false;
		for(int i = 0, s = 7; i < 14; i++, s += invert ? 1 : -1) {
			for(int j = 0; j < 14; j++) {
				if(i == 0 || i == 13 || j < s)
					System.out.print('*');
				else
					System.out.print(' ');
			}
			System.out.println();
			
			if(i == 6)	invert = true;
		}
		
	}
	
}
