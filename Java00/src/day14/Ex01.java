package day14;

import javax.swing.JOptionPane;

public class Ex01 {
	/*
	public Test02() {
		try {
			Test02();
		} catch(NumberFormatException e) {
			System.out.println("������ �Է����ּ���.");
		} finally {
			System.out.println("����ã�� ��");
		}
	}
	*/
	
/*
 	�߰� �н� ]
 		���� ����� �Լ��� �����ؼ� ó���ϼ���.
 */
	
	public Ex01() {
		String str = JOptionPane.showInputDialog("���̸� �Է����ּ���");
		
		int age = 0;
		String msg = "";
		
		try{
			age = Integer.parseInt(str);
			if(age <= 9) {
				msg = "��� �Դϴ�.";
			} else if(age <=19) {
				msg = "10�� �Դϴ�.";
			} else if(age <=29) {
				msg = "20�� �Դϴ�.";
			} else if(age <=39) {
				msg = "30�� �Դϴ�.";
			} else if(age <=49) {
				msg = "40�� �Դϴ�.";
			} else if(age <=59) {
				msg = "50�� �Դϴ�.";
			} else if(age <=69) {
				msg = "60�� �Դϴ�.";
			} else if(age <=79) {
				msg = "70�� �Դϴ�.";
			} else if(age <=89) {
				msg = "80�� �Դϴ�.";
			} else if(age <= 99) {
				msg = "90�� �Դϴ�.";
			} else {
				msg = "����� �Դϴ�.";
			}
		} catch(Exception e) {
			msg = "���� ������ �ƴմϴ�.";
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}
	public static void main(String[] args) {
		new Ex01();
	}

}




/* package day14;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How old are you?");
		String str = sc.nextLine();
		int no = 0;
				
		try{
			if(no%10==1) {
				System.out.println(no+"���� 10���Դϴ�.");
			} else if(no/10==2) {
				System.out.println(no+"���� 20���Դϴ�.");
			} else if(no/10==3) {
				System.out.println(no+"���� 30���Դϴ�.");
			} else if(no/10==4) {
				System.out.println(no+"���� 40���Դϴ�.");
			} else if(no/10==5) {
				System.out.println(no+"���� 50���Դϴ�.");
			} else if(no/10==0) {
				System.out.println(no+"���� �Ƶ��Դϴ�.");
			}
			} catch(Exception e) {
				System.out.println("������ �Է����ּ���.");
		} 
	}
}
*/