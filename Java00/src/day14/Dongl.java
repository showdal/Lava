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
	// 접근지정자 private는 클래스 내에서만 접근 가능하므로 함수를 만들어 데이터를 반환해준다. 
	public double getArea() {
		return area;
	}
	
	// 면적이 같으면 같은 원으로 판단하도록 equals 함수를 오버라이드 한다.
	public boolean equals(Object obj) {
		
		// 반환값 담을 변수 선언 및 초기화
		boolean bool = false;
		
		// 입력되는 Dongl 인스턴스는 오브젝트 타입으로 자동형변환이 되어 기억이 된다.
		// Dongl 타입으로 강제형변환을 시켜 멤버를 사용한다.
		Dongl d1 = (Dongl) obj;
		
		
		// 면적을 꺼내 비교한다.
		bool = (this.area==d1.area)?true:false;
		
		// 결과 반환
		return bool;
	}
}
