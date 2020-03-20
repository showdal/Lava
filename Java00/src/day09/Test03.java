package day09;
/*
	정수 두개 입력하면 연산을 해주는 함수
	실행 변수 출력
 */

public class Test03 {
	public Test03() {
		int result1 = pl(3,7);
		int result2 = mi(33,77);
		int result3 = etc(55,10);
		int result4 = mul(6,9);
		int result5 = divi(5,8);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
	}

	public int pl(int no1, int no2) {
		int sum = no1 + no2;
		return sum;
	}
	public int mi(int no1, int no2) {
		int sum = no1 - no2;
		return sum;
	}
	public int etc(int no1, int no2) {
		int sum = no1 % no2;
		return sum;
	}
	public int mul(int no1, int no2) {
		int sum = no1 * no2;
		return sum;
	}
	public int divi(int no1, int no2) {
		int sum = no1 / no2;
		return sum;
	}

	
	
	
	
	
	
	
	public static void main(String[] args) {
		new Test03();
	}

}
