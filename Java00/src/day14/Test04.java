package day14;

import javax.swing.JOptionPane;

public class Test04 extends Test03 {
	/*
	 	getNum() �� ����� ������ �غ���.
	 	�Է¹��� ���ڿ� 10�� ���� ������ ��ȯ���ֵ��� �������̵� �غ���.
	 	
	 	�������̵� ��Ģ]
	 	
	 	0. ����� �޾ƾ� �Ѵ�
	 	1. �Լ��� ������ �����ؾ� �Ѵ�.
	 	2. ���������ڴ� ���ų� ���� ��������
	 	3. ����ó���� ���ų� ���� ��������
	 */
	
	// ���ڸ� �Է¹޾Ƽ� ������ ��ȯ���ִ� getNum() �Լ� 
	public int getNum() throws NumberFormatException, Exception {
		// ��ȯ�� ���� ���� ���� �� �ʱ�ȭ
		int num = 0;
		
		// ���ڸ� �Է¹޾� ���ڿ��� ���
		String sno = JOptionPane.showInputDialog("Number");
		
		// ���ڿ��� ������ ��ȯ�ϰ�
		num = Integer.parseInt(sno);
		
		if(num < 0 ) {
			// ���� ���� �߻���Ű��
			// ����]
			//		throw new ����Ŭ���� ������();
			throw new NumberFormatException();
		}
		return num *10;
	}
		
	public static void main(String[] args) {
		
	}
}
