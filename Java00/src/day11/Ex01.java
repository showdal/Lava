package day11;
/*
	����3]
		���� 1,2������ ���� Ŭ������ ��ü�� ����
		�� �������Լ��� �ùٸ��� �۵��ϴ��� �����ϼ���.
 
 */
public class Ex01 {
	public Ex01() {
		Circle[] round = new Circle[5];
		for(int i=0; i<round.length; i++) {
			if(i < 2) {
			round[i] = new Circle((int)(Math.random()*100+1));
		} else {
			round[i] = new Circle();
		}
		}
	for(int i=0; i<round.length; i++) {
		round[i].toPrint();
		}
	
	
	 Score[] score = new Score[3];
	 score[0] = new Score();
	 score[1] = new Score("A");
	 score[2] = new Score("show",0,1,2,3,4,5);
	
	 
	 for(int i=0; i<score.length; i++) {
			score[i].toPrint();
	 	}
}
	public static void main(String[] args) {
		new Ex01();
	}

}
