package day19;

/*
   ���� 5]
   		1. day19/etc �� �����ϳ��� ������ �����.
   			day19/etc/snue
   		2. ��λ� ���� �������� �Ѳ����� �����.
   			day19/etc/zzz/abc
   		
   		3. ������� ������ �ϳ��� �����Ѵ�.
   			(���� �� ���� ����, ���ϵ� ���� ����)
   		
 */

import java.io.*;
import javax.swing.*;
import java.util.*;
public class Test05 {

	public Test05() {
		// ����� ���� ����(��� �������) ���Ϸ� �����.
		/*
		// 1.
		File file = new File("src/day19/etc/snue");
		file.mkdir();
		*/
		
		/*
		// 2.
		File file = new File("src/day19/etc/zzz/abc");
		file.mkdirs();
		*/
		
		/*
		// 3.
		File file = new File("src/day19/etc/zzz/abc");
		file.delete();
		*/
		
		// 4.
		File oldF = new File("src/day19/etc/Sample.txt");
		File newF = new File("src/day19/etc/Sample.inrepas");
		// �ٲ�����.
		oldF.renameTo(newF);
		
	}

	public static void main(String[] args) {
		new Test05();
	}

}
