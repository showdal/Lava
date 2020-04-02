package day14;

import javax.swing.JOptionPane;

public class Ex01 {
	/*
	public Test02() {
		try {
			Test02();
		} catch(NumberFormatException e) {
			System.out.println("정수만 입력해주세요.");
		} finally {
			System.out.println("나이찾기 끝");
		}
	}
	*/
	
/*
 	추가 학습 ]
 		메인 기능을 함수로 제작해서 처리하세요.
 */
	
	public Ex01() {
		String str = JOptionPane.showInputDialog("나이를 입력해주세요");
		
		int age = 0;
		String msg = "";
		
		try{
			age = Integer.parseInt(str);
			if(age <= 9) {
				msg = "어린이 입니다.";
			} else if(age <=19) {
				msg = "10대 입니다.";
			} else if(age <=29) {
				msg = "20대 입니다.";
			} else if(age <=39) {
				msg = "30대 입니다.";
			} else if(age <=49) {
				msg = "40대 입니다.";
			} else if(age <=59) {
				msg = "50대 입니다.";
			} else if(age <=69) {
				msg = "60대 입니다.";
			} else if(age <=79) {
				msg = "70대 입니다.";
			} else if(age <=89) {
				msg = "80대 입니다.";
			} else if(age <= 99) {
				msg = "90대 입니다.";
			} else {
				msg = "고령자 입니다.";
			}
		} catch(Exception e) {
			msg = "나이 형식이 아닙니다.";
		}
		
		JOptionPane.showMessageDialog(null, msg);
	}
	public static void main(String[] args) {
		new Ex01();
	}

}




/* package day14;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How old are you?");
		String str = sc.nextLine();
		int no = 0;
				
		try{
			if(no%10==1) {
				System.out.println(no+"세는 10대입니다.");
			} else if(no/10==2) {
				System.out.println(no+"세는 20대입니다.");
			} else if(no/10==3) {
				System.out.println(no+"세는 30대입니다.");
			} else if(no/10==4) {
				System.out.println(no+"세는 40대입니다.");
			} else if(no/10==5) {
				System.out.println(no+"세는 50대입니다.");
			} else if(no/10==0) {
				System.out.println(no+"세는 아동입니다.");
			}
			} catch(Exception e) {
				System.out.println("정수로 입력해주세요.");
		} 
	}
}
*/