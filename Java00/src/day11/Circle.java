package day11;
/*
	����1]
		�� Ŭ������ ���� ������ ������ Ŭ����
		�� Ŭ������ ��ü�� �� ��, �������� �Է¹޾Ƽ�
		���� ���� ������ �Էµǵ��� Ŭ������ �����ϼ���.
		
		�������� �Է��� �� �� ��� 10���� �Էµǰ� �ϼ���.
 
 */
public class Circle {
	int r;
	double r2, rr;
	
	//�⺻ �������Լ�
	public Circle() {
		this(10);
	}
	
	//�������Լ� �����ε�
	public Circle(int r) {
		this.r=r;
		this.r2=getR2(r);
		this.rr=getRr(r);
	} 
	public double getR2(int r) {
		return r*2*3.14;
	}
	public double getRr(int r) {
		return r*r*3.14;
	}
	public void toPrint() {
		System.out.println("������ : " + r + "\n�ѷ� : " + r2 + "\n���� : " + rr);
		System.out.println();
	}
}
