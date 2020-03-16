package day03;

public class Hw02 {
	public Hw02() {
		solv1();
		
	}
	public void solv1() {
		int num = (int)(Math.random()*256);
		char ch = (char)num;
		String msg = (ch >= 'A' && ch <='Z')?("영대문자")
					:((ch>='a' && ch <='z')?("영소문자"):("아님"));
		
		System.out.println(ch+msg);
	}
	
	public static void main(String[] args) {
		new Hw02();

	}

}