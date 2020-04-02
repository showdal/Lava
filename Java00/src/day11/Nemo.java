package day11;

public class Nemo extends Dohyung {
	int garo;
	int sero;
	double arround;
	
	public Nemo(){
		this(5,5);
	}
	public Nemo(int sero, int garo){
		this.garo=garo;
		this.sero=sero;
		setArea();
		setArround();
	}
	public void setArround(){
		arround = (garo + sero) * 2;
	}
	public void setArea(){
		area =  garo * sero;
	}
	public void toPrint(){
		System.out.println("가로 : "+garo+"\n세로 : "+sero+"\n둘레 : "+ arround +"\n넓이 : "+ area);
	}

}
