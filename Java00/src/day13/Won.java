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
		System.out.println("������ : " + re + " �ѷ� : " + (re*2*3.14) + " ���� : " + (re * re * 3.14));
	}



}
