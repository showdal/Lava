package day13;

public class Won extends Figure {
	int re;
	
	@Override
	public double calcArea(int... a) {
		re = a[0];
		return re*re*3.14;
	}
	@Override
	public void toPrint() {
		System.out.println("반지름 : " + re + " 둘레 : " + (re*2*3.14) + " 넓이 : " + (re * re * 3.14));
	}



}
