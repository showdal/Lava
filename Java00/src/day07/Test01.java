package day07;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		int [] num1 = {1,2,3,4,5};
		int [] num2 = num1; // ���� ���� : ��ġ���� ����
		
		num1[2] = 30;
		
//		float[] no = num1;  Ÿ���� �޶� ���� �Ұ���
		
		System.out.println(Arrays.toString(num1));
		System.out.println(Arrays.toString(num2));
	}

}
