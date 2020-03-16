package day02;
/*

함수 : 기능을 가진 최소 단위
=> [접근지정자] [속성] 반환값타입 함수이름(매개변수리스트){
	함수내용...
	return [반환값]; 		=> 반환값이 없는 경우 즉시 함수 명령 종료
	}
	
	
=> public int addNums(int no1, int no2){
		int sum = no1 + no2;
		return sum;
   }
*/
public class Test03 {
	public Test03(){
		int sum = addNums(10,50);
		System.out.println(sum);
	}
	public static void main(String[] args) {
		new Test03();
	}

	public int addNums(int no1, int no2){
		int sum = no1 + no2;
		return sum; // => int no1 + no2;
	}
}
