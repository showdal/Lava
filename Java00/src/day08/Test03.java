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
//		���� for���
		for(int[] no1 : no) { //2���� �迭���� �� �濡�� ���� 1���� �迭�� �����. 
			for(int no2 : no1) {
				
				System.out.printf("%2d, ",no2);
			}
			System.out.println();
		}
	}	
}
