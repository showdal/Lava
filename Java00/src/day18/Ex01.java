package day18;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.swing.JOptionPane;
public class Ex01 {
	/*
	 ����1]
	 1. Ex01.txt�� ����� �����͸� Properties�� ���
	 2. Ű���� ��� ������
	 3. �����͸� �����ϰ�
	 4. ������ �����ּ���.
	 5. �޼��� â�� ����� ������ ������ּ���.
	 */
	
	public Ex01() {
		 int sum=0;
		// txt ���� �о����
		Properties prop = new Properties();
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("src/day18/Ex01.txt");
			prop.load(fin);
		}catch(Exception e) {
			e.printStackTrace();
		}
		// Ű�� ������
//		Set set = prop.keySet();
		
		// Ű�� ������ ���
		/*
		Iterator itor = set.iterator();
		
		while(itor.hasNext()) {
			String key = (String)itor.next();
			System.out.println(key + " : " + prop.get(key));
			// ������ �����͸� ������ �ٲٰ� sum�� ���Ѵ�
			sum += Integer.parseInt((String)prop.get(key));
		}
		*/
		
		// ArrayList �� �ذ��ϴ� ���
		Set set = prop.entrySet();
		ArrayList<Map.Entry<String, String>> eList = new ArrayList<Map.Entry<String, String>>(set);
		for(int i = 0 ; i < eList.size(); i++ ) {
			sum += Integer.parseInt(eList.get(i).getValue());
		}
		
		// ���� �޼��� â ����
		JOptionPane.showMessageDialog(null, "���� : " + sum);
	}
	public static void main(String[] args) {
		new Ex01();
	}

}
