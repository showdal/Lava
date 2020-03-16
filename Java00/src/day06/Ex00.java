package day06;

public class Ex00 {
/*
  	1!,2!,3!,.... 팩토리얼 10개 구하기
 	
 
 */
	
	
	public static void main(String[] args) {
		for(int i = 1 ; i <= 10 ; i++ ) {
			int result = 1;
			for(int j = 1 ; j <= i; j++) {
				result = result * j;
			}
			
			System.out.print(result + ", ");
		}
	}

}
