package day04;
/*	
 	
 	do ~ while : for, while ��ɰ� �޸�
	 			 ������ ó�� ����̹Ƿ� ���ǿ� ������� ������ 1�� �̻� ������
	
	����] 
		1 - 
		2 - do {	}
		3 - while(���ǽ�);
		4 -
	����] 1-2-3(��)-2-3(��)-2-3(����)-4 
	
*/
public class Test06 {

	public static void main(String[] args) {
		int no = 10;
		
		do {
			System.out.println(no);
		} while(no++ <10);
	}

}
