package day09;
import java.util.Arrays;

/*
  ���� 3] 5�л��� ����, ����, ����, ����, ���� ������ �Է¹޾� ������ ������ ���ϴ� ���α׷��� �ۼ��ϼ���. ��, �Է�, �������,
  �������, ����� �Լ��� ó���ϼ���.
  
  ��, �迭�� [5][7] �� ���·� �����.
  
 */
import javax.swing.JOptionPane;
public class Ex04 {
	
	String [][] bb = new String [5][7];; 
	
	public Ex04() {
//		int [][] bb = data();
		
	}
	//�ʱ�ȭ
	public void data() {
		
		bb=new String[5][7];
		System.out.print("���� ������ : ");
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				int pp = (int)((Math.random()*100)+1);
//				bb[i][j] = pp;
//				System.out.print(pp + ", ");
			}
//			System.out.println(Arrays.deepToString(pp));
		}				
	}		
	
	
	public int sum(int[][] a) {
		int b = 0;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				b += a[i][j];
				a[i][5] = b;
			}
		}
		return b;
	}		
	public int level () {
		
		int c = 0;
		for(int i=5; i>5; i--) {
			
			
			
			
		}
		return c;
	}	
	
		
	
	public static void main(String[] args) {
		new Ex04();
	}
}
