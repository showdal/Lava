package day03;
import java.util.*;
/*
	문제2]
		전기 요금 계산 프로그램
		
				코드	기본요금	사용요금
		가정용	 1		 3800		 245
		산업용 	 2		 2400		 157
		교육용	 3	 	 2900	 	 169
		상업용	 4		 3200		 174
	
		전기요금 = 기본요금 + 사용량 * 사용요금
		
		사용자코드와 사용량을 입력받아 전기요금 계산 
 */
public class Ex03 {
	public Ex03() {
		sol();
	}
	public void sol() {
		Scanner sc = new Scanner(System.in);
		System.out.print("사용자코드 : ");
		int code = sc.nextInt();		
		
		if (code > 4 || code == 0) {
			System.out.println("오류");
			return; // 실행 종료 명령
		} else {
			
		}
		
		System.out.print("사용량 : ");
		int use = sc.nextInt();
		int money = 0;
		
		if (code == 1) {
			money = 2400 + use * 245;
			
		} else if (code ==2 ) {
			money = 2900 + use * 157;
			
		} else if (code ==3 ) {
			money = 3200 + use * 169;
			
		} else if (code ==4 ) {
			money = 3800 + use * 174;
		} else {
			
		}	
		
			
		System.out.println("사용요금 : " + money);
		
		
	}
	public static void main(String[] args) {
		new Ex03();


	}

}
