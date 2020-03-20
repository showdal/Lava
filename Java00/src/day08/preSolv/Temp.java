package day08.preSolv;

public class Temp {

	public static void main(String[] args) {
		String str = "We are the World!";
		System.out.println(str.substring(str.indexOf('W', str.indexOf('W')+1), str.indexOf('!')));
	} 

}
