package day11.preSolv;

public class Ex04Solv {
	public Ex04Solv() {
		String[] name = {"A","B","C","D","E"};
		
		
		Stud[] ban = new Stud[name.length]; 
		
		ban = setArr1(ban,name);
		ban = setSort1(ban);
		//���
		System.out.printf("%2s :%3s|%3s|%3s|%3s|%3s|%3s|%3s\n","�̸�","����","����","����","����","�ڵ�","����","���");
		for(int i=0; i<ban.length; i++) {
			ban[i].toPrint();
		}
		
		System.out.println();
		setArr(ban,name);
		setSort(ban);
		System.out.printf("%2s :%3s|%3s|%3s|%3s|%3s|%3s|%3s\n","�̸�","����","����","����","����","�ڵ�","����","���");
		for(int i=0; i<ban.length; i++) {
			ban[i].toPrint();
		}
	}
	// �����μ��� �̸��� �Է¹޾� �迭�� ����
	// �����μ� �տ����� �Ϲݺ��� ����, �ڿ��� �Ұ���
	public Stud[] setArr1(Stud[] s, String...name) { 
		for(int i=0; i<name.length; i++) {
			s[i] = new Stud(name[i]);
		}
		return s;
	}
	public void setArr(Stud[] s, String...name) {
		for(int i=0; i<name.length; i++) {
			s[i] = new Stud(name[i]);
		}
	}
	
	
	
	
	// ����
	public Stud[] setSort1(Stud[] s) {
		for(int i=0; i<s.length-1; i++) {
			for(int j=i+1; j<s.length; j++) {
				if(s[i].getSum()<s[j].getSum()) {
					Stud tmp = s[i]; 
					s[i] = s[j];
					s[j] = tmp;
				}
			}
			
		}
		return s;
	}
	public void setSort(Stud[] s) {
		for(int i=0; i<s.length-1; i++) {
			for(int j=i+1; j<s.length; j++) {
				if(s[i].getSum()<s[j].getSum()) {
					Stud tmp = s[i]; 
					s[i] = s[j];
					s[j] = tmp;
				}
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		new Ex04Solv();
	}

}
