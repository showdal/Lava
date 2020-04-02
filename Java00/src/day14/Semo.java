package day14;

public class Semo {
	// �� Ŭ������ ����� ���� ���� ����
	private int width, height;
	private double area;
	
	// �⺻ ������ �Լ�
	public Semo() {}
	
	// ������ �Լ� �����ε�
	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	// ���� ���ؼ� �Է��ϴ� �Լ�
	public void setArea() {
		area = width * height * 0.5;
	}
	
	public double getArea() {
		return area;
	}
	
	// �� Ŭ������ ������ ���ڿ��� ��ȯ���ִ� toString() �������̵�
	public String toString() {
		return "\t\t�غ� : " + width + "\n\t\t���� : " + height + "\n\t\t���� : " + area + "\n�� �ﰢ��\n";
	}
	
	// �� Ŭ������ �غ��� ������ ���� ��ü�� �Ǵ����ִ� ����� equals �Լ� �������̵�
	public boolean equals(Object obj) {
		return this.width == ((Semo) obj).width;
	}
}