package day03;

import java.util.*;
public class Hw04 {
	public Hw04() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�Ǽ� : ");
		double num = sc.nextDouble();
		double result = ban(num);
		System.out.println(num + "�� �ݿø� " +result);
	}
		
	public double ban(double no) {	
		double result = 0.;
		int no1 = (int)(no*1000);
		no1 += 5;
		result = (no1 / 10) / 100.;
	
		
		return result;
	}
	
	public static void main(String[] args) {
		new Hw04();

	}

}
