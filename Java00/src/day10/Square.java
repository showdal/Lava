package day10;
/**
 *  이 클래스는 사각형의 가로 세로 넓이
 *  
 *  
 * @author	쇼영
 * @since	2020.03.20
 * @version v.1.0
 * @see

 * @param args
 */

public class Square {
	int wid;
	int hei;
	int area;
	
	public void result(int no1, int no2){
		
		wid = no1;
		hei = no2;
		area = no1*no2;
	}
	public void print(){
		System.out.println("가로 : "+wid+"\n세로 : "+hei+"\n넓이 : "+area);
		System.out.println("----------");
	}
	public static void main(String[] args) {
		
		
	}
}
