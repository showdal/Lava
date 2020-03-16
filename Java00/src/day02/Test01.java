package day02;

import java.util.*;
public class Test01 {
	
	/*
	 	자바의 토큰 구분
	 	=> 컴파일러는 토큰 단위로 번역, 명령 종료 기호 = ; = }
	 	
	 	
	 	데이터를 입력받아 사용하는 방법
	 	1. 클래스 구문 전에
	 	=> import java.util.*;			모든 패키지
	 	=> import java.util.Scanner;		패키지내의 Scanner클래스만
	 	
	 	2. 프로그램 내부에서
	 	=> Scanner sc = new Scanner(System.in);		입력받을 준비
	 	
	 	3. 
	 	=> 변수 = sc.nextXxxx();		입력 / Camel표기법
	 	=> 문자열 = sc.nextLine();	
	 	=> 정수 = sc.nextInt();	
	 	=> 실수 = sc.nextFloat();
	 	   Integer.parseInt();			숫자 => 문자열
ㄴ
	 */

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("정수를 입력하세요! : ");
		 String str = sc.nextLine();
		 int num = Integer.parseInt(str);
		 int result = num -50;
		 System.out.println(num + "에서 50을 뺀 수는 " + result);
		 
	
		 System.out.print("정수를 입력하세요! : ");
		 String str7 = sc.nextLine();
		 int e = 0;
		 System.out.println( str7 + "의 이진수 : " + Integer.toBinaryString(e));
		 
		 
//		 원의둘레,넓이 삼사각형 넓이
		 System.out.print("원의 반지름 : ");
		 String str1 = sc.nextLine();
		 double r = Integer.parseInt(str1);
		 double round1 = 2*r*3.14;
		 System.out.println("원의 둘레 : " + round1);
		 double round2 = r*r*3.14;
		 System.out.println("원의 넓이 : " + round2);
		 
		 
		 System.out.print("삼각형의 밑변 : ");
		 String str3 = sc.nextLine();
		 System.out.print("삼각형의 높이 : ");
		 String str4 = sc.nextLine();
		 double a = Integer.parseInt(str3);
		 double b = Integer.parseInt(str4);
		 double tri = a * b / 2;
		 System.out.println("삼각형의 넓이 : " + tri);
		 
		 
		 System.out.print("사각형의 밑변 : ");
		 String str5 = sc.nextLine();
		 System.out.print("사각형의 높이 : ");
		 String str6 = sc.nextLine();
		 double c = Integer.parseInt(str5);
		 double d = Integer.parseInt(str6);
		 double squ = c * d;
		 System.out.println("사각형의 넓이 : " + squ);

	}

}
