package day02;
/*
	생성자(Constructor)
	=> 클래스 멤버의 기본값을 세팅해주는 생성자 함수
	   반환값 없음
	   
	   자바가상머신은 생성자 함수를 만들지 않으므로
	   생성자를 지정해주는 것이 좋다.
	
	
	   public 클래스이름(){
		내용...
	   }
	   
	   
	   
	 비교연산자
	 => 변수나 상수의 크기는 비교하는 연산자
	 	
	 	동시 비교는 불가능
	 	(1<=no) & (no<=20)		<= 하나씩 비교해주어야 한다.
	 	
	 	
	 	
	 논리연산자
	 => &	두 조건 모두 참일 경우, 참
	  	|	두 조건 중 하나라도 참일 경우, 참
	  	!	참일 경우 거짓, 거짓일 경우 참
	  	
	 절삭 연산
	  	&&	선조건이 참일 경우만, 후조건을 실행
	  	||	선조건이 거짓일 경우만, 후조건을 실행
	  	
	 	
	 */	

public class Test04 {
	
	public Test04(){
		test1();
		test2();
	}
	
	public static void main(String[] args) {
		new Test04();
	}
	
	public void test1() {
	
		char ch1 = 'A';
		char ch2 = 97;
		System.out.println("97 : " + ch2);
		int no = ch1;
		
		ch2 = (char)(no + 3);

		System.out.println(ch2);
		System.out.println(ch1 < 'a');
	}
	
	public void test2(){
		boolean bool1 = false;
		boolean bool2 = true;
		
		System.out.println(bool1 & bool2);
		System.out.println(bool1 | bool2);
		System.out.println (!(bool1 & bool2));
		System.out.println(bool1 & bool2);
		System.out.println(bool1 & bool2);
		
		int no1 = 10;
		int no2 = 11;
		
		System.out.println((no1 > no2) && ++no1 == no2);
		System.out.println(no1);
		System.out.println((no1 < no2) && ++no1 == no2);
		System.out.println(no1);
		
		System.out.println(35&24);
	}
	
}
