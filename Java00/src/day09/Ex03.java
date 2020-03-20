package day09;

/*
 * 문제 2]
		1차 배열에 10개의 데이터를 입력한 후
		총점과 평균을 구하는 프로그램을 작성하세요.
		단, 입력, 총점계산, 평균계산, 출력은 함수로 처리하세요.

*/
public class Ex03 {
	int [] d = {10,30,25,100,56,70,80,86,95,98}; 
	
	public Ex03() {
		int no1 = data();
		int no2 = sum();
		double no3 = avg();
		
		re(no1,no2,no3);
	}
	public int data() {
		int a = 0;
		System.out.print("점수 데이터 : ");
		for(int i=0; i<10; i++) {
			a = d[i];
			System.out.print(a + ", ");
		}
		return a;
	}
	
	public int sum() {
		int b = 0;
		for(int i=0; i<10; i++) {
			b += d[i];
		}
		return b;
	}
	public double avg() {
		double b= sum();
		double c = b/10;

		return c;
	}
	public void re(int re1, int re2, double re3) {
		
//		System.out.println("점수 데이터 : "+re1);
		System.out.println();
		System.out.println("총점 : "+re2);
		System.out.println("평균 : "+re3);
		
	}
	
	public static void main(String[] args) {
		new Ex03();
	}

}
