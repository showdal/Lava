package day03;
import java.util.*;
/*
	����2]
		���� ��� ��� ���α׷�
		
				�ڵ�	�⺻���	�����
		������	 1		 3800		 245
		����� 	 2		 2400		 157
		������	 3	 	 2900	 	 169
		�����	 4		 3200		 174
	
		������ = �⺻��� + ��뷮 * �����
		
		������ڵ�� ��뷮�� �Է¹޾� ������ ��� 
 */
public class Ex03 {
	public Ex03() {
		sol();
	}
	public void sol() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ڵ� : ");
		int code = sc.nextInt();		
		
		if (code > 4 || code == 0) {
			System.out.println("����");
			return; // ���� ���� ���
		} else {
			
		}
		
		System.out.print("��뷮 : ");
		int use = sc.nextInt();
		int money = 0;
		
		if (code == 1) {
			money = 2400 + use * 245;
			
		} else if (code ==2 ) {
			money = 2900 + use * 157;
			
		} else if (code ==3 ) {
			money = 3200 + use * 169;
			
		} else if (code ==4 ) {
			money = 3800 + use * 174;
		} else {
			
		}	
		
			
		System.out.println("����� : " + money);
		
		
	}
	public static void main(String[] args) {
		new Ex03();


	}

}
