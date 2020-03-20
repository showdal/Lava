package day07;

import java.util.Arrays;

import javax.swing.*;
public class Solv07 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Input");
		
		char[] ch = new char[str.length()];
		char[] ch1 = new char[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			ch[i] = str.charAt(i); 
			ch1[i] = str.charAt(str.length()-1-i); 
		}
		System.out.println(str);
		System.out.println(Arrays.toString(ch));
		System.out.println(Arrays.toString(ch1));
		
		String msg = str + Arrays.toString(ch) + Arrays.toString(ch1);
		JOptionPane.showMessageDialog(null,msg); // (부모창,데이터)
	}

}
