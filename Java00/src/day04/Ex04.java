package day04;
/*
	����4]
	5�ڸ� ������ �Է¹޾� ȸ������ �Ǻ��ϴ� ���α׷�
	
	12321
	
	���ڿ�.charAt(��ġ��) - ���ڿ��� Ư����ġ�� ���ڸ� ��ȯ���ִ� �Լ�
 	���ڿ�.toCharArray() - ���ڿ��� ���ڹ迭�� ��ȯ���ִ� �Լ�
 */
import java.util.*;
public class Ex04 {
	public Ex04() {
		sol();
	}
	public void sol() {
		Scanner sc = new Scanner(System.in);
		String str = "";
		String str2 = "";
		System.out.print("5�ڸ� ���� : ");
		str = sc.nextLine();
		
		
		
		for( int i=str.length()-1; i>=0; i--) {
			str2 += str.charAt(i);
			}	
			if(str.equals(str2)) {
				System.out.println("ȸ��������");
			}else {
				System.out.println("ȸ��������");
			}		
	}
	public static void main(String[] args) {
		new Ex04();
	
	for(;;) {
		// �޼��� ����ϰ�
		System.out.print("�ټ��ڸ� ���ڸ� �Է��ϼ���! : ");
		Scanner sc1 = new Scanner(System.in);
		// ������� ���� ������ �����.
		String msg = "ȸ���� ] ";
		// ���ڿ��� �Է¹ް� ������ ���
		
		String str = sc1.nextLine();
		
		if(str.equals("q")) break;
		/*
			�� ���� ������ ��ɹ� �ϳ��� ���� 
			����ȣ({}) �� �����ϰ� ��ɹ��� �ٷ� ����� ���� �ִ�.
		 */
		
		// �ݺ��ؼ� ���ϰ� ( 12321 ) -> 1, 2
		for(int i = 0 ; i < str.length() / 2 ; i++ ) {
			// ���ڿ��� ���ڸ� ù ���ں��� ������ �ڿ������� ���ڿ� ���Ѵ�
			if(str.charAt(i) != str.charAt((str.length() - 1) - i)) {
				// �� ���� �� ���ڰ� �ٸ� ����̹Ƿ� ȸ������ �ƴ� ����.
				msg = "ȸ���� ]�� �ƴ�";
				break;
			}
			// �� ���� �ι��ڰ� ���� ����̹Ƿ� ���� ���ڸ� ������ ���ؾ� �ڴ�.
		}
		// ��� ����ϰ�
		System.out.println("�Է��� ���� [ " + str + " ] �� [ " + msg + "��." );
	}
}
}
