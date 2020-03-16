package day02;

import java.util.*;
public class Test06 {
	
	/* 랜덤한 숫자 11-33 중 2개의 숫자를 추출하여
	   입력받는 숫자가 1이면 삼각형의 넓이를
	   2이면 사각형의 넓이를 구해주는 프로그램 작성 
	*/
	public Test06(){
		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형의 넓이는 1, 사각형의 넓이는 2를 입력 ");
		int code = sc.nextInt();
		int no1 = (int)(Math.random()*(33-11+1))+11;
		int no2 = (int)(Math.random()*(33-11+1))+11;
		System.out.println(no1 +"," + no2);

		
		String result = (code == 1) ? (""+tri(no1,no2)):
						(code == 2 ? (""+squ(no1,no2)):("null"));
		System.out.println(result);
	}
	
	public double tri (int no1, int no2){
		double area = no1 * no2 / 2;
		return area;
	}
	public double squ (int no1, int no2){
		double area1 = no1 * no2;
		return area1;
	}
	
	
	public static void main(String[] args) {
		new Test06();
	}
}



