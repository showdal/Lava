package day03;


import java.util.*;
public class Hw06 {
	public Hw06() {
		sol6();
		
	}
	public void sol6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵ : ");
		int year = sc.nextInt();
		String result = (year%4!=0)?("���"):
						(year%100!=0)?("����"):
						(year%400==0)?("����"):("���");
		System.out.println(result);	
	}
	public static void main(String[] args) {
		new Hw06();
	}

}
