package day07;

import java.util.Arrays;

/*

반장님 문제 ]
	45 ~ 1 까지 저장할 배열을 만들고
	배열에서 로또 번호를 꺼내서 로또 한게임을 만들고 출력하세요.	
	
문제1]
	알파벳 10개를 저장할 배열을 만들고
	대문자 10개를 랜덤하게 추출해서 배열에 저장하고
	저장된 배열을 얕은 복사로 복사해서
	출력하고,
	원래 배열을 소문자로 변경한 후
	두 배열을 출력하세요.

문제2]
	정수 10개를 저장할 배열을 만들고
	랜덤하게 1 ~ 50까지 수중 발생시켜서
	배열에 담고
	배열의 5번째까지의 데이터를 깊은 복사로 복사하세요.
	
문제3]
	회원의 이름, 전화번호, 이메일을 저장할 배열을 만들고 	- 문자열 배열 3개
	데이터를 입력해 놓고
	
	이름을 입력하면 
	그 사람의 데이터를 모두 저장할 배열을 만들어서
	데이터를 넣고 출력하세요.
	
문제4]
	전화번호를 입력하면
	'-'를 기준으로 데이터를 분리해서
	저장할 배열을 만들고 분리된 데이터를 순서에 맞게 입력하고 출력하세요.
	indexOf()
	substring()
		
extra]
	영문 문자열을 입력받아 해당 알파벳의 개수를 '*'로 표현


*/

import javax.swing.*;
import java.util.*;
public class Ex01 {
	public Ex01() {
//		sol1();
//		sol2();
//		sol3();
//		sol4();
//		sol4_1();
		extra();
		
		
	}
	public void sol1() {
		char [] a = new char[10];
		char [] b = new char[10];
		
		for(int i=0; i<10; i++) {
			char c = (char)(Math.random()*('Z'-'A'+1)+'A');
			a[i] = c;
		}
		b=a;
		System.out.println(Arrays.toString(a));
		for(int i=0; i<10; i++) {
			b[i] += 32;
		}
		System.out.println(Arrays.toString(b));
	}
	
	public void sol2() {
		int [] a = new int[10];
		int [] b = new int[10];
		
		for(int i=0; i<10; i++) {
			a[i] = (int)(Math.random()*50+1);
		}		
		System.out.println(Arrays.toString(a));
		System.arraycopy(a,0,b,0,5);
		System.out.println(Arrays.toString(b));
	}
	
	public void sol3() {
		String [] name = new String[] {"쇼영", "dooyong", "taehee", "seojin", "wooseung"};
		String [] phone = new String[] {"010-0000-0000", "010-0010-0000",
										"010-0000-4000", "010-0300-0000","010-0050-0000"};
		String [] mail = new String[] {"dj@", "a@", "s@", "d@", "f@"};
		
		String c = JOptionPane.showInputDialog("Name : ");
		int idx = -1;
		for(int i=0; i<name.length; i++) {
			
			if(c.equals(name[i])) {
				idx = i;
			} 
		}
		String [] d = new String[] {name[idx],phone[idx],mail[idx]};
//		System.out.println(Arrays.toString(d));
		JOptionPane.showMessageDialog(null, d);
	}

	
	
	public void sol4() {
		String a = JOptionPane.showInputDialog("Phone number : ");

		int g = a.indexOf('-');
		String c = a.substring(0,g);
		
		String g1  = a.substring(g+1);
		int g2 = g1.indexOf('-');
		
		String d = g1.substring(0,g2);
		String e = g1.substring(g2+1);			
		
		String [] b = new String[] {c,d,e};
		JOptionPane.showMessageDialog(null, Arrays.toString(b));
		
		//		System.out.println(b);
		
//		int idx=-1;
//		for(int i=0; i>a.length(); i++) {
//			if(a.equals(b[i])) {
//				idx=i;
//			}
//		}
//		JOptionPane.showMessageDialog(null, c +"-"+ d +"-"+ e);
	}
	
	public void sol4_1() {
		String sTel = "010-1234-5678";
		String[] sNum = new String[3];
	
		int idx = sTel.indexOf('-');
		sNum[0] = sTel.substring(0, idx);
		String tmp = sTel.substring(idx + 1);
		idx = tmp.indexOf('-');
		sNum[1] = tmp.substring(0, idx);
		sNum[2] = tmp.substring(idx + 1);
	}
	
	public void extra() {
		String a = JOptionPane.showInputDialog("Message : ");
		String tmp = a.substring(0, 1);
		
		loop:
		for(int i = 0 ; i < a.length(); i++ ) {
			char ch1 = a.charAt(i); // b
			for(int j = 0 ; j < tmp.length(); j++ ) {
				if(ch1 == tmp.charAt(j)) {
					continue loop;
				}
			}
			tmp += ch1; // ab
		}
		
//		System.out.println(tmp);
		
		char[] chArr = tmp.toCharArray();
		int[] cnt = new int[chArr.length];
		for(int i = 0 ; i < chArr.length ; i++ ) {
			for(int j = 0; j < a.length(); j++ ) {
				if(a.charAt(j) == chArr[i]) {
					cnt[i] += 1;
				}
			}
		}
		for(int i = 0 ; i < cnt.length; i++ ) {
			System.out.print(chArr[i] + " : ");
			for(int j = 0 ; j < cnt[i];  j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}

		/*
		String b [] = new String [a.length()];
		int [] c = new int[a.length()];
		int idx = -1;
		
		for(int i=0; i<b.length; i++) {
//			idx = b[i];
			c[idx] +=1; 
		}
		for(int i=0; i<b.length; i++) {
			System.out.print((char)('A'+i));
			for(int j=0; j<c[i]; j++) {
				System.out.print(c.length);
			}
		}
		
		*/
		
/*		c:
		for(int i=0; i<b.length; i++) {
			a=b[i];
			for(int j=0; j<i; j++) {
				if(a.equals(b[i])) {
					i--;
					continue c;
				}
			}
		}
		for(int i=0; i<b.length-1; i++) {
			for(int j=i+1; j<b.length; j++) {
				if(b[i] != b[j]) {
					String d = b[i];
					b[i] = b[j];
					b[j] = d;
					
					
				}
			}
		}
*/		
//		JOptionPane.showMessageDialog(null, Arrays.toString(b));
	}
	public static void main(String[] args) {
		new Ex01();
	}

}
