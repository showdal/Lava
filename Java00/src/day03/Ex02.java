package day03;
/*
	����] �Խù� ���� 0-100 ���̸� �����ϰ� ������ ��, 
		  �ʿ��� �Խ��� ���� ���ϴ� ���α׷� (�� �������� �Խñ� 15, �Խñ� 0���� ��� 1������)
*/
public class Ex02 {
	public Ex02() {
		sol();
	}
	public void sol() {
		int no1 = (int)(Math.random()*(100-0+1));
//		int no1 = 0;
		System.out.println("�Խñ� �� : " + no1);
		int no2 = 0;
		if (no1 % 15 == 0 & no1 != 0) {
			no2 = no1 /15;			
		} else if(no1 != 0) {
			no2 = no1 /15 +1;
		}else if(no1 == 0){	
			no2 = no1+1;
			}
		System.out.println("�ʿ��� �Խ����� �� : " + no2);				
		
	}
	public static void main(String[] args) {
		new Ex02();

	}

}
