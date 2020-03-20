package day07;
/*
	예제]
		로또 한 게임을 배열에 담아
		낮은 번호순으로 정렬
		
		1-45에서 6개 추출


*/
import javax.swing.*;
import java.util.*;
public class ArraySort01 {

	public static void main(String[] args) {
		
		int [] a = new int[6];
		
		c:
		for(int i=0; i<a.length; i++) { //a.length = 6
			int b = (int)(Math.random()*45+1);
			a[i]=b;
			for(int j=0; j<i; j++) {
				if(a[j]==b) {
					i--;
					continue c;
				}
			}
		}
//		JOptionPane.showMessageDialog(null,Arrays.toString(a));
		for(int i=0; i<a.length-1; i++) { // 마지막 숫자는 비교할 필요 없음
			for(int j=i+1; j<a.length; j++) {
				if(a[i] > a[j]) { // 앞에 뽑은 번호보다 숫자가 작은 경우
					 int d = a[i];
					 a[i] = a[j];
					 a[j] = d;
				}
			}
		}
		JOptionPane.showMessageDialog(null,"<html><b style=\"color: purple;\"> ★ 축 당첨 ★ </b></html>\n" + 
				Arrays.toString(a));
	}
	
}


