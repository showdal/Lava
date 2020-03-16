package day04;
/*
	문제4]
	5자리 정수를 입력받아 회문수를 판별하는 프로그램
	
	12321
	
	문자열.charAt(위치값) - 문자열의 특정위치의 문자를 반환해주는 함수
 	문자열.toCharArray() - 문자열을 문자배열로 반환해주는 함수
 */
import java.util.*;
public class Ex04 {
	public Ex04() {
		sol();
	}
	public void sol() {
		Scanner sc = new Scanner(System.in);
		String str = "";
		String str2 = "";
		System.out.print("5자리 정수 : ");
		str = sc.nextLine();
		
		
		
		for( int i=str.length()-1; i>=0; i--) {
			str2 += str.charAt(i);
			}	
			if(str.equals(str2)) {
				System.out.println("회문수ㅇㅇ");
			}else {
				System.out.println("회문수ㄴㄴ");
			}		
	}
	public static void main(String[] args) {
		new Ex04();
	
	for(;;) {
		// 메세지 출력하고
		System.out.print("다섯자리 숫자를 입력하세요! : ");
		Scanner sc1 = new Scanner(System.in);
		// 결과값을 담을 변수를 만든다.
		String msg = "회문수 ] ";
		// 문자열로 입력받고 변수에 담고
		
		String str = sc1.nextLine();
		
		if(str.equals("q")) break;
		/*
			블럭 안의 내용이 명령문 하나일 경우는 
			블럭기호({}) 를 생략하고 명령문을 바로 기술할 수도 있다.
		 */
		
		// 반복해서 비교하고 ( 12321 ) -> 1, 2
		for(int i = 0 ; i < str.length() / 2 ; i++ ) {
			// 문자열중 문자를 첫 문자부터 꺼내서 뒤에서부터 문자와 비교한다
			if(str.charAt(i) != str.charAt((str.length() - 1) - i)) {
				// 이 경우는 두 문자가 다른 경우이므로 회문수가 아닌 경우다.
				msg = "회문수 ]가 아니";
				break;
			}
			// 이 경우는 두문자가 같은 경우이므로 다음 문자를 꺼내서 비교해야 겠다.
		}
		// 결과 출력하고
		System.out.println("입력한 숫자 [ " + str + " ] 는 [ " + msg + "다." );
	}
}
}
