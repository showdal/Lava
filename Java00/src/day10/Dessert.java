package day10;

import java.util.Arrays;

/*
*	[ Dessert ]								
*											
*	�ֱ� 5�⵿���� ����� �迭�� ��Ƽ� �����Ϸ��� �Ѵ�.
*	int[][] gion = new int[5][2];			
*											
*	�� �����									
*	ù��° �濡�� ����� -20 ~ 40���� �����ϰ� �Է��ϰ�				
*	�ι�° �濡�� ������ 1 ~ 5���� �ε������������� ä����������.

*/
public class Dessert {
	public static void main(String[] args) {
		int[][] gion = new int[5][2];	 
		
		for(int i=0; i<gion.length; i++) {
			gion[i][0] = (int)(Math.random()*(40+20+1)-20);
		}
		for(int i=0; i<gion.length-1; i++) {
			for(int j=0; j<gion.length; j++) {
				if(gion[i][0]>gion[j][0]) {
					int[] tmp = gion[i];
					gion[i] = gion[j];
					gion[j] = tmp;
				}
			}
		}
		for(int i=0; i<gion.length; i++) {
			gion[i][1] = i+1;
			
		}
		
		for(int[] g:gion) {
			System.out.println(Arrays.toString(g));
		}
	}
}
