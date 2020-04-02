package day10;
/*

문제4]
	학생의 점수를 입력하면 총점을 계산해주는 프로그램
	
	심화]
		랜덤하게 인수를 만들고
		그 인원수 만큼 점수를 랜덤하게 만들어서
		함수를 실행하게 하세요.
		
홈워크]
	학생의 이름, 국어, 영어, 수학, 물리, 코딩 점수를 관리하는 클래스를 제작하고
	학생의 데이터를 준비된 만큼만 입력해서
	전체 총점, 전체 평균을 구하는 프로그램을 작성하세요.
	
	
*/
public class Ex01 {
	int score[];
	int sum;
	
	public Ex01() {
		score();
		sum();
		print();
	}
	public void score(){
		int data[] = score;
		for(int i=0; i<score.length; i++) {
			data[i] = (int)(Math.random()*(100-1+1)-1);
		}
	}
	public void sum() {
		int total = 0;
		 
		for(int i = 0 ; i < score.length ; i++ ) {
			total += score[i];
		}
		sum = total;
	}
	public void print() {
		System.out.println(sum);
		
	}
	
	
	
	
	public static void main(String[] args) {
		Ex01 t = new Ex01();
		
		t.score();
		t.sum();
	}

}
