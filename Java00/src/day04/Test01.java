package day04;
/*
������ �Է¹޾� ���� ��� �Ǵ��ϴ� ���α׷�

*/
import java.util.*;
public class Test01 {
	public Test01() {
		sol();
		
		
	}
	public void sol() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int year = sc.nextInt();
		String str = "���";
		
		if(year % 400 == 0) {
			str = "����";
		} else if(year % 100 == 0) {
//			str = "���";
		} else if(year % 4 == 0){
			str = "����";
		} //else {
//			str = "���";
//		}
//		
		System.out.println(year + "�� : " + str);
	}
	public static void main(String[] args) {
		new Test01();

	}

}
