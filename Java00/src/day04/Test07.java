package day04;
/*
	label�� ���� for ��� : �ݺ����� ��ø�� ���
							������ �ݺ������� ���ǿ� ���� �ٱ� �ݺ�����
							�����ؾ� �� ��찡 �����.
							�̶� �ش� �ݺ����� �������� �뵵�� ���̴� �ݺ���
							���� ����� break�� continue�� �� �� �ִ�.
						
							
	����]
		
		���̸� :
		for(;;){
			for(;;){
				break ���̸�; 
			}
		}
	
	����]
		�󺧿� ���� ó���� ���Ӱ��迡 ���ؼ��� �ۿ�
		
		label1:
		for(){
		
		}
		for(){
			break ��;		<= ����
			continue label; <= ����
		}	
	
 */
public class Test07 {

	public static void main(String[] args) {
		t1:
		for(int no = 2; no <=9; no++) {
			for(int go = 1; go <= 9; go++) {
				if(no ==3 && go >=5) {
					continue t1;
				}
				System.out.println(no + "x" + go + "=" + no*go);
			}
		}
	}

}
