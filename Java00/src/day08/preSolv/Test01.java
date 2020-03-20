package day08.preSolv;

import java.util.Arrays;

public class Test01 {
	/*
	 
	 {}{}{}
	 */
	
	public static void main(String[] args) {
		int [][] num = new int[3][5];
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				num[i][j] = i+1;
			}
		}
		System.out.println(Arrays.deepToString(num));
	}
}
