package day19;

/*
 ����1] Ű���带 �̿��ؼ� ���ڸ� �Է¹���.
 */
import java.io.*;
import java.util.Arrays;
public class Test01 {
	/*
	 ����]
	 	Ű���� ���� �ܺ���ġ�̴�.
	 	���� ���̴� �ܺ���ġ�̱� ������
	 	�̹� ��Ʈ������ �غ��� ������ �����Ѵ�.
	 		
	 		System.in
	 */
	public Test01() {
	System.out.println("�� ���ڸ� �Է��ϼ���.");
	// ��������
	int ch = 0;
	
	try {
		/*
		//1.
		ch = System.in.read();
		System.out.println((char)ch);
		// 2. ***
		byte[] buff = new byte[256];
		// 256�� ���ڿ� ���� �ѹ��� �д� �������� ���� ��������.
		int len = System.in.read(buff);
		// ���� ����� ���ڷ� ��ȯ�ؼ� �������.
		String str = new String(buff,0,len);
		System.out.println(str);
		 */
		
		/*
		 */
		//3. �ַ� ��Ʈ��ũ ó���� �� �� ���� ����ϴ� ���
		byte[] buff = new byte[256];
		Arrays.fill(buff, (byte)'A'); // �迭�� ��� �����͸� 'A'�� ä���ش�.
//		System.out.println(Arrays.toString(buff));
		int len = System.in.read(buff,10,100);
		// �غ�� �迭 buff�� 10�� ����� ���� ������ ����ϼ���.
		// �ִ� 100������ ��������. 100���ڸ� �Է¹��� �� �ִ�.
		String str = new String(buff,0,len+20);
		//\n�� ��������.
		str = str.replace("\r\n", "*");
		
		
		System.out.println(str);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Test01();
	}
}




