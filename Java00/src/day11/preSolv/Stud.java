package day11.preSolv;


/**
 * 
 * 이 클레스는 학생 한명의 이름과 과목 점수를 저장할 용도의 클래스
 * 
 * @author	쇼영
 * @since	2020.03.23
 * @version	v.1. 
 *
 */
public class Stud {
	//이름, 과목
	String name;
	int kor, eng, math, phys, cod;
	
	public Stud() {
//		this("show");
	}
	public Stud(String name) {
		this.name=name;
		setSub();
	}
	//과목 점수 랜덤 입력
	public void setSub() {
		kor = (int)(Math.random()*100+1);
		eng = (int)(Math.random()*100+1);
		math = (int)(Math.random()*100+1);
		phys = (int)(Math.random()*100+1);
		cod = (int)(Math.random()*100+1);
	}
	//총점
	public int getSum() {
		return kor+eng+math+phys+cod;
	}
	//평균
	public double getAvg() {
		return getSum()/5.;
	}
	public void toPrint() {
		System.out.printf("%4s : %3s | %3s | %3s | %3s | %3s | %3s | %4s\n",name,kor, eng, math, phys, cod,getSum(),getAvg());
	}
	
}
