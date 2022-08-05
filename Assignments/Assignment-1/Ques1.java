/*
	Write a program(WAP) to print INEURON using pattern programming logic.
*/

package ineuron.assignment1;

class LetterPattern {
	
	private String word;
	private char special, space;
	private char[][] grid;
	private int marker;
	
	LetterPattern(String word, char special, char space) {
		this.word = word;
		this.special = special;
		this.space = space;
		this.grid = new char[7][word.length() * 7];
		this.marker = 0;
		
		generateGrid();
	}
	
	private void generateGrid() {
		
		for(char ch : word.toCharArray()) {
			
			ch = Character.toUpperCase(ch);
			
			switch (ch) {
				case 'A':
					a();
					break;
				case 'B':
					b();
					break;
				case 'C':
					c();
					break;
				case 'D':
					d();
					break;
				case 'E':
					e();
					break;
				case 'F':
					f();
					break;
				case 'G':
					g();
					break;
				case 'H':
					h();
					break;
				case 'I':
					i();
					break;
				case 'J':
					j();
					break;
				case 'K':
					k();
					break;
				case 'L':
					l();
					break;
				case 'M':
					m();
					break;
				case 'N':
					n();
					break;
				case 'O':
					o();
					break;
				case 'P':
					p();
					break;
				case 'Q':
					q();
					break;
				case 'R':
					r();
					break;
				case 'S':
					s();
					break;
				case 'T':
					t();
					break;
				case 'U':
					u();
					break;
				case 'V':
					v();
					break;
				case 'W':
					w();
					break;
				case 'X':
					x();
					break;
				case 'Y':
					y();
					break;
				case 'Z':
					z();
					break;
				default:
					blank();
			}
			
			marker += 7;
		}
	}
	
	private void blank() {
		for(int i = 0; i < 7; i++) {
			for(int j = 0, m = marker; j < 7; j++, m++) {
				grid[i][m] = space;
			}
		}
	}
	
	private void a() {
		for(int i = 0; i < 7; i++) {
			for(int j = 0, m = marker; j < 7; j++, m++) {
				if((j != 0 && j != 6) && ((i == 3) || (i == 0 && j == 3) || (i == 1 && (j == 2 || j == 4) || (i >= 2 && (j == 1 || j == 5)))))
					grid[i][m] = special;
				else
					grid[i][m] = space;
			}
		}
	}
	
	private void b() {
		for(int i = 0; i < 7; i++) {
			for(int j = 0, m = marker; j < 7; j++, m++) {
				if((j != 0 && j != 6) && ((j == 1) || ((i % 3 == 0) && (j <= 4)) || ((i % 3 != 0) && (j == 5))))
					grid[i][m] = special;
				else
					grid[i][m] = space;
			}
		}
	}
	
	private void c() {
		for(int i = 0; i < 7; i++) {
			for(int j = 0, m = marker; j < 7; j++, m++) {
				if(j != 0 && j != 6 && (((i == 0 || i == 6) && j != 1) || (j == 1 && !(i == 0 || i == 6))))
					grid[i][m] = special;
				else
					grid[i][m] = space;
			}
		}
	}
	
	private void d() {
		for(int i = 0; i < 7; i++) {
			for(int j = 0, m = marker; j < 7; j++, m++) {
				if(j != 0 && j != 6 && ((((i == 0 || i == 6) && j < 5) || j == 1) || (j == 5 && !(i == 0 || i == 6))))
					grid[i][m] = special;
				else
					grid[i][m] = space;
			}
		}
	}
	
	private void e() {
		for(int i = 0; i < 7; i++) {
			for(int j = 0, m = marker; j < 7; j++, m++) {
				if(j != 0 && j != 6 && (j == 1 || i == 0 || i == 6 || (i == 3 && j <= 3)))
					grid[i][m] = special;
				else
					grid[i][m] = space;
			}
		}
	}
	
	private void f() {
		for(int i = 0; i < 7; i++) {
			for(int j = 0, m = marker; j < 7; j++, m++) {
				if(j != 0 && j != 6 && (j == 1 || i == 0 || (i == 3 && j <= 3)))
					grid[i][m] = special;
				else
					grid[i][m] = space;
			}
		}
	}
	
