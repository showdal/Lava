package day02;

public class Test07 {
/*
	��� �Լ�
	
	println(����)
	print(����)
	printf(����,����) : ������ ���Ŀ� �°� ��� 

*/
	public Test07(){
		System.out.print("**\n**"); // ����
		System.out.print("**\t**"); // ��
		System.out.printf("- %5d -", 20);
		System.out.printf("%5d", 10);
		System.out.printf("%7.2f%n",3.141592);
		System.out.printf("%5s","show");
	}
	
	public static void main(String[] args) {
		new Test07();
	}

}
