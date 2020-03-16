package day02;

public class Test02 {
	/*
	
	
		클래스 멤버에는 변수와 함수가 있는데
		기본형 멤버 변수는 자동 초기화 된다.
		
			int ==> 0
			char ==> ' '
			boolean ==> false
			float ==> 0.0f
			double ==> 0.0
	*/
	
	
	
	int no;
	
	public static void main(String[] args) {
//		int num = no + 1;
		Test02 t2 = new Test02();
		t2.abc();
		System.out.println("Test02.no : " + t2.no);
//		abc();
	}
	
	public void abc() {
		System.out.println("************");
	}

}
