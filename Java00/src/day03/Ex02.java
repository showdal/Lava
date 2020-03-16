package day03;
/*
	문제] 게시물 개수 0-100 사이를 랜덤하게 추출한 후, 
		  필요한 게시판 수를 구하는 프로그램 (한 페이지에 게시글 15, 게시글 0개의 경우 1페이지)
*/
public class Ex02 {
	public Ex02() {
		sol();
	}
	public void sol() {
		int no1 = (int)(Math.random()*(100-0+1));
//		int no1 = 0;
		System.out.println("게시글 수 : " + no1);
		int no2 = 0;
		if (no1 % 15 == 0 & no1 != 0) {
			no2 = no1 /15;			
		} else if(no1 != 0) {
			no2 = no1 /15 +1;
		}else if(no1 == 0){	
			no2 = no1+1;
			}
		System.out.println("필요한 게시판의 수 : " + no2);				
		
	}
	public static void main(String[] args) {
		new Ex02();

	}

}
