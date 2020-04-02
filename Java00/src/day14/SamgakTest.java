package day14;

import javax.swing.JOptionPane;

public class SamgakTest {
	String str1;
	String str2;
	Samgak sa1;
	Samgak sa2;
	
	public SamgakTest() {
		str1 = JOptionPane.showInputDialog("밑변을 입력하세요.");
		int mit1 = Integer.parseInt(str1);
		str2 = JOptionPane.showInputDialog("밑변을 입력하세요.");
		int mit2 = Integer.parseInt(str2);
		
		
		try {
			sa1 = new Samgak(mit1);
			sa2 = new Samgak(mit2);
			JOptionPane.showMessageDialog(null, str1.equals(str2)?("같음"):("다름"));
		} catch (NumberFormatException n){
			n.printStackTrace();
			JOptionPane.showMessageDialog(null, "다시 입력하세요."); 
		}
		
		if(str1.equals(str2)) {
		JOptionPane.showMessageDialog(null, sa1.toString()); 
		}
		
//		System.out.println(str1.equals(str2)?("같음"):("다름"));
//		System.out.println(s1.setMit());
//		System.out.println(s2.setMit());
	}
	public static void main(String[] args) {
		new SamgakTest();
		
	
	}
}
