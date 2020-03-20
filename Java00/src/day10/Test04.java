package day10;


/*

문제 1]
	
	원의 반지름, 둘레, 넓이를 저장할 클래스를 만들고
	그 클래스 객체 10개를 배열로 관리할 배열을 만들어서
	각 멤버를 초기화하고
	출력하세요.
	
문제 2 ]
	
	10개의 과목의 점수를 입력할 배열을 만들고
	그 배열에 담긴 점수의
	총점, 평균을 구해서 출력해주는 프로그램을 작성하세요.
	단, 입력, 총점계산, 평균계산, 출력은 함수를 제작해서 처리하세요.
	
문제 3 ]
	
	학생의 이름, 국어, 영어, 수학, 물리, 코딩 과목의 점수를 저장하고
	총점, 평균을 계산해서 입력할 클래스를 제작하세요.
	단, 입력, 총점계산, 평균계산, 출력은 함수를 만들어서 처리하세요.
	그리고 5명의 학생을 배열로 만들어서 과목 점수, 이름을 입력해서
	출력하세요.
				
		
 */
public class Test04 {
	Circle[] round;
	Grade[] score;
	
	
	
	
	
	public void grade() {
		score = new Grade[10];
		
	}
	
/*	
	
	public void round() {
		round = new Circle[10];
		
		for(int i=0; i<round.length; i++) {
			round[i] = new Circle();
			
			int r = (int)(Math.random()*(100-(-100)+1)-100);
			round[i].result(r);
		}
	}
	*/
	
	
	public static void main(String[] args) {
		Test04 t = new Test04();
		Grade t2 = new Grade();
		
/*		
		t.round();
		for(int i=0; i<t.round.length; i++) {
			t.round[i].print();
		}
		System.out.println();
		
*/		
		t2.result();
		t2.setAvg();
		t2.setSum();
		t2.print();
		System.out.println();
		
		
		
		
		
		}
}
