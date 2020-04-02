package day11;

public class Semo extends Dohyung {
	int garo, sero;
	
	public Semo(){
		this(5,5);
	}
	public Semo(int sero, int garo){
		this.garo=garo;
		this.sero=sero;
		setArea();
	}
	public void setArea(){
		area =  garo * sero / 2;
	}
	public void toPrint(){
		System.out.println("πÿ∫Ø : "+garo+"\n≥Ù¿Ã : "+sero+"\n≥–¿Ã : "+area);
	}

}
