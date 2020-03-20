package day08.preSolv;

import java.util.Arrays;

import javax.swing.*;
public class Solv04 {
	
	public static void main(String[] args) {
		String phone = JOptionPane.showInputDialog("Phone number : ");
		
		int cnt = 0;
		for(int i=0; i<phone.length(); i++) {
			char ch = phone.charAt(i);
			if(ch<'0'||ch>'9') ++cnt;			
		}
		String [] arr = new String[cnt+1];
		
		String tmp = phone;
		int idx = 0;
		for(int i =0; i<cnt; i++) {
			idx = tmp.indexOf('-');
			arr[i] = tmp.substring(0, idx);
			tmp = tmp.substring(idx+1);
		}
		arr[cnt] = tmp;
		JOptionPane.showMessageDialog(null, phone + " : " + Arrays.toString(arr));
	}
}
