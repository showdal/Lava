package day02;

import java.util.Scanner;

/**
 * ���� ���� �׽�Ʈ�� Ŭ����
 * 
 * @author	show
 * @since	2020.03.10
 * @version	v.1.0
 * @see
 * 
 * 			�����̷�
 * 				2020.03.10 - Ŭ���� ���� - ����� : show
 * 
 */
public class Test05 {
	/*
		���� �� ���� ���
		
		Math Ŭ���� random() �Լ��� 0���� ũ�ų� ���� 1���� ���� �Ǽ��� ��ȯ�Ѵ�.
		
	(int)(Mate.random() * �ִ밪 - �ּҰ� + 1)) + (�ּҰ�);
	 */
	public Test05(){
		test1();
		
	}
	public void test1(){
		int num = (int)(Math.random()*(10-1+1))+1;
		String msg = (num % 2 == 0)?(num +" : ¦��"):(num + " : Ȧ��");
		System.out.println(msg);	
	}
	
	
	public static void main(String[] args) {
		new Test05();

	}

}
