package day10;

public class Study {
	String name;
	int kor, eng, math, phys, cod;

	public Study() {}
	
	public Study(String name) {
		this.name = name;
		this.kor = (int)(Math.random()*(100-40+1)+40);
		this.eng = (int)(Math.random()*(100-40+1)+40);
		this.math = (int)(Math.random()*(100-40+1)+40);
		this.phys = (int)(Math.random()*(100-40+1)+40);
		this.cod = (int)(Math.random()*(100-40+1)+40);
	}
	public int getSum() {
		return kor + eng + math + phys + cod;
		
	}
	public double getAvg() {
		return getSum() / 5;
	}
	public void tpPrint() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		System.out.println(phys);
		System.out.println(cod);
		System.out.println(getSum());
		System.out.println(getAvg());
		
		for(int i=0; i<14; i++)
			System.out.print("-");
			System.out.println();
	}
	
	
		
	public static void main(String[] args) {
		
		
	}

}
