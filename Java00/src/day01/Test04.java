package day01;
/**
 * Ŭ������ ������ ��� �ּ�
 * @author show
 * @since 2020.03.09
 * @version v.1.0
 * @see (�����ؾ��� Ŭ������ �����ϴ� �κ�)
 *  
 *  	�����̷�
 *  		2020.03.09 - Ŭ���� ���� - ����� : ��
 *  
 */
public class Test04 {
	public static void main(String[] args){
		
		/*
		 ����������
		 	++, --
		 	������ �ٿ����� �ٿ��� ������ ���� +1, -1 ���ش�.
		 	��ȣ ���Ŀ� ó�� ������ ������ ���ؼ� �ѹ���
		*/
		
		int no1 = 10;
		int no2 = no1++ + ++no1;
		System.out.println(no2);
		
		
		int num1 = 10;
		int num2 = ++num1 + num1++;
		System.out.println(num2);
		
		
		int num3 = 5;
		System.out.println();
		
		
	}
}
