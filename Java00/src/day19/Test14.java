package day19;

/*
  	Friend �� �����͸� ä���� ���Ͽ� �״�� ������ ����.
  	
 */
import java.io.*;
import javax.swing.*;
public class Test14 {

	public Test14() {
		// Ÿ�ٽ�Ʈ�� �غ��ϰ�
		FileOutputStream fout = null;
		ObjectOutputStream oout = null;
		
		try {
			// ��Ʈ�� �����
			fout = new FileOutputStream("src/day19/etc/fr01.txt");
			oout = new ObjectOutputStream(fout);
			
			// Friend�� ����� �����͸� ä���ش�.
			Friend f1 = new Friend("����", "010-1111-1111", "choppa@increpas.com",25,90.0f,'M');
			
			// ������ �ѱ��
			oout.writeObject(f1);
			
			JOptionPane.showMessageDialog(null, "### Mission Complete! ###");
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		} finally {
			try {
				oout.close();
				fout.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test14();
	}

}
