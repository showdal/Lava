package day14;

import javax.swing.JOptionPane;

public class Test03 {
	
	public Test03() {
		// getNum()�� ���� �����ϴ� �Լ��̹Ƿ� �ݵ�� ����ó���� ������Ѵ�.
		
		int num = 0;
		
		try {
			num = getNum();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
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
		
		
		/*
		 	num ������ �����͸� ���� ��� ���ܰ� �߻��� �� �ִ�.
		 	�Լ��� ȣ���� ������ ����ó���� �ѱ��.
		 */
		
		// ������ �Ѱ��ְ�
		return num;
	}
	
	public static void main(String[] args) {
		new Test03();
		
		
		
		
	}

}