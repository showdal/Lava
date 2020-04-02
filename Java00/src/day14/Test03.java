package day14;

import javax.swing.JOptionPane;

public class Test03 {
	
	public Test03() {
		// getNum()은 예외 전이하는 함수이므로 반드시 예외처리를 해줘야한다.
		
		int num = 0;
		
		try {
			num = getNum();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 숫자를 입력받아서 정수로 변환해주는 getNum() 함수 
	public int getNum() throws NumberFormatException, Exception {
		// 반환값 담을 변수 선언 및 초기화
		int num = 0;
		// 숫자를 입력받아 문자열로 담고
		String sno = JOptionPane.showInputDialog("Number");
		// 문자열을 정수로 변환하고
		num = Integer.parseInt(sno);
		if(num < 0 ) {
			// 강제 예외 발생시키기
			// 형식]
			//		throw new 예외클래스 생성자();
			throw new NumberFormatException();
		}
		
		
		/*
		 	num 변수에 데이터를 담을 경우 예외가 발생할 수 있다.
		 	함수를 호출한 곳으로 예외처리를 넘긴다.
		 */
		
		// 데이터 넘겨주고
		return num;
	}
	
	public static void main(String[] args) {
		new Test03();
		
		
		
		
	}

}
