package day14;

public class DonglTest {
	public DonglTest() {
		// 객체 2개를 만들어 비교한다.
		Dongl d1 = new Dongl(5);
		Dongl d2 = new Dongl(10);
		
		System.out.println(d1.getArea());
		System.out.println(d2.getArea());
		
		// 두 원을 비교한다.
		System.out.println(d1.equals(d2)?("같은 원"):("다른 원"));
	}
	
	public static void main(String[] args) {
		new DonglTest();
	}
}
