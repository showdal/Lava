package day04;
/*
 	문제5
 	1-2+3-4+5-6.....n > 100
 	n값과 결과값 출력하는 프로그램
 	


 */
public class Ex05 {
	public Ex05() {
		sol();
	}
	public void sol() {
		int i = 1;
		int sum = 0; 
		
		for(i=1; ; i++) {
				sum = (i%2==0) ? (sum-i) : (sum+i) ;
				if(sum >= 101) {
					System.out.println("n = " + i + ", 합계 = " +sum);
					break;
				}
		}
	}
	public static void main(String[] args) {
		new Ex05();
	}

}
