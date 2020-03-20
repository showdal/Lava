package day08;

import java.util.Arrays;

public class Test03 {

	public static void main(String[] args) {
		
		int [][] no = new int [3][7];
		
		for(int i=0; i<no.length; i++) {
			for(int j=0; j<no[i].length; j++) {
				no[i][j] = 3*(i+1)+j;
				
			}
		}
//		향상된 for명령
		for(int[] no1 : no) { //2차원 배열에서 각 방에서 꺼내 1차원 배열로 만든다. 
			for(int no2 : no1) {
				
				System.out.printf("%2d, ",no2);
			}
			System.out.println();
		}
	}	
}
