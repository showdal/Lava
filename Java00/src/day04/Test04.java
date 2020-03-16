package day04;
/*
	반복문
	
	forEach : 시퀀스 자료형에 들어있는 데이터를 꺼내 변수에 담아주는 반복문
	
	형식]
 		for(데이터 타입 변수이름 : 시퀀스 자료형){
 			실행문...
 		}
 	
 	참고] 데이터 타입은 시퀀스 자료형에 들어있는 데이터 타입과 동일
 		  
 		  인덱스가 0부터 시작해서 마지막까지 자동으로 데이터를 꺼내 변수에 담는다.
 
 
 */


public class Test04 {
	public Test04() {
		sol();
	}
	public void sol() {
		int[] arr = {1, 2, 3, 4, 5};
		
		for(int no : arr) {
			System.out.print(no + " | ");
		}
	}
	public static void main(String[] args) {
		new Test04();
	}

}
