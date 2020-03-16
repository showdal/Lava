package day03;
import java.util.*;
/*
	문제3]
		부서번호를 입력하면
		부서이름을 출력해주는 프로그램
		
		10 - 총무
		20 - 회계
		30 - 영업
		40 - 기술
		그 외 - 다음 기회

	
 */
public class Ex04 {
	public Ex04() {
		sol();
	}
	public void sol() {
		Scanner sc = new Scanner(System.in);
		System.out.print("부서번호 : ");
		int num = sc.nextInt();	
		String name = ""; 
		
		if (num == 10) {
			name = "총무부";
			
		} else if (num ==20 ) {
			name = "회계부";
			
		} else if (num ==30 ) {
			name = "영업부";
			
		} else if (num ==40 ) {
			name = "기술부";
		} else {
		}	
		
		System.out.println("부서이름 : " + name);		
	}
	public static void main(String[] args) {
		new Ex04();

	}

}
