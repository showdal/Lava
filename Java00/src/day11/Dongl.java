package day11;

public class Dongl extends Dohyung {
	int rad;
	double arround;
	
	public Dongl(){
		this(10);
	}
	public Dongl(int rad){
		this.rad=rad;
		setArround();
		setArea();
	}
	public void setArround(){
		arround = rad * 2 * 3.14;
	}
	public void setArea(){
		area = rad * 2 * 3.14;
	}
	public void toPrint(){
		System.out.println("반지름 : "+rad+"\n둘레 : "+arround+"\n넓이 : "+area);
	}

}
