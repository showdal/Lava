package day16;
// DecimalFormat

import java.text.*;
public class Test01 {
	public Test01() {
		//�Ǽ� ������ ���� ����غ���.
		double num = 3425.4564f;
		// ������ 3�ڸ��� ��� , ��� �Ҽ� ���ϴ� 3�ڸ��� ���
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
