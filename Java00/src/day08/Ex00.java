package day08;

import java.util.Arrays;

public class Ex00 {

	public static void main(String[] args) {
		
		int [][] gg = new int [8][9];
		
		
		for(int i=0; i<gg.length; i++) {
			gg [0][i] = i+2;
		}
		for(int i=0; i<gg.length; i++) {
			gg [1][i] = i+1;
		}
		for(int i=0; i<gg[0].length; i++) {
			for(int j=0; j<gg[1].length; j++) {
			gg [0][i] = i+2;
			gg [1][i] = j+1;
			gg[i][j] = (i+2) * (j+1);
		System.out.println((gg[0][i] + " X " + gg[1][i] + " = " + gg[i][j]));
			}
			System.out.println("-----------");
		}
	}
}
