package day04;

public class Test03 {
	public Test03() {
		sol();
	}
	public void sol() {
		for(int i=0; i<8; i++) {
			for(int j=0; j<9; j++) {
				System.out.println((i+2) + "x" + (j+1) + "=" + ((i+2)*(j+1)));
			}
		}
	}
	public static void main(String[] args) {
		new Test03();
	}
}
