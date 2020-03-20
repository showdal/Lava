package day06;
/*
 	1-5까지 기억할 배열을 만들고 내용 출력
 */
import java.util.*;
public class Array01 {
	public static void main(String[] args) {
		int[] num;
		num = new int[] {1,2,3,4,5};
		int[] num2 = {1,2,3,4,5};
		for(int i=0; i<num.length; i++) {
			int no = num[i];
			
			System.out.print(no + ", ");
		}
		System.out.println();
		String str = Arrays.toString(num);
		System.out.println(str);
		
		System.out.println(num);
	}

}