package day12;

public class SpeedTest {
	public SpeedTest() {
		Car car = new Car();
		car.speedUp();
		System.out.println(car.speed);
	
		Mini mini = new Mini();
		mini.speedUp();
		System.out.println(mini.speed);
		
		Lotze euns = new Lotze();
		euns.speedUp();
		euns.speedUp(20);
		System.out.println(euns.speed);
		
		Car lotze = new Lotze();
		System.out.println(lotze.speed);
		
//		Mini m1 = (Mini) lotze; 가능은 하나 사용하지 않는 것이 좋다.
		
		Lotze car2 = (Lotze) new Car(); 
		System.out.println(car2.speed);
		car2.speedUp();
		System.out.println(car2.speed);
		
	}
	public static void main(String[] args) {
		new SpeedTest();
	}

}
