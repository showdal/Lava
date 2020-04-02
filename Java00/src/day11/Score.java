package day11;
/*
	문제2]
		이 클래스는 학생 한 명의
		이름, java, oracle, html, javascript, jsp, spring의 점수를 기억할 클래스
		이 클래스가 객체가 될 때, 데이터를 입력받아서 각 변수에 기억되게
		클래스를 정의하세요.
		
		데이터가 입력되지 않을 경우
		이름은 "박광호"로 하고 성적은 랜덤하게 기억되게 하세요.
 */
public class Score {
	String name;
	int java, oracle, html, javascript, jsp, spring, total;
	double avg;
	
	public Score() {
		this("박광호");
	}
	
	public Score(String name) {
		this(name, (int)(Math.random()*61 + 40), (int)(Math.random()*61 + 40), 
				(int)(Math.random()*61 + 40), (int)(Math.random()*61 + 40), 
				(int)(Math.random()*61 + 40),(int)(Math.random()*61 + 40));
	}
	
	public Score(String name, int java, int oracle, int html, int javascript, int jsp, int spring) {
		this.name=name;
		this.java=java;
		this.oracle=oracle;
		this.html=html;
		this.javascript=javascript;
		this.jsp=jsp;
		this.spring=spring;
		setTotal();
		setAvg();
	} 
	
	public void setTotal() {
		this.total = java+oracle+html+javascript+jsp+spring;
	}
	
	public void setAvg() {
		this.avg=this.total/6.;
	}
	public void toPrint() {
		System.out.printf("%4s : %3s | %3s | %3s | %3s | %3s | %3s | %3s | %.2f \n",
				name, java, oracle, html, javascript, jsp, spring, total, avg);
	}
	
	
}
