package day02;

import java.util.*;
public class Test01 {
	
	/*
	 	�ڹ��� ��ū ����
	 	=> �����Ϸ��� ��ū ������ ����, ��� ���� ��ȣ = ; = }
	 	
	 	
	 	�����͸� �Է¹޾� ����ϴ� ���
	 	1. Ŭ���� ���� ����
	 	=> import java.util.*;			��� ��Ű��
	 	=> import java.util.Scanner;		��Ű������ ScannerŬ������
	 	
	 	2. ���α׷� ���ο���
	 	=> Scanner sc = new Scanner(System.in);		�Է¹��� �غ�
	 	
	 	3. 
	 	=> ���� = sc.nextXxxx();		�Է� / Camelǥ���
	 	=> ���ڿ� = sc.nextLine();	
	 	=> ���� = sc.nextInt();	
	 	=> �Ǽ� = sc.nextFloat();
	 	   Integer.parseInt();			���� => ���ڿ�
��
	 */

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("������ �Է��ϼ���! : ");
		 String str = sc.nextLine();
		 int num = Integer.parseInt(str);
		 int result = num -50;
		 System.out.println(num + "���� 50�� �� ���� " + result);
		 
	
		 System.out.print("������ �Է��ϼ���! : ");
		 String str7 = sc.nextLine();
		 int e = 0;
		 System.out.println( str7 + "�� ������ : " + Integer.toBinaryString(e));
		 
		 
//		 ���ǵѷ�,���� ��簢�� ����
		 System.out.print("���� ������ : ");
		 String str1 = sc.nextLine();
		 double r = Integer.parseInt(str1);
		 double round1 = 2*r*3.14;
		 System.out.println("���� �ѷ� : " + round1);
		 double round2 = r*r*3.14;
		 System.out.println("���� ���� : " + round2);
		 
		 
		 System.out.print("�ﰢ���� �غ� : ");
		 String str3 = sc.nextLine();
		 System.out.print("�ﰢ���� ���� : ");
		 String str4 = sc.nextLine();
		 double a = Integer.parseInt(str3);
		 double b = Integer.parseInt(str4);
		 double tri = a * b / 2;
		 System.out.println("�ﰢ���� ���� : " + tri);
		 
		 
		 System.out.print("�簢���� �غ� : ");
		 String str5 = sc.nextLine();
		 System.out.print("�簢���� ���� : ");
		 String str6 = sc.nextLine();
		 double c = Integer.parseInt(str5);
		 double d = Integer.parseInt(str6);
		 double squ = c * d;
		 System.out.println("�簢���� ���� : " + squ);

	}

}
