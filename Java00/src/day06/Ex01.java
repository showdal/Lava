package day06;
/*

문제1] 
	'A'~'J' 까지의 문자를 순차적으로 만들어서 배열에 넣고 
	각 문자를 하나씩 꺼내 소문자로 변경하고 출력하세요.
	
	배열에 담긴 내용은 문자열로 확인해서 출력


문제2]
	A'~'J' 까지의 문자를 랜덤하게 100개 발생시킨 후
	각 문자의 카운트를 구해서(숫자) 출력하세요.
	
	숫자만큼 별표를 찍어 출력

문제 3]
	int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
	이라는 배열을 준비하고
	
	79456원을 준비된 화폐단위로 계산할 때 각각의 화폐단위가 몇개씩 필요한지
	갯수를 저장할 배열을 만들고
	출력하는 프로그램을 작성하세요.
	
	
문제 4]	
	반지름 5개를 기억할 배열을 만들고
	
	각가의 반지름을 가진 원의 넓이를 계산해서 저장할 배열을 만들고
	각 원의 둘레를 계산해서 저장할 배열도 만들어서
	
	결과를 출력하는 프로그램을 작성하세요.
	
	단, 출력형태는
		
		예]
			반지름 : 10, 원의 둘레 : 62.8, 원의 넓이 : 314
		의 형태로 출력되게 하세요.
	
문제 5]

	피보나치 수열 10개를 저장할 배열을 만들고
	배열에 값을 입력해서
	배열에 저장된 데이터를 출력하세요.
	
문제 6]
	팩토리얼 10개를 저장할 배열을 만들고
	1부터 순차적으로 10까지의 팩토리얼을 만들어서 배열에 담고
	꺼내서 출력하세요.

문제7]
	문자열을 입력받아서
	문자배열에 문자열을 이루는 문자를 순차적으로 저장하세요
	
		특정위치 문자를 추출해주는 함수
		문자열.charAt(위치값);
		
		길이 반환 함수
		문자열.length();
		
		반환값이 정수

문제8]
	회원의 이름, 전화번호, 이메일을 저장할 배열을 만들고
	데이터를 입력해서
	
	이름을 입력하면
	이름 전화번호 이메일을 출력해주는 프로그램을 작성하세요.


	
*/
import java.util.*;
public class Ex01 {
	public Ex01() {
//		sol1();	
//		sol2();	
//		sol3();	
//		sol4();	
//		sol5();	
//		sol6();	
//		sol7();	
		sol8();	
		
		
	}
	
	public void sol1() {
		
		char ch = ' ';
			
		char[] big = new char[10];
		char[] small = new char[10];
		
		for(int i=0; i<10; i++) {
			big[i] = (char)(ch+i);
		}	
		for(int i=0; i<10; i++) {
			small[i] = (char)(ch+i+'a'-'A');
			System.out.println(small[i]);
		}

		
		
	}
	
	public void sol2() {
		char ch[] = new char[100];
		int[] cnt = new int[10];
		
		for(int i=0; i<100; i++) {
			
			char tmp = (char)(Math.random()*('J'-'A'+1)+'A');
			ch[i] = tmp;
		}
		for(int i=0; i<100; i++) {
			int idx = ch[i] - 'A';
			cnt[idx] += 1;
		}
		for(int i=0; i<10; i++) {
			System.out.print((char)('A'+i));
			for(int j=0; j<cnt[i]; j++) {
				System.out.print("*");
		}
			System.out.println();		
	}
}
	
	public void sol3() {
		int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
		int total = 79456;
		int[] cnt = new int[8];
		for(int i=0; i<8; i++) {
			cnt[i] = total/coin[i];
			total = total%coin[i];
			System.out.println(coin[i] + " : " + cnt[i]);
		}
		
		
	}
	public void sol4() {
		
		int[] r = new int[5];
		double[] r2 = new double[5];	
		double[] rr = new double[5];
		for(int i=0; i<5; i++) {
			r[i] = (int)(Math.random()*(30-2+1)+2);
			r2[i] = r[i]*2*3.14;
			rr[i] = r[i]*r[i]*3.14;
			
			System.out.printf("반지름 : " + r[i]+ ", 원의 둘레 : "+ r2[i] + ", 원의 넓이 : " +"%.2f",rr[i]);
			System.out.println();
		}
	}
	
	public void sol5() {
		int[] no1 = new int[10];
		int no2 = 1;
		int no3 = 1;
		System.out.print(no2+", ");
		System.out.print(no2+", ");

		for(int i=0; i<=8; i++) {
			no1[i] = no2+no3;
			no2 = no3;
			no3 = no1[i];
			System.out.print(no1[i]+", ");
		}
	}
	
	public void sol6() {
		int[] no1 = new int[10];
		int no2 = 1;
		
		System.out.print(no2+", ");
		for(int i=1; i<=9; i++) {
			no1[i] = no2 * (i+1);
			no2 = no1[i];		
			System.out.print(no1[i]+", ");
		}
	}
	public void sol7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력 : ");
		String a = sc.nextLine();
		char [] b =  new char[a.length()];
		
		
		for(int i=0; i<a.length(); i++){
		b [i] = a.charAt(i);
		System.out.print(b[i] + "|");
		
		}
	}
	public void sol8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String a = sc.nextLine();
		String [] name = new String[] {"soyoung", "dooyong", "taehee", "seojin", "hee"};
		String [] phone = new String[] {"010-0000-0000", "010-0010-0000",
										"010-0000-0000", "010-0000-0000","010-0000-0000"};
		String [] mail = new String[] {"@", "@", "@", "@", "@"};

		int[] num = new int[]{1,2,3,4,5};
		for(int i=0; i<5; i++){
			a = name[i];
			if() {
				
			} 
			
			
			
			
			System.out.print(name[i] +", " +phone[i] + ", " + mail[i]);
		}
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new Ex01();	
	}
}