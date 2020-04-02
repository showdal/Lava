package day12;

public class Array {
	
	public Array() {
	}
	
	public static void main(String[] args) {
		new Array();

		int [][] abc = new int [5][5];
		int cnt = 1;
		for(int i=0; i<abc.length; i++) {
			for(int j=0; j<abc[i].length; j++) {
				if(i%2==0) {
					abc[i][j] = i+cnt;
				} else {
					abc[i][j] = i+94+cnt;
				}
				++cnt;
			}
		}
		for(int i=0; i<abc.length; i++) {
			for(int j=0; j<abc.length; j++) {
			}
			System.out.printf("%3d",abc[i][0]);
			System.out.printf("%3d",abc[i][1]);
			System.out.printf("%3d",abc[i][2]);
			System.out.printf("%3d",abc[i][3]);
			System.out.printf("%3d",abc[i][4]);
			System.out.println();
		}
		
		
		
		
		
	}
}
