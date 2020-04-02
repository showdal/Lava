package day11;
/*
	����2]
		�� Ŭ������ �л� �� ����
		�̸�, java, oracle, html, javascript, jsp, spring�� ������ ����� Ŭ����
		�� Ŭ������ ��ü�� �� ��, �����͸� �Է¹޾Ƽ� �� ������ ���ǰ�
		Ŭ������ �����ϼ���.
		
		�����Ͱ� �Էµ��� ���� ���
		�̸��� "�ڱ�ȣ"�� �ϰ� ������ �����ϰ� ���ǰ� �ϼ���.
 */
public class Score {
	String name;
	int java, oracle, html, javascript, jsp, spring, total;
	double avg;
	
	public Score() {
		this("�ڱ�ȣ");
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
