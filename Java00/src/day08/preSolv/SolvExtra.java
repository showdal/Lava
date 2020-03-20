package day08.preSolv;

import javax.swing.*;
public class SolvExtra {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("In : ");
//		String str = "show me the money";
		String str2 = "";
		
		loop:
		for(int i = 0; i<str.length(); i++) {
			char str3 = str.charAt(i);
			for(int j = 0; j<str2.length(); j++) {
				if(str3 == str2.charAt(j)) {
					continue loop;
				}
			}
			str2 += str3;
		}
		int cnt = str2.length();
		char[] ch = str2.toCharArray();
		 
		for(int i = 0; i<ch.length-1; i++) {
			for(int j = i+1; j<ch.length; j++) {
				if(ch[i] > ch[j]) {
					char c = ch[i];
					ch[i] = ch[j];
					ch[j] = c;
				}
			}
		}
		int[] count = new int[cnt];
		for(int i = 0; i<ch.length; i++) {
			char c = ch[i];
			for(int j = 0; j<str.length(); j++) {
				if(c == str.charAt(j)) {
					++count[i];
				}
			}
		}
/*
		for(int i = 0; i<ch.length; i++) {
			System.out.print(ch[i] + " : ");
			for(int j = 0; j<count[i]; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
*/
		StringBuffer buff = new StringBuffer();
		for(int i = 0 ; i < ch.length ; i++ ) {
			buff.append("  ");
			buff.append(ch[i]);
			buff.append(" ");
			buff.append("   :   ");
			for(int j = 0 ; j < count[i] ; j++ ) {
				buff.append("*");
			}
			buff.append("\n");
		}
		JOptionPane.showMessageDialog(null, buff.toString());
	}
}





