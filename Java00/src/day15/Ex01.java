package day15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

/*
	¹®Á¦1]
		ÀÌ¸ŞÀÏÀ» ÀÔ·Â¹Ş¾Æ ÀÔ·Â¹ŞÀº ¹®ÀÚ¿­ÀÇ ÀÌ¸ŞÀÏ Çü½ÄÀÌ ¸Â´ÂÁö ¾Æ´ÑÁö °Ë»ç
		ÀÌ¸ŞÀÏ Çü½ÄÀº
			¾ËÆÄºª+¼ıÀÚ 8ÀÚÀÌ»ó @ µµ¸ŞÀÎÁÖ¼Ò
 	Âü°í]
 		ÇÑ±Û : [°¡-ÆR] ÇÑ±Û ºÒ°¡
 	
 */
public class Ex01 {
	public Ex01() {
		String val = JOptionPane.showInputDialog("Email");
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{8,}@[a-zA-Z0-9]\\.[a-zA-Z0-9]{2,6}");
		
		Matcher match = pattern.matcher(val);
		
		if(match.matches()) {
			JOptionPane.showMessageDialog(null, "Right");
		} else {
			JOptionPane.showMessageDialog(null, "Wrong");
		}
	}

	public static void main(String[] args) {
		new Ex01();
		
		
	}

}
