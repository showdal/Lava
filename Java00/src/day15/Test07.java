package day15;

import java.io.*;
import java.util.*;
public class Test07 {
	public Test07() {
		File f = new File("D:\\class\\Java\\git\\Lava\\Java00\\src\\doc\\day15_src.txt");
		
		Scanner sc = null;
		String str = "";
		try {
			sc = new Scanner(f);
			str = sc.nextLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		StringTokenizer token = new StringTokenizer(str);
		
		int count = token.countTokens(); //�ڸ� ���ڿ��� ������ ��ȯ���ִ� �Լ�
		System.out.println(count + "���� ���ڿ�");
		
		/*
		// ��������.
		for(int i = 0 ; i < count; i++ ) {
			String tmp = token.nextToken();
			System.out.println("�и��� ���ڿ� : " + tmp);
		}
		// �ٽ� ������
		for(int i = 0 ; i < count; i++ ) {
			String tmp = token.nextToken();
			System.out.println("�ٽò��� ���ڿ� : " + tmp);
		}
		*/
		
		// ���� StringTokenizer�� ����ϴ� ����� ���� ó�� ����Ѵ�.
		while(token.hasMoreTokens()) {
			String tmp = token.nextToken();
			System.out.println("�ٽò��� ���ڿ� : " + tmp);
		}
	}
	public static void main(String[] args) {
		new Test07();
	}

}
