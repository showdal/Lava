package day04;/*
������ �Է¹޾� ���� ��� �Ǵ��ϴ� ���α׷�

*/
import java.util.*;
public class Ex01 {
	public Ex01() {
		sol();
	}
	public void sol() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int year = sc.nextInt();
		String str = "���";
		int code = 0;
		
		if((year % 4 == 0) && (year % 100 != 0)||(year % 400 == 0)) {
			code = 1;
		}
		
		switch(code) {
		case 1 : str = "����";
			break;
		}
		System.out.println(year + "�� : " + str);
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}
