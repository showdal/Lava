package day04;

/*
	반복문을 사용해서 다음 모양을 출력하세요.
		
		
		
		1-0.
			*****
			*****
			*****
			*****
			*****
		

		
		1. 
			*
			**
			***
			****
			*****
		
		2.
			    *
			   **
			  ***
			 ****
			*****
		
		3. 
			*****
			****
			***
			**
			*
		
		4. 
			*****
			 ****
			  ***
			   **
			    *
			    
		5. 
			    *
			   ***
			  *****
			 *******
			*********
			
		6.
			    *
			   ***
			  *****
			 *******
			*********
			 *******
			  *****
			   ***
			    *
		
		7-0.
			    12345
			    12345
			    12345
			    12345
			    
		7-1.
				1  2  3  4  5
				6  7  8  9  10
				11 12 13 14 15
				16 17 18 19 20
				21 22 23 24 25
		
		7.
			1
			12
			123
			1234
			12345
			
		8.
			    1
			   12
			  123
			 1234
			12345
			
		9.
			12345
			1234
			123
			12
			1
			
		10.
			1
			2  3
			4  5  6
			7  8  9  10
			11 12 13 14 15

		
		00. 
			1  1  1  1  1
			2  2  2  2  2
			3  3  3  3  3
			4  4  4  4  4
			5  5  5  5  5 
		
		
		00 - 01. ==> 반복문 중첩해서...
		
			1  1  1  1  2
			2  2  2  3  3
			3  3  4  4  4
			4  5  5  5  5
			6  6  6  6  6
				
		11.
			2 x 1 = 2 	3 x 1 = 3 	...		9 x 1 = 9
			...
			2 x 9 = 18	3 x 9 = 27	...		9 x 9 = 81
		
		12.
			
			A B C D E
			F G H I J
			K L M N O
			P Q R S T
			U V W X Y
		
		13.
			
			A
			B C
			D E F
			G H I J
			K L M N O
		
		
		14.
			
			1	6	11	16	21
			2	7	12	17	22
			3	8	13	18	23
			4	9	14	19	24
			5	10	15	20	25
			
		15.
			A	F	K	P	U
			B	G	L	Q	V
			C	H	M	R	W
			D	I	N	S	X
			E	J	O	T	Y
			
						
						
		
 */
public class Hw99 {
	public Hw99() {
//		sol1_0();
//		sol1();
//		sol2();
//		sol3();
//		sol4();
//		sol5();
//		sol7_0();
//		sol7_1();
//		sol7();
//		sol8();
//		sol9();
//		sol10();
		sol10_1();
//		sol0_0();
//		sol0_1();	
//		sol11();
//		sol12();
//		sol14();
		sol16();
		
		
		
	
	}
	public void sol1_0() {
		for(int i=0; i<5; i++) {
			String a = "*****";				
			System.out.println(a);
			}
	}
	public void sol1() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}	System.out.println();
	}
}
	public void sol2() {
		System.out.println("------------ pengsoon Code -----------");
		for(int i=0; i<=5; i++) {
			for(int j=5; j>=0; j--) {
				if(i<=j) {
				System.out.print(" ");
				} else {
				System.out.print("*");
				}
			} System.out.println();
		}

		System.out.println("------------ Teacher Code -----------");
		
		for(int i=0; i<5; i++) {
			String a = " ";
			for(int j = 0; j<5; j++) {
				if( j >= (4-i)) {
					a = "*";
				}
				System.out.print(a);
			} 
			System.out.println();
		}
	}	
	
	public void sol3() {
	for(int i=5; i>0; i--) {
		for(int j=i; j>0 ; j--) {
			System.out.print("*");
		}	System.out.println();
	}
}
	
	public void sol4() {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5 ; j++) {
				if(j>=i) {
					System.out.print("*");					
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public void sol5() {
		for(int i=0; i<=5; i++) {
			String str = "*";
			for(int j=0; j<=i+3; j++) {
				if(j>=5-i) {
				System.out.print(str);				
				} else {
				System.out.print(" ");
				}
			} System.out.println();
		}
	}	
	
	public void sol7_0() {
		for(int i=0; i<5; i++) {
			int a = 0;	
			for(int j=0; j<5; j++) {
				a = a+1;
				System.out.print(a);
			}
		}
	}
	public void sol7_1() {
		int a = 0;
		for(int i=0; i<5; i++) {	
			for(int j=0; j<5; j++) {
				a = a+1;
				System.out.printf("%3d", a);
			}
			System.out.println();	
		}	
	}
	
	public void sol7() {
		for(int i=0; i<5; i++) {
			int a = 0;
			for(int j=0; j<=i; j++) {
				a = a+1;
				System.out.print(a);
			}	System.out.println();
		}	
	}	
	
	public void sol8() {
		for(int i=1; i<=5; i++) {
			for(int j=4; j>=0; j--) {
				if(j>=i) {
				System.out.print(" ");
				} else {
				System.out.print(i-j);
				}
			} System.out.println();
		}
		
		for(int i=0; i<=5; i++) {
			int a = 0;			
			for(int j=5; j>i; j--) {
			System.out.print(" ");
			}
			for(int k=0; k<i; k++) {
			a= a+1;
			System.out.print(a);
			}
			System.out.println();
		} 
	}
	
	public void sol9() {
		for(int i=5; i>0; i--) {
			for(int j=1; j<=5; j++) {
				if(j>i) {
				System.out.print(" ");
				} else {
				System.out.print(j);
				}
			} System.out.println();
		}
	}	

	public void sol10() {
		int a = 0;
		for(int i=1; i<=5; i++) {
			for(int j=0; j<i; j++) {
				a = a+1;
				if(a<10) {
					System.out.print(a + "  ");
				}
				else {
					System.out.print(a+" ");
				}
			} System.out.println();
		}

		int no = 1;
		int i = 0;
		while(i<5) {
			int j=0;
			while (j<=i) {
				System.out.printf("%3d",no++);
				j++;	
			}
			System.out.println();
			i++;
		}
	}
	
	public void sol10_1() {
		for (int i=0; i<5; i++) {
			int no = 1;
			for (int j=0; j<=i; j++) no =+j;
			for (int j=0; j<=i; j++) {
				System.out.printf("%3d",no+j);
			}
			System.out.println();
		}
		
	}

	
	public void sol0_0() {
		for(int i=1; i<=5; i++) {
			for(int j=0; j<5; j++) {
			System.out.print(i);
			} 
			System.out.println();
		} 		
	}
	
	public void sol0_1() {
		for(int i=1; i<=5; i++) {
			for(int j=5; j>0; j--) {
				if(j>i) {
					System.out.print(i);							
				} else {
					System.out.print(i+1);							
				}
			}
			System.out.println();
		}	
	}		

	public void sol11() {
		int b = 1;
		for(int i=2; i<=10; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j + "x" + b + " ");
			}
			b = b+1;
			System.out.println();
	}	
}
	public void sol12() {
		
		
		
		
	}
		
	public void sol14() {
		for(int i=1; i<=5; i++) {
			for(int j=0; j<5; j++) {
			System.out.print(i + " ");
			i = i+5;
			for(j=2; ; j++) {
				
			}
		}
		System.out.println();;
	}	
}
	public void sol16() {
		for() {
			
			
			
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		new Hw99();
	}
}



