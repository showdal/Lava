package day10;
/*

����4]
	�л��� ������ �Է��ϸ� ������ ������ִ� ���α׷�
	
	��ȭ]
		�����ϰ� �μ��� �����
		�� �ο��� ��ŭ ������ �����ϰ� ����
		�Լ��� �����ϰ� �ϼ���.
		
Ȩ��ũ]
	�л��� �̸�, ����, ����, ����, ����, �ڵ� ������ �����ϴ� Ŭ������ �����ϰ�
	�л��� �����͸� �غ�� ��ŭ�� �Է��ؼ�
	��ü ����, ��ü ����� ���ϴ� ���α׷��� �ۼ��ϼ���.
	
	
*/
public class Ex01 {
	int score[];
	int sum;
	
	public Ex01() {
		score();
		sum();
		print();
	}
	public void score(){
		int data[] = score;
		for(int i=0; i<score.length; i++) {
			data[i] = (int)(Math.random()*(100-1+1)-1);
		}
	}
	public void sum() {
		int total = 0;
		 
		for(int i = 0 ; i < score.length ; i++ ) {
			total += score[i];
		}
		sum = total;
	}
	public void print() {
		System.out.println(sum);
		
	}
	
	
	
	
	public static void main(String[] args) {
		Ex01 t = new Ex01();
		
		t.score();
		t.sum();
	}

}
