package day13;

import java.util.ArrayList;
import static java.lang.Math.*;

public class Arr {
	public Arr() {
		ArrayList list = new ArrayList();
	
	Figure f = null;
	for(int i=0; i<10; i++) {
		int cnt = (int)(random()*3+1);
		int no1 = (int)(random()*10+1);
		int no2 = (int)(random()*10+1);
		
		if (cnt == 1) {
			f = new Nemo();
			f.calcArea(no1,no2);
			f.toPrint();
		
		} else if (cnt == 2) {
			f = new Semo();
			f.calcArea(no1,no2);
			f.toPrint();
	
		} else if (cnt==3){
			f = new Won();
			f.calcArea(no1);
			f.toPrint();
		}
	}
}

	/*
	 * public Arr() { ArrayList list = new ArrayList(); ArrayList list2 = null;
	 * 
	 * for (int i = 0; i < 10; i++) { list2 = new ArrayList(); for(int j = 0 ; j < 2
	 * ; j++ ) { list2.add((int)(random()*10+1)); } int no = (int)(random()*3+1);
	 * Figure f = null; if (no == 1) { Nemo nemo = new Nemo();
	 * nemo.calcArea((int)list2.get(0),(int)list2.get(1)); f = nemo; } else if (no
	 * == 2) { Semo semo = new Semo();
	 * semo.calcArea((int)list2.get(0),(int)list2.get(1)); f = semo; } else if
	 * (no==3){ Won won = new Won(); won.calcArea((int)list2.get(0),
	 * (int)list2.get(1)); f = won; } list.add(f); } for(int i=0 ; i<list.size();
	 * i++ ) { Figure f = (Figure)list.get(i); f.toPrint(i); }
	 */
	public static void main(String[] args) {
		new Arr();
	}

}
