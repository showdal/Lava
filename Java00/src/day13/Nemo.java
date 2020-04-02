package day13;

public class Nemo extends Figure {
	private int garo, sero;
	
	@Override
	public double calcArea(int... a) {
		garo = a[0];
		sero = a[1];
		return garo * sero;
	}
	@Override
	public void toPrint() {
		System.out.println("가로 : " + garo + " 세로 : " + sero + " 넓이 : " + (garo * sero));
	}


}
