package day09;




public class Test03_1 {
	char[] ch;

	public Test03_1() {
		setCh();

		
		for(char c : ch) {
			System.out.print(c);
		}
		System.out.println();

		for(int i=0; i<ch.length; i++) {
			char s = ch[i];
			char e = smaller(s);
			ch[i]=e;
		}
		for(char c : ch) {
			System.out.print(c);
		}
	}
	public void setCh() {
		ch = new char[5];
		for(int i=0; i<5; i++) {
			ch[i] = (char)('A'+i);			
		}
	}
	public char smaller(char s) {
		char result = (char)(s + ('a' - 'A'));
		return result;
	}
	
	public static void main(String[] args) {
		new Test03_1();
	}

}
