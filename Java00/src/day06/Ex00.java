package day06;

public class Ex00 {
/*
  	1!,2!,3!,.... ���丮�� 10�� ���ϱ�
 	
 
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
