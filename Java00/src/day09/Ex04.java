package day09;
import java.util.Arrays;

/*
  문제 3] 5학생의 국어, 영어, 수학, 물리, 국사 점수를 입력받아 총점과 석차를 구하는 프로그램을 작성하세요. 단, 입력, 총점계산,
  석차계산, 출력은 함수로 처리하세요.
  
  단, 배열은 [5][7] 의 형태로 만든다.
  
 */
import javax.swing.JOptionPane;
public class Ex04 {
	
	String [][] bb = new String [5][7];; 
	
	public Ex04() {
//		int [][] bb = data();
		
	}
	//초기화
	public void data() {
		
		bb=new String[5][7];
		System.out.print("점수 데이터 : ");
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
