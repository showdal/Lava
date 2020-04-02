package day11;
/*
	문제3]
		문제 1,2번에서 만든 클래스를 객체로 만들어서
		각 생성자함수가 올바르게 작동하는지 실행하세요.
 
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
