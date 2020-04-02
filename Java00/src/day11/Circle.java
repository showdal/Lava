package day11;
/*
	문제1]
		이 클래스는 원의 정보를 저장할 클래스
		이 클래스가 객체가 될 때, 반지름을 입력받아서
		원에 대한 정보가 입력되도록 클래스를 정의하세요.
		
		반지름이 입력이 안 될 경우 10으로 입력되게 하세요.
 
 */
public class Circle {
	int r;
	double r2, rr;
	
	//기본 생성자함수
	public Circle() {
		this(10);
	}
	
	//생성자함수 오버로딩
	public Circle(int r) {
		this.r=r;
		this.r2=getR2(r);
		this.rr=getRr(r);
	} 
	public double getR2(int r) {
		return r*2*3.14;
	}
	public double getRr(int r) {
		return r*r*3.14;
	}
	public void toPrint() {
		System.out.println("반지름 : " + r + "\n둘레 : " + r2 + "\n넓이 : " + rr);
		System.out.println();
	}
}
