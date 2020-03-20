package day09;

public class Ex01 {
	/*
	Strint str = GitHub is built for collaboration.
	Set up an organization to improve the way your team works together,
	 and get access to more features.
	*/
	public static void main(String[] args) {
		String str = "GitHub is built for collaboration. Set up an organization to improve the way your team works together, and get access to more features.";
		int cnt = 0;
		int idx = str.indexOf('.');
		
		String [] str1 = new String[cnt];
		String [] str2 = new String[cnt];
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(c == '.') {
				++cnt;
			}
		}
		System.out.println(cnt);
		
		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<str.length(); j++) {
				str1[i] = str.substring(0, idx);
				
			}
			System.out.println(str1[i]);
		}
	}
}
