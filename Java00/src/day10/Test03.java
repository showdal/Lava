package day10;
/*
	Square 클래스를 5개 관리할 배열을 생성
	가로 세로는 1-29 랜덤 생성
	
	각 네모의 가로 세로 넓이를 출력
*/


public class Test03 {
	
	Square[] nemo;
	
	public void nemo() {
		nemo = new Square[5];
		
		for(int i=0; i<nemo.length; i++) {
			nemo[i] = new Square();
			
			int wid = (int)(Math.random()*(29-1+1)+1);
			int hei = (int)(Math.random()*(29-1+1)+1);
			nemo[i].result(wid,hei);
		}
	}
	public static void main(String[] args) {
		Test03 t = new Test03();
		Test03 t1 = new Test03();
		
		t.nemo();
		for(int i=0; i<t.nemo.length; i++) {
			t.nemo[i].print();
		}
		System.out.println();
		
		t1.nemo();
		for(int i=0; i<t.nemo.length; i++) {
			t1.nemo[i].print();
		}
	}
}
