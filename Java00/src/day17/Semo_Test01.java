package day17;

import java.util.ArrayList;

public class Semo_Test01 {
	public Semo_Test01() {
		ArrayList<Semo> list = new ArrayList<Semo>();
		
		for(int i=0; i<10; i++) {
			int no1 = (int)(Math.random()*16 + 5);
			int no2 = (int)(Math.random()*16 + 5);
			list.add(new Semo(no1, no2));
		}
		for(int i = 0 ; i < list.size(); i++ ) {
			System.out.print(list.get(i).getArea() + " | ");
		}
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {

	}

}
