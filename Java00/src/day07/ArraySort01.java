package day07;
/*
	����]
		�ζ� �� ������ �迭�� ���
		���� ��ȣ������ ����
		
		1-45���� 6�� ����


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
		for(int i=0; i<a.length-1; i++) { // ������ ���ڴ� ���� �ʿ� ����
			for(int j=i+1; j<a.length; j++) {
				if(a[i] > a[j]) { // �տ� ���� ��ȣ���� ���ڰ� ���� ���
					 int d = a[i];
					 a[i] = a[j];
					 a[j] = d;
				}
			}
		}
		JOptionPane.showMessageDialog(null,"<html><b style=\"color: purple;\"> �� �� ��÷ �� </b></html>\n" + 
				Arrays.toString(a));
	}
	
}


