package day10;
/**
 *  �� Ŭ������ �簢���� ���� ���� ����
 *  
 *  
 * @author	�
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
		System.out.println("���� : "+wid+"\n���� : "+hei+"\n���� : "+area);
		System.out.println("----------");
	}
	public static void main(String[] args) {
		
		
	}
}
