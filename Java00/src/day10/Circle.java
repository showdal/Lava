package day10;

public class Circle {
	int r;
	double r2;
	double rr;
	
	public void result(int no1){
		r = no1;
		r2 = no1*2*3.14;
		rr = no1*no1*3.14;
	}
		public void print() {
			System.out.println("반지름 : " + r + "\n둘레 : " + r2+ "\n넓이 : " + rr);
			System.out.println("----------------");
		}	
	public static void main(String[] args) {

		
	}
}
