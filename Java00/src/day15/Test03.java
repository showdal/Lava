package day15;

import java.util.*;
public class Test03 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		for(int i=0; i<3; i++) {
			int rnd = ran.nextInt(100);
			boolean bRnd = ran.nextBoolean();
			System.out.println(rnd + " " + bRnd);
		}
		System.out.println();
		
		
		Random r1 = new Random(10);
		for(int i=0; i<3; i++) {
			int rnd = r1.nextInt(100);
			boolean bRnd = r1.nextBoolean();
			System.out.println(rnd + " " + bRnd);
		}
		
		
		
	}

}
