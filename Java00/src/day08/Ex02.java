package day08;

import java.util.*;
public class Ex02 {

	public static void main(String[] args) {
		
		
//		String [][] PP = {{"A","B","C","D","E"},{"����","����","����","����","����"}};

		int[][] stud = new int[5][];
		String [] st = {"�","�","�","�","�"};
		
		for(int i=0; i<5; i++) {
			int[] jumsoo = new int[5];
			for(int j=0; j<5; j++) {
				int a = (int)(Math.random()*101)+0;
				jumsoo[j] = a;
				
//				System.out.print(PP[0][i] + " - ");
//				System.out.println(PP[1][j] + " - " + a);
//				System.out.println(Arrays.deepToString(PP[0]));
			}
//			jumsoo[0] = 1000 + i;
			stud[i] = jumsoo;
		}
//		System.out.println(Arrays.toString(stud));
//		System.out.println(Arrays.deepToString(stud));
		
		
		System.out.println(" �̸�  ����  ����  ����  ����  ����");
		System.out.println("------------------------------------");
		for(int i=0; i<stud.length; i++) {
			System.out.print(" " + st[i] + " ");
			for(int j = 0 ; j < stud[i].length; j++ ) {
				System.out.printf("%4d |", stud[i][j]);
			}
			System.out.println();
			System.out.println("------------------------------------");
		}
	}
}


