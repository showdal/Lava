package day15;

import java.util.regex.*;
import javax.swing.*;
public class Test05 {
	public Test05 () {
		// ��ȭ��ȣ�� �Է¹޾� �Է��� ��ȣ�� �´� �������� �˻��غ�����.
		String val = JOptionPane.showInputDialog("Phone");
		/* 1. PatternŬ������ �̿��ؼ� �˻��ϰ� ���� ���Խ� ������ �����.
			  �׷��� Pattern Ŭ������ �������Լ��� ȣ���� �� ������ ������� Ŭ�����̹Ƿ�
			  �� Ŭ������ ��ü�� ������� 
		 	  �Ӽ��� static�̰� ��ȯ���� Pattern�� �Լ��� ã�� ����ϸ� �ȴ�.
			  compile(String regex)
		*/
		Pattern pattern = Pattern.compile("^0[0-9]{1,2}-[0-9]{3,4}-[0-9]{4}$");
		/*
		 	2. �� Ŭ������ ���Խ� ������ �˻��ش޶�� ��û�Ѵ�.
		 	   ������ �˻�� �Լ� matcher()
		 	   �� �Լ��� �˻� ����� Matcher��� Ŭ���� Ÿ������ ��ȯ���ش�.
		 	   �� ����� ���� ��� ������ Matcher Ŭ�������� ó���� �� ���̴�.
		 	   
		 	   ����� �˾Ƴ��� ���
		 	   matches()
		 */
		Matcher match = pattern.matcher(val);
		
		// �˻� ����� match�� ����Ǿ� ������ ���� ����Ѵ�.
		
		if(match.matches()) {
			JOptionPane.showMessageDialog(null, "Right");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong");
		}
	}
	public static void main(String[] args) {
		new Test05();
	}

}
