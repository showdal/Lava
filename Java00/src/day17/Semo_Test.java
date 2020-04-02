package day17;

import java.util.*;
public class Semo_Test {
	public Semo_Test() {
		

	ArrayList<Sagak> list = new ArrayList<Sagak>();
	for(int i = 0 ; i < 10 ; i++ ) {
		int no1 = (int) (Math.random()*16 + 5);
		int no2 = (int) (Math.random()*16 + 5);
		list.add(new Sagak(no1, no2));
		}
	for(Sagak s : list) {
		System.out.print(s.getArea() + " | ");
	}
	System.out.println();
	
	Collections.sort(list);
	for(Sagak s : list) {
		System.out.print(s.getArea() + " | ");
	}
	System.out.println();
	for(Sagak s : list) {
		System.out.print(s.getWidth() + " | ");
	}
	System.out.println();
	
	}
	public static void main(String[] args) {
		new Semo_Test();
	}
}