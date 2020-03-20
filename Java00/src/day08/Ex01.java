package day08;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		
		String [] name = {"A", "B", "C", "D", "E","F", "G", "H", "I", "J","K", "L", "M", "N", "O"};
		String [] phone = {"010-0000-0000","010-0000-0000","010-0000-0000","010-0000-0000","010-0000-0000","010-0000-0000","010-0000-0000","010-0000-0000","010-0000-0000","010-0000-0000","010-0000-0000","010-0000-0000","010-0000-0000","010-0000-0000","010-0000-0000"};
		String [] email = {"A@", "B@", "C@", "D@", "E@","F@", "G@", "H@", "I@", "J@","K@", "L@", "M", "N@", "O@"};
		
		String [][] Team1 = new String [6][3];
		String [][] Team2 = new String [6][3];
//		String [][] Team3 = new String [6][3];
		
		String [][][] Team = new String [2][][];
		
		for(int i=0; i<6; i++) {
			Team1 [0][0][i] = {Team1,name,};
			
			
			Team1[i][0] = name[i];
			Team1[i][1] = phone[i];
			Team1[i][2] = email[i];
		}
//			for(int j=6; j<11; i++) {
//			Team1[i][0] = name[i];
//			Team1[i][1] = phone[i];
//			Team1[i][2] = email[i];
//		}
//		
//		
			
			
			
		System.out.println(Team [0][0][0]);
//		System.out.println(Arrays.deepToString(Team3));
		System.out.println(Arrays.deepToString(Team1));
//		System.out.println(Arrays.deepToString(Team2));
		}
}
