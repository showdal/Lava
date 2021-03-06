package day15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

/*
	문제1]
		이메일을 입력받아 입력받은 문자열의 이메일 형식이 맞는지 아닌지 검사
		이메일 형식은
			알파벳+숫자 8자이상 @ 도메인주소
 	참고]
 		한글 : [가-힣] 한글 불가
 	
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
