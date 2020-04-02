package day15;

public class Test01 {
	public Test01() {
		Member hw = new Member();
		setMembData(hw);
		System.out.println(hw);
	}
	// Member의 데이터 채워주는 함수
	public void setMembData(Member m) {
		m.setMno(7777);
		m.setName("쇼영");
		m.setId("show");
		m.setMail("show@increpas.com");
	}
	
	public static void main(String[] args) {
		new Test01();
	}

}
