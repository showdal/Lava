package day10;

import java.util.Arrays;

/*
		10���� ������ ������ �Է��� �迭�� �����
		�� �迭�� ��� ������
		����, ����� ���ؼ� ������ִ� ���α׷��� �ۼ��ϼ���.
		��, �Է�, �������, ��հ��, ����� �Լ��� �����ؼ� ó���ϼ���.
 */

public class Grade {
	int[] score;
	int sum;
	double avg;
	
	// �迭 �ʱ�ȭ & ���� �Է�
	public void result(){
		score = new int[10];
		
		for(int i=0; i<score.length; i++) {
			score[i] = (int)(Math.random()*(100-1+1)-1);
		}
	}
	
	// ���� �����ִ� �Լ�
	public void setSum() {
		int total = 0;
		 
		for(int i = 0 ; i < score.length ; i++ ) {
			total += score[i];
		}
		sum = total;
	}
	
	public void setAvg() {
		double avg1 = sum /10.;
		avg1 = avg;
		}
	
	
	// ��� �����ִ� �Լ�
	
	
	public void print() {
		System.out.println(Arrays.toString(score)+"\n ���� : " + sum + "\n ���: " + avg);
		System.out.println("----------------");
	}	
	

}
