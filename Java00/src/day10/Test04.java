package day10;


/*

���� 1]
	
	���� ������, �ѷ�, ���̸� ������ Ŭ������ �����
	�� Ŭ���� ��ü 10���� �迭�� ������ �迭�� ����
	�� ����� �ʱ�ȭ�ϰ�
	����ϼ���.
	
���� 2 ]
	
	10���� ������ ������ �Է��� �迭�� �����
	�� �迭�� ��� ������
	����, ����� ���ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
	��, �Է�, �������, ��հ��, ����� �Լ��� �����ؼ� ó���ϼ���.
	
���� 3 ]
	
	�л��� �̸�, ����, ����, ����, ����, �ڵ� ������ ������ �����ϰ�
	����, ����� ����ؼ� �Է��� Ŭ������ �����ϼ���.
	��, �Է�, �������, ��հ��, ����� �Լ��� ���� ó���ϼ���.
	�׸��� 5���� �л��� �迭�� ���� ���� ����, �̸��� �Է��ؼ�
	����ϼ���.
				
		
 */
public class Test04 {
	Circle[] round;
	Grade[] score;
	
	
	
	
	
	public void grade() {
		score = new Grade[10];
		
	}
	
/*	
	
	public void round() {
		round = new Circle[10];
		
		for(int i=0; i<round.length; i++) {
			round[i] = new Circle();
			
			int r = (int)(Math.random()*(100-(-100)+1)-100);
			round[i].result(r);
		}
	}
	*/
	
	
	public static void main(String[] args) {
		Test04 t = new Test04();
		Grade t2 = new Grade();
		
/*		
		t.round();
		for(int i=0; i<t.round.length; i++) {
			t.round[i].print();
		}
		System.out.println();
		
*/		
		t2.result();
		t2.setAvg();
		t2.setSum();
		t2.print();
		System.out.println();
		
		
		
		
		
		}
}
