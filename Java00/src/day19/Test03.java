package day19;
/*
 ����3]
 	FileOutputStream
 	���Ͽ� ������ �����ϴ� ���α׷��� �ۼ��ϼ���.
 */
import java.io.FileOutputStream;

import javax.swing.JOptionPane;
public class Test03 {

	public Test03() {
		// ���Ͽ� �����͸� �����ϱ� ���ؼ��� ���Ϸ� ����Ǵ� Ÿ�ٽ�Ʈ���� �ʿ��ϴ�.
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src/day19/etc/increpas");
			// �� ��� ������ ��� �ڵ����� ������ ����� �ش�.
			// ������ �����ϸ� �����ϴ� ���Ͽ� ����ϰ� �� ���̴�.

			// 1. �ѱ��ڸ� �Է��Ѵ�.
			fout.write('A');
			JOptionPane.showMessageDialog(null, "*** ���� ���� �Ϸ� ***");
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		} finally {
			try {
				fout.close();
				// ��Ʈ���� �����ָ� �ݾ��ִ� ���� ��Ģ�̴�.
				// �ܺ���ġ�� ������ �ϰ� �� ����Ŀ��� �ݵ�� �ݾ��ִ� ���� ��Ģ�̴�.
			} catch(Exception e) {}
		}
	}
		
	public static void main(String[] args) {
		new Test03();
	}

}
