package day04;

import java.util.*;

/*
	두 수를 입력받은 후
	두 수의 최소공배수를 구해서 출력해주는 프로그램을 작성하세요.
	
	최소공배수 : 두 수로 나누어 떨어지는 가장 작은 수
 */
public class Hw02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int no1 = sc.nextInt();
		System.out.print("숫자 입력 : ");
		int no2 = sc.nextInt();
		sc.close();
		int no3 = Math.min(no1, no2);
		
		for(int i=no3; i>0; i--) {
				if(no1%i==0&&no2%i==0) {
				} 
				System.out.println("최소공배수 : " + (no1*no2)/i);
				break;	
	}
	}
}
