package day12;
/*
���� 3]
	Figure Ŭ������ �����ϰ�
	��ӹ޾Ƽ� �ﰢ��, �簢��, ���� Ŭ������ ������ ��
	
	1 ~ 3 ������ ������ �����ϰ� 10�� ����
	1�� ��� �ﰢ��
	2�� ��� �簢��
	3�� ��� ��
	�� �迭�� �־�
	
	����ϼ���.
 */
public class Figure {
	int[] figure = new int[10];
	String dohyung = "";
	
	
	public Figure() {
		samsaone();
	}
	public void samsaone() {
		for(int i=0; i<figure.length; i++) {
			figure[i]=(int)(Math.random()*3+1);
			
			if(figure[i]==1) {
				dohyung = "�ﰢ��";
			} else if(figure[i]==2) {
				dohyung = "�簢��";
			} else if(figure[i]==3) {
				dohyung = "��";
			}
			System.out.println(dohyung);
		}
	}
	public static void main(String[] args) {
		new Figure();
		
		
	}
}
