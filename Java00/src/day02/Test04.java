package day02;
/*
	������(Constructor)
	=> Ŭ���� ����� �⺻���� �������ִ� ������ �Լ�
	   ��ȯ�� ����
	   
	   �ڹٰ���ӽ��� ������ �Լ��� ������ �����Ƿ�
	   �����ڸ� �������ִ� ���� ����.
	
	
	   public Ŭ�����̸�(){
		����...
	   }
	   
	   
	   
	 �񱳿�����
	 => ������ ����� ũ��� ���ϴ� ������
	 	
	 	���� �񱳴� �Ұ���
	 	(1<=no) & (no<=20)		<= �ϳ��� �����־�� �Ѵ�.
	 	
	 	
	 	
	 ��������
	 => &	�� ���� ��� ���� ���, ��
	  	|	�� ���� �� �ϳ��� ���� ���, ��
	  	!	���� ��� ����, ������ ��� ��
	  	
	 ���� ����
	  	&&	�������� ���� ��츸, �������� ����
	  	||	�������� ������ ��츸, �������� ����
	  	
	 	
	 */	

public class Test04 {
	
	public Test04(){
		test1();
		test2();
	}
	
	public static void main(String[] args) {
		new Test04();
	}
	
	public void test1() {
	
		char ch1 = 'A';
		char ch2 = 97;
		System.out.println("97 : " + ch2);
		int no = ch1;
		
		ch2 = (char)(no + 3);

		System.out.println(ch2);
		System.out.println(ch1 < 'a');
	}
	
	public void test2(){
		boolean bool1 = false;
		boolean bool2 = true;
		
		System.out.println(bool1 & bool2);
		System.out.println(bool1 | bool2);
		System.out.println (!(bool1 & bool2));
		System.out.println(bool1 & bool2);
		System.out.println(bool1 & bool2);
		
		int no1 = 10;
		int no2 = 11;
		
		System.out.println((no1 > no2) && ++no1 == no2);
		System.out.println(no1);
		System.out.println((no1 < no2) && ++no1 == no2);
		System.out.println(no1);
		
		System.out.println(35&24);
	}
	
}
