package day19;

import java.io.*;
import javax.swing.*;
public class Test12 {

	public Test12() {
		// Ÿ�ٽ�Ʈ�� �غ��ϰ�
		FileReader fr = null;
		// ���ͽ�Ʈ�� �غ��ϰ�
		BufferedReader br = null;
		
		try {
			// ��Ʈ�� �ʱ�ȭ �ϰ�
			fr = new FileReader("src/day19/Test11.java");
			br = new BufferedReader(fr);
			// ����� �о�� ���� ������ �ݺ��ؼ� ó���Ѵ�.
			String msg = "";
			while(true) {
				String str = br.readLine();
				if(str == null) {
					break;
				}
				msg += str + "\n";
			}
			
			//���� ���� ����ϰ�...
			JOptionPane.showMessageDialog(null, msg);
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		} finally {
			try {
				br.close();
				fr.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test12();
	}

}
