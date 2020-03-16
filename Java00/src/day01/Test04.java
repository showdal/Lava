package day01;
/**
 * 클래스의 정보를 담는 주석
 * @author show
 * @since 2020.03.09
 * @version v.1.0
 * @see (참고해야할 클래스를 나열하는 부분)
 *  
 *  	변경이력
 *  		2020.03.09 - 클래스 제작 - 담당자 : 쇼
 *  
 */
public class Test04 {
	public static void main(String[] args){
		
		/*
		 증감연산자
		 	++, --
		 	변수에 붙여지며 붙여진 변수의 값을 +1, -1 해준다.
		 	기호 이후에 처음 나오는 변수에 한해서 한번만
		*/
		
		int no1 = 10;
		int no2 = no1++ + ++no1;
		System.out.println(no2);
		
		
		int num1 = 10;
		int num2 = ++num1 + num1++;
		System.out.println(num2);
		
		
		int num3 = 5;
		System.out.println();
		
		
	}
}
