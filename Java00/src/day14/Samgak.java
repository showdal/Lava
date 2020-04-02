package day14;
/*
문제2]
	삼각형 클래스를 작성하고
	밑변과 높이를 입력해서 객체를 만들도록 작성하고
	
	밑변이 같으면 같은 삼각형이 되도록
	equals, toString()을 오버라이드하고 테스트
	
	입출력은 JOptionPane 소속 함수로 하고
	예외처리도 하세요.	
	
 */
public class Samgak {
	private int mit;
	private int nop;
	
	public Samgak() {
		
	}
	public Samgak(int mit) throws NumberFormatException{
		if(mit<=0) {
			throw new NumberFormatException();
		}
		this.mit=mit;
	}
	public int setMit() {
		return mit;
	}
	
	
	public boolean equals(Object obj) {
		boolean bool = false;
		Samgak s1 = (Samgak)obj;
		bool = (this.mit==s1.mit)?true:false;
		return bool;
	}
	
	@Override
	public String toString() {
		return "밑변이" + mit + "인 삼각형 두 개는 동일합니다.";
	}
	
	
	
}
