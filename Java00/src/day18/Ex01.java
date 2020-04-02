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
	 문제1]
	 1. Ex01.txt에 저장된 데이터를 Properties에 담고
	 2. 키값을 모두 꺼내서
	 3. 데이터를 추출하고
	 4. 총점을 구해주세요.
	 5. 메세지 창을 띄워서 총점을 출력해주세요.
	 */
	
	public Ex01() {
		 int sum=0;
		// txt 파일 읽어오기
		Properties prop = new Properties();
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("src/day18/Ex01.txt");
			prop.load(fin);
		}catch(Exception e) {
			e.printStackTrace();
		}
		// 키값 꺼내기
//		Set set = prop.keySet();
		
		// 키값 데이터 출력
		/*
		Iterator itor = set.iterator();
		
		while(itor.hasNext()) {
			String key = (String)itor.next();
			System.out.println(key + " : " + prop.get(key));
			// 꺼내온 데이터를 정수로 바꾸고 sum에 더한다
			sum += Integer.parseInt((String)prop.get(key));
		}
		*/
		
		// ArrayList 로 해결하는 방법
		Set set = prop.entrySet();
		ArrayList<Map.Entry<String, String>> eList = new ArrayList<Map.Entry<String, String>>(set);
		for(int i = 0 ; i < eList.size(); i++ ) {
			sum += Integer.parseInt(eList.get(i).getValue());
		}
		
		// 총점 메세지 창 띄우기
		JOptionPane.showMessageDialog(null, "총점 : " + sum);
	}
	public static void main(String[] args) {
		new Ex01();
	}

}
