package day14;

public class DonglTest {
	public DonglTest() {
		// ��ü 2���� ����� ���Ѵ�.
		Dongl d1 = new Dongl(5);
		Dongl d2 = new Dongl(10);
		
		System.out.println(d1.getArea());
		System.out.println(d2.getArea());
		
		// �� ���� ���Ѵ�.
		System.out.println(d1.equals(d2)?("���� ��"):("�ٸ� ��"));
	}
	
	public static void main(String[] args) {
		new DonglTest();
	}
}
