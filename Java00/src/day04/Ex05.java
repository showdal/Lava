package day04;
/*
 	����5
 	1-2+3-4+5-6.....n > 100
 	n���� ����� ����ϴ� ���α׷�
 	


 */
public class Ex05 {
	public Ex05() {
		sol();
	}
	public void sol() {
		int i = 1;
		int sum = 0; 
		
		for(i=1; ; i++) {
				sum = (i%2==0) ? (sum-i) : (sum+i) ;
				if(sum >= 101) {
					System.out.println("n = " + i + ", �հ� = " +sum);
					break;
				}
		}
	}
	public static void main(String[] args) {
		new Ex05();
	}

}
