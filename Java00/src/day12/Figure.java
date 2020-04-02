package day12;
/*
문제 3]
	Figure 클래스를 정의하고
	상속받아서 삼각형, 사각형, 원의 클래스를 정의한 후
	
	1 ~ 3 까지의 정수를 랜덤하게 10개 만들어서
	1의 경우 삼각형
	2의 경우 사각형
	3의 경우 원
	을 배열에 넣어
	
	출력하세요.
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
				dohyung = "삼각형";
			} else if(figure[i]==2) {
				dohyung = "사각형";
			} else if(figure[i]==3) {
				dohyung = "원";
			}
			System.out.println(dohyung);
		}
	}
	public static void main(String[] args) {
		new Figure();
		
		
	}
}
