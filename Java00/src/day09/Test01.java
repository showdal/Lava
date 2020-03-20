package day09;

import java.util.*;

public class Test01 {

	public static void main(String[] args) {
//		{'0','1','2','3','4','5','6','7','8','9'},{'A','B','C','D','E','F','G','H','I','J'}
		char[][] ch = new char [3][10];
	
		ch = new char[][]{{},{},{'가','나','다','라','마','바','사','아','자','차'}};
		
						
//					char no= 'A'+1;
						
						
		for(int i=0; i<ch.length; i++) {
			for(int j=0; j<ch[i].length; j++) {
			
			ch[0][j] = (char)(j+48);
			ch[1][j] = (char)(j+65);
//			ch[2][j] = (char)(j+48);
			}
		}
						
		
		for(int i=0; i<ch.length; i++) {
			for(int j=0; j<ch[i].length; j++) {
				System.out.print(ch[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int i=0; i<ch.length-1; i++) {
			for(int j=0; j<ch[i].length; j++) {

				System.out.print(ch[i][j]);				
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int i=0; i<ch.length; i++) {
			i = 2*i;
			for(int j=0; j<ch[i].length; j++) {

				System.out.print(ch[i][j]);				
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int i=0; i<ch[0].length; i++) {
			for(int j=0; j<ch.length; j++) {
				System.out.print(ch[j][i]);			
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int i=0; i<ch[0].length-1; i++) {
			for(int j=0; j<ch.length-1; j++) {
				System.out.print(ch[j][i]);			
			}
			System.out.println();
		}
		System.out.println();
		
		
		for(int i=0; i<ch[0].length; i++) {
			for(int j=0; j<ch.length; j++) {
				j = 2*j;
				System.out.print(ch[j][i]);			
			}
			System.out.println();
		}
		System.out.println();
	}
	
}


