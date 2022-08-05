/*
	WAP to print
	**************
	****** *******
	*****   ******
	****     *****
	***       ****
	**         ***
	*           **
	*            *
	*            *
	*            *
	*            *
	*            *
	*            *
	**************
*/

package ineuron.assignment1;

public class Ques3 {
	
	public static void main(String[] args) {
		
		for(int i = 0, st = 7, sp = -1; i < 14; i++, sp += 2, st--) {
			for(int j = 0; j < 14; j++) {
				if(i == 0 || i == 13 || j == 0 || j == 13)
					System.out.print('*');
				else if(j < st)
					System.out.print('*');
				else if(j < st + sp)
					System.out.print(' ');
				else
					System.out.print('*');
			}
			System.out.println();
		}
	}
	
}
