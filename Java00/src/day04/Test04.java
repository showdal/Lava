package day04;
/*
	�ݺ���
	
	forEach : ������ �ڷ����� ����ִ� �����͸� ���� ������ ����ִ� �ݺ���
	
	����]
 		for(������ Ÿ�� �����̸� : ������ �ڷ���){
 			���๮...
 		}
 	
 	����] ������ Ÿ���� ������ �ڷ����� ����ִ� ������ Ÿ�԰� ����
 		  
 		  �ε����� 0���� �����ؼ� ���������� �ڵ����� �����͸� ���� ������ ��´�.
 
 
 */


public class Test04 {
	public Test04() {
		sol();
	}
	public void sol() {
		int[] arr = {1, 2, 3, 4, 5};
		
		for(int no : arr) {
			System.out.print(no + " | ");
		}
	}
	public static void main(String[] args) {
		new Test04();
	}

}
