package day04;

import java.util.*;

/*
	�� ���� �Է¹��� ��
	�� ���� �ּҰ������ ���ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
	
	�ּҰ���� : �� ���� ������ �������� ���� ���� ��
 */
public class Hw02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int no1 = sc.nextInt();
		System.out.print("���� �Է� : ");
		int no2 = sc.nextInt();
		sc.close();
		int no3 = Math.min(no1, no2);
		
		for(int i=no3; i>0; i--) {
				if(no1%i==0&&no2%i==0) {
				} 
				System.out.println("�ּҰ���� : " + (no1*no2)/i);
				break;	
	}
	}
}
