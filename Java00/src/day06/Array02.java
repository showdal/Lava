package day06;

import java.util.Arrays;

/*
	�迭 ������ �ݺ���
	
	1-10���� ���� �� �迭
	
	
 */
public class Array02 {

	public static void main(String[] args) {
		int[]arr = new int[10];
		
		int i=0;
		while(i<10) {
			arr[i]=i+1;
			i++;
		}
		for(int no:arr) {
			System.out.printf("%3d",no);			
			
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));	
	}
}
