package day11.preSolv;


/**
 * 
 * �� Ŭ������ �л� �Ѹ��� �̸��� ���� ������ ������ �뵵�� Ŭ����
 * 
 * @author	�
 * @since	2020.03.23
 * @version	v.1. 
 *
 */
public class Stud {
	//�̸�, ����
	String name;
	int kor, eng, math, phys, cod;
	
	public Stud() {
//		this("show");
	}
	public Stud(String name) {
		this.name=name;
		setSub();
	}
	//���� ���� ���� �Է�
	public void setSub() {
		kor = (int)(Math.random()*100+1);
		eng = (int)(Math.random()*100+1);
		math = (int)(Math.random()*100+1);
		phys = (int)(Math.random()*100+1);
		cod = (int)(Math.random()*100+1);
	}
	//����
	public int getSum() {
		return kor+eng+math+phys+cod;
	}
	//���
	public double getAvg() {
		return getSum()/5.;
	}
	public void toPrint() {
		System.out.printf("%4s : %3s | %3s | %3s | %3s | %3s | %3s | %4s\n",name,kor, eng, math, phys, cod,getSum(),getAvg());
	}
	
}
