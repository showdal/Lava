package day09;

/*
 * ���� 2]
		1�� �迭�� 10���� �����͸� �Է��� ��
		������ ����� ���ϴ� ���α׷��� �ۼ��ϼ���.
		��, �Է�, �������, ��հ��, ����� �Լ��� ó���ϼ���.

*/
public class Ex03 {
	int [] d = {10,30,25,100,56,70,80,86,95,98}; 
	
	public Ex03() {
		int no1 = data();
		int no2 = sum();
		double no3 = avg();
		
		re(no1,no2,no3);
	}
	public int data() {
		int a = 0;
		System.out.print("���� ������ : ");
		for(int i=0; i<10; i++) {
			a = d[i];
			System.out.print(a + ", ");
		}
		return a;
	}
	
	public int sum() {
		int b = 0;
		for(int i=0; i<10; i++) {
			b += d[i];
		}
		return b;
	}
	public double avg() {
		double b= sum();
		double c = b/10;

		return c;
	}
	public void re(int re1, int re2, double re3) {
		
//		System.out.println("���� ������ : "+re1);
		System.out.println();
		System.out.println("���� : "+re2);
		System.out.println("��� : "+re3);
		
	}
	
	public static void main(String[] args) {
		new Ex03();
	}

}
