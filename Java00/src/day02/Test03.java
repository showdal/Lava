package day02;
/*

�Լ� : ����� ���� �ּ� ����
=> [����������] [�Ӽ�] ��ȯ��Ÿ�� �Լ��̸�(�Ű���������Ʈ){
	�Լ�����...
	return [��ȯ��]; 		=> ��ȯ���� ���� ��� ��� �Լ� ��� ����
	}
	
	
=> public int addNums(int no1, int no2){
		int sum = no1 + no2;
		return sum;
   }
*/
public class Test03 {
	public Test03(){
		int sum = addNums(10,50);
		System.out.println(sum);
	}
	public static void main(String[] args) {
		new Test03();
	}

	public int addNums(int no1, int no2){
		int sum = no1 + no2;
		return sum; // => int no1 + no2;
	}
}
