package day04;

/*	(��ø�� �ݺ������� ó��)
	2 ~ 100������ �� �� 
	�Ҽ��� ������ִ� ���α׷��� �ۼ��ϼ���.
	
	�Ҽ� : 1�� �ڱ��ڽ����θ� ������ �ִ� ��
 */
public class Hw03 {

	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i=2; i<=100; i++) {
			for(int j=2; j<=i; j++) {
				if(i%j==0) {
					count++;
				}}
					if(count==1) {
						System.out.print(i + ", ");						
				} count=0;
				
				
		}
	
		a:
		for(int i = 2 ; i <= 100; i++) {
			
			// ������ �ִ� ���� �ִ��� �˻�
			for(int j = 2; j < i; j++ ) {
				if(i % j == 0) {
					continue a;
				}
			}
			String mk = ", ";
			if(i == 2) {
				mk = "";
			}
			System.out.print(mk + i);
			System.out.print(mk + i);
			
		}
	}
}

