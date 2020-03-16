package day06;
/*

����1] 
	'A'~'J' ������ ���ڸ� ���������� ���� �迭�� �ְ� 
	�� ���ڸ� �ϳ��� ���� �ҹ��ڷ� �����ϰ� ����ϼ���.
	
	�迭�� ��� ������ ���ڿ��� Ȯ���ؼ� ���


����2]
	A'~'J' ������ ���ڸ� �����ϰ� 100�� �߻���Ų ��
	�� ������ ī��Ʈ�� ���ؼ�(����) ����ϼ���.
	
	���ڸ�ŭ ��ǥ�� ��� ���

���� 3]
	int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
	�̶�� �迭�� �غ��ϰ�
	
	79456���� �غ�� ȭ������� ����� �� ������ ȭ������� ��� �ʿ�����
	������ ������ �迭�� �����
	����ϴ� ���α׷��� �ۼ��ϼ���.
	
	
���� 4]	
	������ 5���� ����� �迭�� �����
	
	������ �������� ���� ���� ���̸� ����ؼ� ������ �迭�� �����
	�� ���� �ѷ��� ����ؼ� ������ �迭�� ����
	
	����� ����ϴ� ���α׷��� �ۼ��ϼ���.
	
	��, ������´�
		
		��]
			������ : 10, ���� �ѷ� : 62.8, ���� ���� : 314
		�� ���·� ��µǰ� �ϼ���.
	
���� 5]

	�Ǻ���ġ ���� 10���� ������ �迭�� �����
	�迭�� ���� �Է��ؼ�
	�迭�� ����� �����͸� ����ϼ���.
	
���� 6]
	���丮�� 10���� ������ �迭�� �����
	1���� ���������� 10������ ���丮���� ���� �迭�� ���
	������ ����ϼ���.

����7]
	���ڿ��� �Է¹޾Ƽ�
	���ڹ迭�� ���ڿ��� �̷�� ���ڸ� ���������� �����ϼ���
	
		Ư����ġ ���ڸ� �������ִ� �Լ�
		���ڿ�.charAt(��ġ��);
		
		���� ��ȯ �Լ�
		���ڿ�.length();
		
		��ȯ���� ����

����8]
	ȸ���� �̸�, ��ȭ��ȣ, �̸����� ������ �迭�� �����
	�����͸� �Է��ؼ�
	
	�̸��� �Է��ϸ�
	�̸� ��ȭ��ȣ �̸����� ������ִ� ���α׷��� �ۼ��ϼ���.


	
*/
import java.util.*;
public class Ex01 {
	public Ex01() {
//		sol1();	
//		sol2();	
//		sol3();	
//		sol4();	
//		sol5();	
//		sol6();	
//		sol7();	
		sol8();	
		
		
	}
	
	public void sol1() {
		
		char ch = ' ';
			
		char[] big = new char[10];
		char[] small = new char[10];
		
		for(int i=0; i<10; i++) {
			big[i] = (char)(ch+i);
		}	
		for(int i=0; i<10; i++) {
			small[i] = (char)(ch+i+'a'-'A');
			System.out.println(small[i]);
		}

		
		
	}
	
	public void sol2() {
		char ch[] = new char[100];
		int[] cnt = new int[10];
		
		for(int i=0; i<100; i++) {
			
			char tmp = (char)(Math.random()*('J'-'A'+1)+'A');
			ch[i] = tmp;
		}
		for(int i=0; i<100; i++) {
			int idx = ch[i] - 'A';
			cnt[idx] += 1;
		}
		for(int i=0; i<10; i++) {
			System.out.print((char)('A'+i));
			for(int j=0; j<cnt[i]; j++) {
				System.out.print("*");
		}
			System.out.println();		
	}
}
	
	public void sol3() {
		int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
		int total = 79456;
		int[] cnt = new int[8];
		for(int i=0; i<8; i++) {
			cnt[i] = total/coin[i];
			total = total%coin[i];
			System.out.println(coin[i] + " : " + cnt[i]);
		}
		
		
	}
	public void sol4() {
		
		int[] r = new int[5];
		double[] r2 = new double[5];	
		double[] rr = new double[5];
		for(int i=0; i<5; i++) {
			r[i] = (int)(Math.random()*(30-2+1)+2);
			r2[i] = r[i]*2*3.14;
			rr[i] = r[i]*r[i]*3.14;
			
			System.out.printf("������ : " + r[i]+ ", ���� �ѷ� : "+ r2[i] + ", ���� ���� : " +"%.2f",rr[i]);
			System.out.println();
		}
	}
	
	public void sol5() {
		int[] no1 = new int[10];
		int no2 = 1;
		int no3 = 1;
		System.out.print(no2+", ");
		System.out.print(no2+", ");

		for(int i=0; i<=8; i++) {
			no1[i] = no2+no3;
			no2 = no3;
			no3 = no1[i];
			System.out.print(no1[i]+", ");
		}
	}
	
	public void sol6() {
		int[] no1 = new int[10];
		int no2 = 1;
		
		System.out.print(no2+", ");
		for(int i=1; i<=9; i++) {
			no1[i] = no2 * (i+1);
			no2 = no1[i];		
			System.out.print(no1[i]+", ");
		}
	}
	public void sol7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		String a = sc.nextLine();
		char [] b =  new char[a.length()];
		
		
		for(int i=0; i<a.length(); i++){
		b [i] = a.charAt(i);
		System.out.print(b[i] + "|");
		
		}
	}
	public void sol8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		String a = sc.nextLine();
		String [] name = new String[] {"soyoung", "dooyong", "taehee", "seojin", "hee"};
		String [] phone = new String[] {"010-0000-0000", "010-0010-0000",
										"010-0000-0000", "010-0000-0000","010-0000-0000"};
		String [] mail = new String[] {"@", "@", "@", "@", "@"};

		int[] num = new int[]{1,2,3,4,5};
		for(int i=0; i<5; i++){
			a = name[i];
			if() {
				
			} 
			
			
			
			
			System.out.print(name[i] +", " +phone[i] + ", " + mail[i]);
		}
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new Ex01();	
	}
}