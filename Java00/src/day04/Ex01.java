package day04;/*
연도를 입력받아 윤년 평년 판단하는 프로그램

*/
import java.util.*;
public class Ex01 {
	public Ex01() {
		sol();
	}
	public void sol() {
		Scanner sc = new Scanner(System.in);
		System.out.print("연도 : ");
		int year = sc.nextInt();
		String str = "평년";
		int code = 0;
		
		if((year % 4 == 0) && (year % 100 != 0)||(year % 400 == 0)) {
			code = 1;
		}
		
		switch(code) {
		case 1 : str = "윤년";
			break;
		}
		System.out.println(year + "년 : " + str);
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}
