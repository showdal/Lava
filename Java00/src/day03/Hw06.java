package day03;


import java.util.*;
public class Hw06 {
	public Hw06() {
		sol6();
		
	}
	public void sol6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("³âµµ : ");
		int year = sc.nextInt();
		String result = (year%4!=0)?("Æò³â"):
						(year%100!=0)?("À±³â"):
						(year%400==0)?("À±³â"):("Æò³â");
		System.out.println(result);	
	}
	public static void main(String[] args) {
		new Hw06();
	}

}
