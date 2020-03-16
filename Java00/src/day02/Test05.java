package day02;

import java.util.Scanner;

/**
 * 랜덤 숫자 테스트용 클래스
 * 
 * @author	show
 * @since	2020.03.10
 * @version	v.1.0
 * @see
 * 
 * 			변경이력
 * 				2020.03.10 - 클래스 제작 - 담당자 : show
 * 
 */
public class Test05 {
	/*
		랜덤 수 추출 방법
		
		Math 클래스 random() 함수는 0보다 크거나 같고 1보다 작은 실수를 반환한다.
		
	(int)(Mate.random() * 최대값 - 최소값 + 1)) + (최소값);
	 */
	public Test05(){
		test1();
		
	}
	public void test1(){
		int num = (int)(Math.random()*(10-1+1))+1;
		String msg = (num % 2 == 0)?(num +" : 짝수"):(num + " : 홀수");
		System.out.println(msg);	
	}
	
	
	public static void main(String[] args) {
		new Test05();

	}

}
