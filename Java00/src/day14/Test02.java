package day14;

import javax.swing.*;
public class Test02 {

	public static void main(String[] args) {
		// ���������� ���ڿ��� �Է¹ް�
		String sno = JOptionPane.showInputDialog("Number");
		// ���� ������ �����
		int no = 0;
		
		try {
			System.out.println("Before");
			no = Integer.parseInt(sno);
			System.out.println("After");
		} catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		} finally {
			// �� ���� ���� �߻� ���ο� �������
			System.out.println("no : "+no);
		}
	}
}