	private void g() {
		for(int i = 0; i < 7; i++) {
			for(int j = 0, m = marker; j < 7; j++, m++) {
				if(j != 0 && j != 6 && (((i == 0 || i == 6) && (j != 1 && j != 5)) || (j == 1 && !(i == 0 || i == 6)) || (j == 5 && (i == 4 || i == 5)) || (i == 3 && j >= 3)))
					grid[i][m] = special;
				else
					grid[i][m] = space;
			}
		}
	}
	
	private void h() {
		for(int i = 0; i < 7; i++) {
			for(int j = 0, m = marker; j < 7; j++, m++) {
				if(j != 0 && j != 6 && (j == 1 || j == 5 || i == 3))
					grid[i][m] = special;
				else
					grid[i][m] = space;
			}
		}
	}
	
	private void i() {
		for(int i = 0; i < 7; i++) {
			for(int j = 0, m = marker; j < 7; j++, m++) {
				if(j != 0 && j != 6 && (i == 0 || i == 6 || j == 3))
					grid[i][m] = special;
				else
					grid[i][m] = space;
			}
		}
	}
	
	private void j() {
		for(int i = 0; i < 7; i++) {
			for(int j = 0, m = marker; j < 7; j++, m++) {
				if(j != 0 && j != 6 && (i == 0 || (j == 3 && i <= 5) || (i == 6 && j == 2) || (i == 5 && j == 1)))
					grid[i][m] = special;
				else
					grid[i][m] = space;
			}
		}
	}
	
	private void k() {
		for(int i = 0; i < 7; i++) {
			for(int j = 0, m = marker; j < 7; j++, m++) {
				if(j != 0 && j != 6 && (j == 1 || (j == 5 && !(i > 1 && i < 5)) || (i == 3 && j <= 3) || (j == 4 && (i == 2 || i == 4))))
					grid[i][m] = special;
				else
					grid[i][m] = space;
			}
		}
	}
	
	private void l() {
		for(int i = 0; i < 7; i++) {
			for(int j = 0, m = marker; j < 7; j++, m++) {
				if(j != 0 && j != 6 && (i == 6 || j == 1))
					grid[i][m] = special;
				else
					grid[i][m] = space;
			}
		}
	}
	
	private void m() {
		for(int i = 0; i < 7; i++) {
			for(int j = 0, m = marker; j < 7; j++, m++) {
				if(j != 0 && j != 6 && (j == 1 || j == 5 || ((i < 3) && (i+1 == j || i + j == 5))))
					grid[i][m] = special;
				else
					grid[i][m] = space;
			}
		}
	}
	
	private void n() {
		for(int i = 0; i < 7; i++) {
			for(int j = 0, m = marker; j < 7; j++, m++) {
				if(j != 0 && j != 6 && (j == 1 || j == 5 || i == j))
					grid[i][m] = special;
				else
					grid[i][m] = space;
			}
		}
	}
	
	private void o() {
		for(int i = 0; i < 7; i++) {
			for(int j = 0, m = marker; j < 7; j++, m++) {
				if(j != 0 && j != 6 && (((i == 0 || i == 6) && j > 1 && j < 5)) || ((j == 1 || j == 5) && i > 0 && i < 6))
					grid[i][m] = special;
				else
					grid[i][m] = space;
			}
		}
	}
	
	private void p() {
		for(int i = 0; i < 7; i++) {
			for(int j = 0, m = marker; j < 7; j++, m++) {
				if((j != 0 && j != 6) && ((j == 1) || ((i % 3 == 0 && i < 6) && (j <= 4)) || ((i % 3 != 0 && i < 3) && (j == 5))))
					grid[i][m] = special;
				else
					grid[i][m] = space;
			}
		}
	}
	
	private void q() {
		for(int i = 0; i < 7; i++) {
			for(int j = 0, m = marker; j < 7; j++, m++) {
				if(j != 0 && j != 6 && (((i == 0 || i == 6) && j > 1 && j < 5)) || ((j == 1 || j == 5) && i > 0 && i < 6) || (i >= 4 && i == j+1))
					grid[i][m] = special;
				else
					grid[i][m] = space;
			}
		}
	}
	
