package day13.sub;

public class Samgak implements Moyang {
	private int wid;
	private int hei;
	private double area;
	
	public Samgak() {
		
	}
	
	public Samgak(int wid, int hei) {
		this.wid=wid;
		this.hei=hei;
		setArea();
	}
	
	@Override
	public void setArea() {
		area=wid*hei*0.5;

	}

	@Override
	public void toPrint() {
		System.out.printf("",wid,hei,area);
	}

}
