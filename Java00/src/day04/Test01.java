package day04;
/*
연도를 입력받아 윤년 평년 판단하는 프로그램

*/
import java.util.*;
public class Test01 {
	public Test01() {
		sol();
		
		
	}
	public void sol() {
		Scanner sc = new Scanner(System.in);
		System.out.print("연도 : ");
		int year = sc.nextInt();
		String str = "평년";
		
		if(year % 400 == 0) {
			str = "윤년";
		} else if(year % 100 == 0) {
//			str = "평년";
		} else if(year % 4 == 0){
			str = "윤년";
		} //else {
//			str = "평년";
//		}
//		
		System.out.println(year + "년 : " + str);
	}
	public static void main(String[] args) {
		new Test01();

	}

}
