package day04;
/*
���� 2]
	�� ���� �ֻ����� ������ ���� 6�� �Ǵ� ��츦 ����ϼ���.
*/

public class Ex02 {
	public Ex02() {
		sol();
	}
	public void sol() {
		for( int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) 
				if(i+j==6)
				System.out.println(i+"+"+j +" = " + 6);
			
		}			
		}	
		
	public static void main(String[] args) {
		new Ex02();
	}

}
