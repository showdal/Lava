package day01;

public class Ex01 {
	public static void main(String[] args){	
		
/*  ����1]	5,10,20�� ������ ���� �ϳ��� �����ϰ� �̰��� 2������ �ٲ㺸��
		 	���� ���α׷��� ����� ��ġ�ϴ��� Ȯ���ϼ���.
			��Ʈ�ڵ� Ȯ�� ���
			Integer.toBinaryString(����);
			
	����2] 	�������� 7�� ���� ����, �ѷ�
		 	������ �ѷ� ���̴� ������ ����� ó��
		 	�ѷ��� float Ÿ�� ����
	
	����3] 	�ΰ��� ������ ������ ���
		 	�� ���� ����, ���η� �ϴ� �簢���� ���̸� ���ϼ���.
	
	����4]	��3�� ���ڸ� �غ�, ���̷� �ϴ� �ﰢ���� ���̸� ���ϼ���.
	
	����5]	54232���� �����ϴµ�, �츮������ ȭ��� �� ������ ��� �ʿ����� ���
		 	5������ - 1��
		 	1õ���� - 1��
		 
	����] 	1���� 365.2426�� = ��ĥ ��ð� ��� ����

*/
		
		
//		����1]
//		12 ==> 1100
		System.out.println("12�� �������� "
							+ Integer.toBinaryString(12)+"�Դϴ�.");
		
//		����2]
		float r = 7 * 2 * 3.14f;
		double h = 7 * 7 * 3.14;
		System.out.println("���� �ѷ��� " + r);
		System.out.println("���� ���̴� " +h);
		
//		����3]
		int a = 8;
		int b = 9;
		double c = a * b ;
		System.out.println("�簢���� ���̴� " + c);
		
//		����4]
		double d = a * b / 2;
		System.out.println("�ﰢ���� ���̴� " + d);
		
//		����5]
		int m = 53232;
		
		int oman = 0; 
		int man = 0;
		int ochun = 0;
		int chun = 0;
		int obaek = 0;
		int baek = 0;
		int osip = 0;
		int sip = 0;
		int il = 0;
		
		int tmp = m;
		oman = tmp / 50000;
		tmp %= 50000;
		man = tmp / 10000;
		tmp %= 10000;
		ochun = tmp / 5000;
		tmp %= 5000;
		chun = tmp / 1000;
		tmp %= 1000;
		obaek = tmp / 500;
		tmp %= 500;
		baek = tmp / 100;
		tmp %= 100;
		osip = tmp / 50;
		tmp %= 50;
		sip = tmp / 10;
		tmp %= 10;
		il = tmp / 1;
		tmp %= 1;
		
		System.out.println
				("53232���� �ʿ��� ����������" + oman + " ��, " + 
				"�������� " + man + "��, " +
				"��õ������ " + ochun + "��, " +
				"õ������ " +chun + "��, " +
				"������� " + obaek + "��, " +
				"����� " + baek + "��, " +
				"���ʿ��� " + osip + "��, " +
				"�ʿ��� " + sip + "��, " +
				"�Ͽ��� " + il + "���Դϴ�.");
		
		
//		����]
		double s = 365.2426;
				
		int day = 0;
		int hour = 0;
		int mi = 0;
		int se = 0 ;
				
		day = (int)s;
		s %= 1;
		hour = (int)(s * 24);
		s %= 24;
		
		mi = (int)((s * 24 - hour) * 60);
		s %= 60;
		se = (int)((((s * 24 - hour) * 60) - (int)((s * 24 - hour) * 60)) * 60);
		
		System.out.println(day);
		System.out.println(hour);
		System.out.println(mi);
		System.out.println(se);
		
		System.out.println("1�� 365.2426���� " + day +  "�� "
						+ hour + "�ð� " + mi + "�� " + se+  "�� �Դϴ�.");
	
//		�� 356�� 5�ð� 49�� 21��
		

		
		
	

	}
}