	private void r() {
		for(int i = 0; i < 7; i++) {
			for(int j = 0, m = marker; j < 7; j++, m++) {
				if((j != 0 && j != 6) && ((i >= 4 && i == j+1)  || (j == 1) || ((i % 3 == 0 && i < 6) && (j <= 4)) || ((i % 3 != 0 && i < 3) && (j == 5))))
					grid[i][m] = special;
				else
					grid[i][m] = space;
			}
		}
	}
	
	private void s() {
		for(int i = 0; i < 7; i++) {
			for(int j = 0, m = marker; j < 7; j++, m++) {
				if(j != 0 && j != 6 && ((i == 0 && j > 1) || (i == 3 && j > 1 && j < 5) || (i == 6 && j < 5)) || ((j == 1 && (i == 1 || i == 2) || j == 5 && (i == 4 || i == 5))))
					grid[i][m] = special;
				else
					grid[i][m] = space;
			}
		}
	}
	
	private void t() {
		for(int i = 0; i < 7; i++) {
			for(int j = 0, m = marker; j < 7; j++, m++) {
				if(j != 0 && j != 6 && (i == 0 || j == 3))
					grid[i][m] = special;
				else
					grid[i][m] = space;
			}
		}
	}
	
	private void u() {
		for(int i = 0; i < 7; i++) {
			for(int j = 0, m = marker; j < 7; j++, m++) {
				if(j != 0 && j != 6 && ((i == 0 && (j == 1 || j == 5)) || (i == 6 && j > 1 && j < 5)) || ((j == 1 || j == 5) && i > 0 && i < 6))
					grid[i][m] = special;
				else
					grid[i][m] = space;
			}
		}
	}
	
	private void v() {
		for(int i = 0; i < 7; i++) {
			for(int j = 0, m = marker; j < 7; j++, m++) {
				if(j != 0 && j != 6 && ((i <= 3 && (j == 1 || j == 5) || (i > 3 && ((i-j == 3) || (i+j == 9))))))
					grid[i][m] = special;
				else
					grid[i][m] = space;
			}
		}
	}
	
	private void w() {
		for(int i = 0; i < 7; i++) {
			for(int j = 0, m = marker; j < 7; j++, m++) {
				if(j != 0 && j != 6 && (j == 1 || j == 5 || ((i > 3) && (i-1 == j || i + j == 7))))
					grid[i][m] = special;
				else
					grid[i][m] = space;
			}
		}
	}
	
	private void x() {
		for(int i = 0; i < 7; i++) {
			for(int j = 0, m = marker; j < 7; j++, m++) {
				if(j != 0 && j != 6 && (((i == 0 || i == 6) && (j == 1 || j == 5)) || (i == j) || (i + j == 6)))
					grid[i][m] = special;
				else
					grid[i][m] = space;
			}
		}
	}
	
	private void y() {
		for(int i = 0; i < 7; i++) {
			for(int j = 0, m = marker; j < 7; j++, m++) {
				if(j != 0 && j != 6 && ((i == 0 && (j == 1 || j == 5)) || (i <= 3 && (i == j || (i + j == 6))) || (i > 3 && j == 3)))
					grid[i][m] = special;
				else
					grid[i][m] = space;
			}
		}
	}
	
	private void z() {
		for(int i = 0; i < 7; i++) {
			for(int j = 0, m = marker; j < 7; j++, m++) {
				if(j != 0 && j != 6 && (i == 0 || i == 6 || (i + j == 6)))
					grid[i][m] = special;
				else
					grid[i][m] = space;
			}
		}
	}
	
	public void printWord() {
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[0].length; j++) {
				System.out.printf("%c ", grid[i][j]);
			}
			System.out.println();
		}
			
	}

}

public class Ques1 {
	 
	public static void main(String[] args) {
		
		String word = new String("iNeuron");
		LetterPattern pat = new LetterPattern(word, '*', ' ');
		pat.printWord();
		
	}
	
}
