package day14;

public class Dongl {
	private int rad;
	private double arro, area;
	
	public Dongl(int rad) {
		this.rad = rad;
		setArro();
		setArea();
	}
	public void setArro() {
		arro = 2*3.14*rad;
	}
	public void setArea() {
		area = 3.14*rad*rad;
	}
	// ���������� private�� Ŭ���� �������� ���� �����ϹǷ� �Լ��� ����� �����͸� ��ȯ���ش�. 
	public double getArea() {
		return area;
	}
	
	// ������ ������ ���� ������ �Ǵ��ϵ��� equals �Լ��� �������̵� �Ѵ�.
	public boolean equals(Object obj) {
		
		// ��ȯ�� ���� ���� ���� �� �ʱ�ȭ
		boolean bool = false;
		
		// �ԷµǴ� Dongl �ν��Ͻ��� ������Ʈ Ÿ������ �ڵ�����ȯ�� �Ǿ� ����� �ȴ�.
		// Dongl Ÿ������ ��������ȯ�� ���� ����� ����Ѵ�.
		Dongl d1 = (Dongl) obj;
		
		
		// ������ ���� ���Ѵ�.
		bool = (this.area==d1.area)?true:false;
		
		// ��� ��ȯ
		return bool;
	}
}
