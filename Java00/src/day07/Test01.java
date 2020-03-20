package day07;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		int [] num1 = {1,2,3,4,5};
		int [] num2 = num1; // 얕은 복사 : 위치값만 복사
		
		num1[2] = 30;
		
//		float[] no = num1;  타입이 달라 복사 불가능
		
		System.out.println(Arrays.toString(num1));
		System.out.println(Arrays.toString(num2));
	}

}
