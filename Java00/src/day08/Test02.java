package day08;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		String [][] Team3 = {{"¼î¿µ", "dooyong", "taehee", "seojin", "wooseung"},
		 {"010-0000-0000", "010-0010-0000",
										"010-0000-4000", "010-0300-0000","010-0050-0000"},
		 {"dj@", "a@", "s@", "d@", "f@"}};
		
		String [] name = new String[] {"¼î¿µ", "dooyong", "taehee", "seojin", "wooseung"};
		String [] phone = new String[] {"010-0000-0000", "010-0010-0000",
										"010-0000-4000", "010-0300-0000","010-0050-0000"};
		String [] mail = new String[] {"dj@", "a@", "s@", "d@", "f@"};
		
		String[][] team = new String[3][name.length];
		for(int i=0; i<name.length; i++) {
			team[0][i] = name[i];
			team[1][i] = phone[i];
			team[2][i] = mail[i];
		}
		String[][] team1 = new String[3][];
		team1[0] = name;
		team1[1] = phone;
		team1[2] = mail;

		System.out.println(Arrays.deepToString(team1));
		System.out.println(Arrays.deepToString(Team3));
		System.out.println(Arrays.deepToString(team));
		
		
	}
}
