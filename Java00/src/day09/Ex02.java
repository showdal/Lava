package day09;
/*
 * ���� 1]
		�������� �����ϰ� �߻��ؼ� - �Լ���...
		�� �������� �Է��ϸ� 
		���� ���̸� �����ִ� �Լ���
		���� �ѷ��� �����ִ� �Լ��� �����ϰ�
		�����ؼ� ����ϼ���.
		*/

public class Ex02 {
	int r;

	
	public Ex02 (){
		int a = sol1();
		double a2 = sol2();
		double a3 = sol3();
		
		re(a, a2, a3);
	}
	
	public int sol1() {
	r = (int)((Math.random()*100)+1);
		return r;
		
	}
	public double sol2() {
		double r2 = r*2*3.14;
		return r2;
	}
	public double sol3() {	
		double rr = r*r*3.14;
		return rr;
	}	

	public void re(int no1 , double no2 , double no3) {
		
		System.out.println("���� ������ : " + no1);
		System.out.printf("���� �ѷ� : %.2f\n" , no2);
		System.out.println("���� ���� : " + no3);
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
