package day14;

import javax.swing.*;
public class Test02 {

	public static void main(String[] args) {
		// 숫자형태의 문자열을 입력받고
		String sno = JOptionPane.showInputDialog("Number");
		// 정수 변수를 만들고
		int no = 0;
		
		try {
			System.out.println("Before");
			no = Integer.parseInt(sno);
			System.out.println("After");
		} catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		} finally {
			// 이 블럭은 예외 발생 여부와 관계없이
			System.out.println("no : "+no);
		}
	}
}
