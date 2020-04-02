package day19;

/*
 예제1] 키보드를 이용해서 문자를 입력받자.
 */
import java.io.*;
import java.util.Arrays;
public class Test01 {
	/*
	 참고]
	 	키보드 역시 외부장치이다.
	 	자주 쓰이는 외부장치이기 때문에
	 	이미 스트림으로 준비한 변수가 존재한다.
	 		
	 		System.in
	 */
	public Test01() {
	System.out.println("한 글자를 입력하세요.");
	// 변수선언
	int ch = 0;
	
	try {
		/*
		//1.
		ch = System.in.read();
		System.out.println((char)ch);
		// 2. ***
		byte[] buff = new byte[256];
		// 256의 숫자에 따라서 한번에 읽는 데이터의 양이 정해진다.
		int len = System.in.read(buff);
		// 읽은 결과를 문자로 변환해서 출력하자.
		String str = new String(buff,0,len);
		System.out.println(str);
		 */
		
		/*
		 */
		//3. 주로 네트워크 처리를 할 때 많이 사용하는 방법
		byte[] buff = new byte[256];
		Arrays.fill(buff, (byte)'A'); // 배열의 모든 데이터를 'A'로 채워준다.
//		System.out.println(Arrays.toString(buff));
		int len = System.in.read(buff,10,100);
		// 준비된 배열 buff에 10번 방부터 읽은 내용을 기억하세요.
		// 최대 100까지만 읽으세요. 100글자만 입력받을 수 있다.
		String str = new String(buff,0,len+20);
		//\n을 지워보자.
		str = str.replace("\r\n", "*");
		
		
		System.out.println(str);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Test01();
	}
}




