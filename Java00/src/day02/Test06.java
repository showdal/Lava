package day02;

import java.util.*;
public class Test06 {
	
	/* ������ ���� 11-33 �� 2���� ���ڸ� �����Ͽ�
	   �Է¹޴� ���ڰ� 1�̸� �ﰢ���� ���̸�
	   2�̸� �簢���� ���̸� �����ִ� ���α׷� �ۼ� 
	*/
	public Test06(){
		Scanner sc = new Scanner(System.in);
		System.out.print("�ﰢ���� ���̴� 1, �簢���� ���̴� 2�� �Է� ");
		int code = sc.nextInt();
		int no1 = (int)(Math.random()*(33-11+1))+11;
		int no2 = (int)(Math.random()*(33-11+1))+11;
		System.out.println(no1 +"," + no2);

		
		String result = (code == 1) ? (""+tri(no1,no2)):
						(code == 2 ? (""+squ(no1,no2)):("null"));
		System.out.println(result);
	}
	
	public double tri (int no1, int no2){
		double area = no1 * no2 / 2;
		return area;
	}
	public double squ (int no1, int no2){
		double area1 = no1 * no2;
		return area1;
	}
	
	
	public static void main(String[] args) {
		new Test06();
	}
}



