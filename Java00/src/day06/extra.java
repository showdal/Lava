package day06;

public class extra {
/*
 	1,1,2,3,5.....
 	�Ǻ���ġ ���� 10�� ���ϱ�
 	
 	
 */
	public static void main(String[] args) {
		
		int no1 = 1;
		int no2 = 1;
		int result;
		
		System.out.print(no1 + ", ");
        System.out.print(no2 + ", ");
		
		for(int i=1; i<=20; i++){
			result = no1+no2;
			no1=no2;
			no2=result;
			System.out.print(result + ", ");	
		} 
	}
}
