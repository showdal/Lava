package day10;

public class Solv03 {

	public static void main(String[] args) {
		String[] name = {"A","B","C","D","E"};
		Study[] ban = new Study[5]; 
		for(int i=0; i<ban.length; i++) {
			ban[i] = new Study(name[i]);
		}
		for(int i=0; i<ban.length; i++) {
			ban[i].tpPrint();
			
		}
		
	}

}
