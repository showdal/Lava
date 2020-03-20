package day07;

import java.util.Arrays;

// ±Ì¿∫ ∫πªÁ

import javax.swing.*;
public class Test02 {
	public Test02(){
//	Ex01();
	Ex02();	
}

	public void Ex01() {
		int[] num1 = {1,2,3,4,5,6,7,8,9,10};
		int[] num2 = new int[20];
		
		System.arraycopy(num1,5,num2,10,5);
		
		num1 [7] = 77;
		String a = Arrays.toString(num1) + "\n" +  Arrays.toString(num2);
		JOptionPane.showMessageDialog(null,a);
		
		
	}
	public void Ex02() {
		int[] num1 = {1,2,3,4,5,6,7,8,9,10};
		int[] num2 = new int[20];
		
		for(int i=0; i<5; i++) {
			num2[10+i] = num1[5+i];
		}
		
		
		System.arraycopy(num1,5,num2,10,5);
		
		num1 [7] = 77;
		String a = Arrays.toString(num1) + "\n" +  Arrays.toString(num2);
		JOptionPane.showMessageDialog(null,a);
		
		
	}

	
	
	public static void main(String[] args) {
		new Test02();
	}
}
