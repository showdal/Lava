package day16;
// DecimalFormat

import java.text.*;
public class Test01 {
	public Test01() {
		//실수 형식을 만들어서 출력해보자.
		double num = 3425.4564f;
		// 정수부 3자리씩 끊어서 , 찍고 소수 이하는 3자리만 출력
		DecimalFormat pattern = new DecimalFormat("0,000,000.000");
		String str = pattern.format(num);
		System.out.println(num + "\n" + str);
		
		
		System.out.println();
		DecimalFormat pattern1 = new DecimalFormat("#,###,###.###");
		str = pattern1.format(num);
		System.out.println(num + "\n" + str);
		
		
	}

	
	
	public static void main(String[] args) {
		new Test01();
		
	}

}
