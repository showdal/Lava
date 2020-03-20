package day09;
/*
 * 문제 1]
		반지름을 랜덤하게 발생해서 - 함수로...
		그 반지름을 입력하면 
		원의 넓이를 구해주는 함수와
		원의 둘레를 구해주는 함수를 제작하고
		실행해서 출력하세요.
		*/

public class Ex02 {
	int r;

	
	public Ex02 (){
		int a = sol1();
		double a2 = sol2();
		double a3 = sol3();
		
		re(a, a2, a3);
	}
	
	public int sol1() {
	r = (int)((Math.random()*100)+1);
		return r;
		
	}
	public double sol2() {
		double r2 = r*2*3.14;
		return r2;
	}
	public double sol3() {	
		double rr = r*r*3.14;
		return rr;
	}	

	public void re(int no1 , double no2 , double no3) {
		
		System.out.println("원의 반지름 : " + no1);
		System.out.printf("원의 둘레 : %.2f\n" , no2);
		System.out.println("원의 넓이 : " + no3);
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
