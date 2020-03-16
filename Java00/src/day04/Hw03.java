package day04;

/*	(중첩된 반복문으로 처리)
	2 ~ 100까지의 수 중 
	소수만 출력해주는 프로그램을 작성하세요.
	
	소수 : 1과 자기자신으로만 나눌수 있는 수
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
			
			// 나눌수 있는 수가 있는지 검사
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

