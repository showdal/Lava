package day12;
/*
 문제 2]
	학생의 이름, java, db, html, js, css, 총점, 평균
	을 저장할 클래스를 만들고
	5학생의 데이터를 입력해서 출력하세요.
	단, 변수는 은닉화시키세요.
 */
public class Stud {
	private String name;
	private int java;
	private int db;
	private int html;
	private int js;
	private int css;
	private int sum;
	private double avg;

	
	public Stud() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public int getDb() {
		return db;
	}
	public void setDb(int db) {
		this.db = db;
	}
	public int getHtml() {
		return html;
	}
	public void setHtml(int html) {
		this.html = html;
	}
	public int getJs() {
		return js;
	}
	public void setJs(int js) {
		this.js = js;
	}
	public int getCss() {
		return css;
	}
	public void setCss(int css) {
		this.css = css;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	public void setRandom(String name) {
		setName(name);
		java = (int)(Math.random()*100+1);
		db = (int)(Math.random()*100+1);
		html = (int)(Math.random()*100+1);
		js = (int)(Math.random()*100+1);
		css = (int)(Math.random()*100+1);
		setSum(java + db + html + js + css);
		setAvg(sum / 5.f);
	}
	
	public void toPrint() {
		
		System.out.printf("\n %3s %3d %3d %3d %3d %3d %3d %.1f",name,java,db,html,js,css,sum,avg);
	}
	 

}
