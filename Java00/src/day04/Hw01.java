package day04;
import java.util.*;
/*
	�� ���� �Է¹��� ��
	�� ���� �ִ������� ���ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
	
	�ִ����� : �μ��� ���� �� �ִ� �ִ� ��
 */
public class Hw01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int no1 = sc.nextInt();
		System.out.print("���� �Է� : ");
		int no2 = sc.nextInt();
		int no3 = Math.min(no1, no2);
//		int no3 = (no1 > no2) ? (no2):(no1);
	
		for(int i=no3; i>0; i-- ) {
				if(no1%i==0&&no2%i==0) {
				}
				System.out.println("�ִ����� : " + i);
				break;
			}
	}

}
