package day03;
import java.util.*;
/*
	����3]
		�μ���ȣ�� �Է��ϸ�
		�μ��̸��� ������ִ� ���α׷�
		
		10 - �ѹ�
		20 - ȸ��
		30 - ����
		40 - ���
		�� �� - ���� ��ȸ

	
 */
public class Ex04 {
	public Ex04() {
		sol();
	}
	public void sol() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�μ���ȣ : ");
		int num = sc.nextInt();	
		String name = ""; 
		
		if (num == 10) {
			name = "�ѹ���";
			
		} else if (num ==20 ) {
			name = "ȸ���";
			
		} else if (num ==30 ) {
			name = "������";
			
		} else if (num ==40 ) {
			name = "�����";
		} else {
		}	
		
		System.out.println("�μ��̸� : " + name);		
	}
	public static void main(String[] args) {
		new Ex04();

	}

}
