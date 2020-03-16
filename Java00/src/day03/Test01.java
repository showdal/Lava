package day03;
import java.util.*;
/*
	제어명령
		=> 실행 순서 → ↓ 
		   실행 순서 바꿀 때 사용하는 명령
	
	1. 조건 제어 명령 : 특정 조건에 따라 실행 순서를 바꾸는 명령
		   
	종류]	
		1) if : 조건을 제시하고 그 조건에 맞는 경우에만 처리하는 조건문
			
		형식]
			if(조건식){
				실행문...
			}
			==> 조건식이 맞는 경우에만 실행문을 실행하고 
				맞지 않는 경우에는 실행문을 건너뛰는 방식
				
		2) if ~ else : 조건을 제시하고 조건에 맞는 경우와 맞지 경우 두가지를 처리하는 조건문
			
		형식]
			if(조건식){
				실행문1	<= 참
			} else {
				실행문2	<= 거짓
			}
			==> 조건식이 맞는 경우는 실행문1을 실행하고, 
				맞는 경우는 실행문2를 실행하는 방식
			
		3) if ~ else if ~ else : 조건을 두개 이상을 제시하고 각 조건에 맞는 경우를 처리하는 조건문
			
		형식]
			if(조건식1){
				실행문1
			} else if(조건식2){
				실행문2
			} else if(조건식3){
				실행문3
			...
					
			} else {
				실행문n
			}
			==> 조건식을 여러개를 제시해서 그 조건문에 맞는 실행문을 실행하는 조건문
				
			
		4) switch ~ case : 조건을 처리하는데 데이터를 여러개를 제시하고 
						   그 데이터에 맞는 경우 처리해주는 방법
		형식]
			switch(변수){
			case 데이터1:
				 실행문1;
				   break;
			case 데이터2:
				 실행문2;
				   break;
			...
			default:
				 실행문n;
			}
			==> 변수의 값이 일치하는 case 문의 실행문을 실행 처리하는 조건식		
				
				
	2. 반복 제어 명령 : 
	
				
				
 */
public class Test01 {
	public Test01() {
		sol1();
		sol2();
		sol3();
	}
//	예제] 숫자 두개를 입력받아서 큰 수에서 작은 수를 뺀 차를 출력하세요.
	public void sol1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("no1 : ");
		int no1 = sc.nextInt();
		System.out.print("no2 : ");
		int no2 = sc.nextInt();
		int no3 = no1 - no2;
		System.out.println(Math.abs(no3));
	}
	
	public void sol2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("no1 : ");
		int no1 = sc.nextInt();
		System.out.print("no2 : ");
		int no2 = sc.nextInt();
		
		int no3 = 0;
		int max = 0;
		int min = 0;
		
		if(no1 > no2) {
			max = no1;
			min = no2;
			no3 = no1 - no2;
		} else {
			max = no2;
			min = no1;
			no3 = no2 - no1;
		}
		System.out.println(max +"와"+ min +"차이 : "+ no3 );
	}
	
	public void sol3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("no1 : ");
		int no1 = sc.nextInt();
		System.out.print("no2 : ");
		int no2 = sc.nextInt();
		int no3 = 0;
		
		if(no2 > no1) {
			int max = no1;
			no1 = no2;
			no2 = max;
			no3 = no1 - no2;
		} else {
			no3 = no2 - no1;
		}
		System.out.println(no1 +"와"+ no2 +"차이 : "+ no3 );
	}
	
	
	public static void main(String[] args) {
		new Test01();

	}

}
