package day15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

/*
	����1]
		�̸����� �Է¹޾� �Է¹��� ���ڿ��� �̸��� ������ �´��� �ƴ��� �˻�
		�̸��� ������
			���ĺ�+���� 8���̻� @ �������ּ�
 	����]
 		�ѱ� : [��-�R] �ѱ� �Ұ�
 	
 */
public class Ex01 {
	public Ex01() {
		String val = JOptionPane.showInputDialog("Email");
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{8,}@[a-zA-Z0-9]\\.[a-zA-Z0-9]{2,6}");
		
		Matcher match = pattern.matcher(val);
		
		if(match.matches()) {
			JOptionPane.showMessageDialog(null, "Right");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong");
		}
	}

	public static void main(String[] args) {
		new Ex01();
		
		
	}

}
