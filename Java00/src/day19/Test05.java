package day19;

/*
   예제 5]
   		1. day19/etc 에 폴더하나를 강제로 만든다.
   			day19/etc/snue
   		2. 경로상에 없는 폴더까지 한꺼번에 만든다.
   			day19/etc/zzz/abc
   		
   		3. 만들어진 파일중 하나를 삭제한다.
   			(폴더 도 삭제 가능, 파일도 삭제 가능)
   		
 */

import java.io.*;
import javax.swing.*;
import java.util.*;
public class Test05 {

	public Test05() {
		// 만들고 싶은 폴더(없어도 상관없다) 파일로 만든다.
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
		// 바꿔주자.
		oldF.renameTo(newF);
		
	}

	public static void main(String[] args) {
		new Test05();
	}

}
