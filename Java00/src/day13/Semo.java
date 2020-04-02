package day13;

public class Semo extends Figure {
	private int wid, hei;

	@Override
	public double calcArea(int... a) {
		wid = a[0];
		hei = a[1];
		return wid * hei * 0.5;
	}

	@Override
	public void toPrint() {
		System.out.println("πÿ∫Ø : " + wid + " ≥Ù¿Ã : " + hei + " ≥–¿Ã : " + (wid * hei * 0.5));
	}

}
