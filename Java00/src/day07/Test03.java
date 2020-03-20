package day07;

import javax.swing.*;
public class Test03 {

	public static void main(String[] args) {
		
		String str1 = "show";
		String str2 = "show";
//		str1 == str2; // true <= 주소값을 복사해줌
		
		String str3 = new String("show");
		String str4 = new String("show");
//		str3 == str4; // false => new 명령어는 힙 영역에 새로 데이터를 만든다.
//								  문자열은 .equals() 동등비교를 사용
		
		JOptionPane.showMessageDialog(null, (str1 == str2) + "\n"	// true
									+ (str1 == str3) + "\n"			// false
									+ (str2 == str3) + "\n" 		// false
									+ (str3 == str4) + "\n"); 		// false
	}

}
