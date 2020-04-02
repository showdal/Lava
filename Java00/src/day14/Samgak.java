package day14;
/*
����2]
	�ﰢ�� Ŭ������ �ۼ��ϰ�
	�غ��� ���̸� �Է��ؼ� ��ü�� ���鵵�� �ۼ��ϰ�
	
	�غ��� ������ ���� �ﰢ���� �ǵ���
	equals, toString()�� �������̵��ϰ� �׽�Ʈ
	
	������� JOptionPane �Ҽ� �Լ��� �ϰ�
	����ó���� �ϼ���.	
	
 */
public class Samgak {
	private int mit;
	private int nop;
	
	public Samgak() {
		
	}
	public Samgak(int mit) throws NumberFormatException{
		if(mit<=0) {
			throw new NumberFormatException();
		}
		this.mit=mit;
	}
	public int setMit() {
		return mit;
	}
	
	
	public boolean equals(Object obj) {
		boolean bool = false;
		Samgak s1 = (Samgak)obj;
		bool = (this.mit==s1.mit)?true:false;
		return bool;
	}
	
	@Override
	public String toString() {
		return "�غ���" + mit + "�� �ﰢ�� �� ���� �����մϴ�.";
	}
	
	
	
}
