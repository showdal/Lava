package day02;

public class Test07 {
/*
	출력 함수
	
	println(내용)
	print(내용)
	printf(형식,내용) : 내용을 형식에 맞게 출력 

*/
	public Test07(){
		System.out.print("**\n**"); // 엔터
		System.out.print("**\t**"); // 탭
		System.out.printf("- %5d -", 20);
		System.out.printf("%5d", 10);
		System.out.printf("%7.2f%n",3.141592);
		System.out.printf("%5s","show");
	}
	
	public static void main(String[] args) {
		new Test07();
	}

}
