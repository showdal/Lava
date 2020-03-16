package day04;
/*	
 	
 	do ~ while : for, while 명령과 달리
	 			 후조건 처리 명령이므로 조건에 관계없이 무조건 1번 이상 실행함
	
	형식] 
		1 - 
		2 - do {	}
		3 - while(조건식);
		4 -
	순서] 1-2-3(참)-2-3(참)-2-3(거짓)-4 
	
*/
public class Test06 {

	public static void main(String[] args) {
		int no = 10;
		
		do {
			System.out.println(no);
		} while(no++ <10);
	}

}
