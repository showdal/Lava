package day02;

import java.util.*;
public class Ex01 {
	
/*
	����1]
	3�ڸ� ���ڸ� �Է¹ްų� �����ϰ� ������ ��,
	�� ���� ���ڸ� ���� ���� �ڸ��� ����ϼ���.
	
	����2]
	0-255 ������ ���ڸ� �����ϰ� �����
	�� ���ڸ� �ڵ尪���� �ϴ� ���ڸ� ����
	�ش� ���ڰ� ���������� �ƴ��� �Ǻ��ؼ� ���
	���� ������ ���
	
	����3]
	ȭ���µ� 100���� �����µ� ����� �˾ƺ��� ���α׷�
	���� = 5/9 * (ȭ�� - 32)
	ȭ�� = (���� + 32)*9/5
	
	����4]
	�Ҽ��� ���ڸ� �Է��� ��, �Ҽ��� ��°�ڸ����� �ݿø��� ����� ����ϼ���.
	+0.005
	
	����5]
	10-99������ ���� ���ڸ� ����Ͽ� �� ���ڰ� ����� 10�� ������� ���̸� ���ϼ���.
	+5 => %
	
	����6]
	������ ������ �Է¹޾� �ش� ������ ����, ����� �Ǻ��ϴ� ���α׷�
	���� ������
	4�� ������������ 100���� ���� �������� �ʰ�
	400���� �������� �ظ� �����̶�� ��.
*/
	public Ex01() {
//		sol1();
//		sol2();
		sol3();
//		sol4();
//		sol5();
//		sol6();
		}
	
	public void sol1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("3�ڸ� ���� : ");
		int num1 = sc.nextInt();
		int result1 = num1 - (num1 % 100);
		System.out.println(result1);
		
		int no1 = (int)(Math.random()*(999-100+1))+100;
		System.out.println("���� : " + no1);
		int result2 = no1 - (no1 % 100);
		System.out.println(result2);		
	}
	
	public void sol2() {
		System.out.print("1-255������ ���� : ");
		int num2 = 0;
		char ch1 = (char)num2;
		num2 = (int)(Math.random()*(255-0+1))+0;
		System.out.println(num2);
		String result2 = (ch1 >= 'A' & ch1 <= 'Z') ?  ("�������Դϴ�.") : (ch1 >='a' & ch1 <='z') ? ("�������Դϴ�.") :("�����ڰ��ƴմϴ�.") ; 
		System.out.println(ch1 +"�� "+ result2);
	}
	
	public void sol3() {
		double num3 = 100.;
		double num4 = (num3 - 32) * 5/9f;
		System.out.println("ȭ�� 100�� : " + num4);
	}
	
	public void sol4() {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("�Ҽ� �Է� : ");
		double num5= sc1.nextDouble();
		double result3 = ((num5 + 0.005) * 100.);
		int result4 = (int) result3;
		double result5 = (double) result4/100. ; 
		System.out.println(result5);
		
	}
	public void sol5() {
		int no5 = 0;
		int num5 = 0;
		no5 = (int)(Math.random()*(99-10+1))+10;
		System.out.println("���� : " + no5);
		num5 = no5-((no5 + 5)/ 10)*10;
		
		System.out.println(Math.abs(num5));
		
	}
	public void sol6() {
		Scanner sc2 = new Scanner(System.in);
		System.out.print("���� : ");
		int no6 = sc2.nextInt();
		String result6 = ((no6%4==0) && (no6%100!=0) || (no6%400==0))
							? ("����"):("���");
		System.out.println(result6);
		
		
	}
	public static void main(String[] args) {
		new Ex01();

	}

}
