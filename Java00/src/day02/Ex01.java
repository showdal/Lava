package day02;

import java.util.*;
public class Ex01 {
	
/*
	문제1]
	3자리 숫자를 입력받거나 랜덤하게 추출한 후,
	백 이하 숫자를 버린 백의 자리만 출력하세요.
	
	문제2]
	0-255 사이의 숫자를 랜덤하게 만들고
	그 숫자를 코드값으로 하는 문자를 만들어서
	해당 문자가 영문자인지 아닌지 판별해서 출력
	삼항 연산자 사용
	
	문제3]
	화씨온도 100도는 섭씨온도 몇도인지 알아보는 프로그램
	섭씨 = 5/9 * (화씨 - 32)
	화씨 = (섭씨 + 32)*9/5
	
	문제4]
	소수형 숫자를 입력한 후, 소수점 셋째자리에서 반올림한 결과를 출력하세요.
	+0.005
	
	문제5]
	10-99사이의 랜덤 숫자를 출력하여 그 숫자가 가까운 10의 배수와의 차이를 구하세요.
	+5 => %
	
	문제6]
	임의의 연도를 입력받아 해당 연도의 윤년, 평년을 판별하는 프로그램
	삼항 연산자
	4로 나눠떨어지고 100으로 나눠 떨어지지 않고
	400으로 나눠지는 해를 윤년이라고 함.
*/
	public Ex01() {
//		sol1();
//		sol2();
		sol3();
//		sol4();
//		sol5();
//		sol6();
		}
	
	public void sol1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("3자리 숫자 : ");
		int num1 = sc.nextInt();
		int result1 = num1 - (num1 % 100);
		System.out.println(result1);
		
		int no1 = (int)(Math.random()*(999-100+1))+100;
		System.out.println("랜덤 : " + no1);
		int result2 = no1 - (no1 % 100);
		System.out.println(result2);		
	}
	
	public void sol2() {
		System.out.print("1-255사이의 숫자 : ");
		int num2 = 0;
		char ch1 = (char)num2;
		num2 = (int)(Math.random()*(255-0+1))+0;
		System.out.println(num2);
		String result2 = (ch1 >= 'A' & ch1 <= 'Z') ?  ("영문자입니다.") : (ch1 >='a' & ch1 <='z') ? ("영문자입니다.") :("영문자가아닙니다.") ; 
		System.out.println(ch1 +"은 "+ result2);
	}
	
	public void sol3() {
		double num3 = 100.;
		double num4 = (num3 - 32) * 5/9f;
		System.out.println("화씨 100도 : " + num4);
	}
	
	public void sol4() {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("소수 입력 : ");
		double num5= sc1.nextDouble();
		double result3 = ((num5 + 0.005) * 100.);
		int result4 = (int) result3;
		double result5 = (double) result4/100. ; 
		System.out.println(result5);
		
	}
	public void sol5() {
		int no5 = 0;
		int num5 = 0;
		no5 = (int)(Math.random()*(99-10+1))+10;
		System.out.println("랜덤 : " + no5);
		num5 = no5-((no5 + 5)/ 10)*10;
		
		System.out.println(Math.abs(num5));
		
	}
	public void sol6() {
		Scanner sc2 = new Scanner(System.in);
		System.out.print("연도 : ");
		int no6 = sc2.nextInt();
		String result6 = ((no6%4==0) && (no6%100!=0) || (no6%400==0))
							? ("윤년"):("평년");
		System.out.println(result6);
		
		
	}
	public static void main(String[] args) {
		new Ex01();

	}

}
