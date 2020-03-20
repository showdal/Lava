package day10;

import java.util.Arrays;

/*
		10개의 과목의 점수를 입력할 배열을 만들고
		그 배열에 담긴 점수의
		총점, 평균을 구해서 출력해주는 프로그램을 작성하세요.
		단, 입력, 총점계산, 평균계산, 출력은 함수를 제작해서 처리하세요.
 */

public class Grade {
	int[] score;
	int sum;
	double avg;
	
	// 배열 초기화 & 점수 입력
	public void result(){
		score = new int[10];
		
		for(int i=0; i<score.length; i++) {
			score[i] = (int)(Math.random()*(100-1+1)-1);
		}
	}
	
	// 총점 구해주는 함수
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
	
	
	// 평균 구해주는 함수
	
	
	public void print() {
		System.out.println(Arrays.toString(score)+"\n 총점 : " + sum + "\n 평균: " + avg);
		System.out.println("----------------");
	}	
	

}
