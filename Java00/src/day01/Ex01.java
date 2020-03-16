package day01;

public class Ex01 {
	public static void main(String[] args){	
		
/*  문제1]	5,10,20을 제외한 숫자 하나를 가정하고 이것을 2진수로 바꿔보고
		 	실제 프로그램의 결과와 일치하는지 확인하세요.
			비트코드 확인 방법
			Integer.toBinaryString(숫자);
			
	문제2] 	반지름이 7인 원의 넓이, 둘레
		 	반지름 둘레 넓이는 변수를 만들어 처리
		 	둘레는 float 타입 변수
	
	문제3] 	두개의 정수를 변수에 담고
		 	두 수를 가로, 세로로 하는 사각형의 넓이를 구하세요.
	
	문제4]	문3의 숫자를 밑변, 높이로 하는 삼각형의 넓이를 구하세요.
	
	문제5]	54232원을 지불하는데, 우리나라의 화폐로 각 단위가 몇개나 필요한지 계산
		 	5만원권 - 1장
		 	1천원권 - 1장
		 
	숙제] 	1년은 365.2426일 = 며칠 몇시간 몇분 몇초

*/
		
		
//		문제1]
//		12 ==> 1100
		System.out.println("12의 이진수는 "
							+ Integer.toBinaryString(12)+"입니다.");
		
//		문제2]
		float r = 7 * 2 * 3.14f;
		double h = 7 * 7 * 3.14;
		System.out.println("원의 둘레는 " + r);
		System.out.println("원의 넓이는 " +h);
		
//		문제3]
		int a = 8;
		int b = 9;
		double c = a * b ;
		System.out.println("사각형의 넓이는 " + c);
		
//		문제4]
		double d = a * b / 2;
		System.out.println("삼각형의 넓이는 " + d);
		
//		문제5]
		int m = 53232;
		
		int oman = 0; 
		int man = 0;
		int ochun = 0;
		int chun = 0;
		int obaek = 0;
		int baek = 0;
		int osip = 0;
		int sip = 0;
		int il = 0;
		
		int tmp = m;
		oman = tmp / 50000;
		tmp %= 50000;
		man = tmp / 10000;
		tmp %= 10000;
		ochun = tmp / 5000;
		tmp %= 5000;
		chun = tmp / 1000;
		tmp %= 1000;
		obaek = tmp / 500;
		tmp %= 500;
		baek = tmp / 100;
		tmp %= 100;
		osip = tmp / 50;
		tmp %= 50;
		sip = tmp / 10;
		tmp %= 10;
		il = tmp / 1;
		tmp %= 1;
		
		System.out.println
				("53232원에 필요한 오만원권은" + oman + " 장, " + 
				"만원권은 " + man + "장, " +
				"오천원권은 " + ochun + "장, " +
				"천원권은 " +chun + "장, " +
				"오백원은 " + obaek + "개, " +
				"백원은 " + baek + "개, " +
				"오십원은 " + osip + "개, " +
				"십원은 " + sip + "개, " +
				"일원은 " + il + "개입니다.");
		
		
//		숙제]
		double s = 365.2426;
				
		int day = 0;
		int hour = 0;
		int mi = 0;
		int se = 0 ;
				
		day = (int)s;
		s %= 1;
		hour = (int)(s * 24);
		s %= 24;
		
		mi = (int)((s * 24 - hour) * 60);
		s %= 60;
		se = (int)((((s * 24 - hour) * 60) - (int)((s * 24 - hour) * 60)) * 60);
		
		System.out.println(day);
		System.out.println(hour);
		System.out.println(mi);
		System.out.println(se);
		
		System.out.println("1년 365.2426일은 " + day +  "일 "
						+ hour + "시간 " + mi + "분 " + se+  "초 입니다.");
	
//		답 356일 5시간 49분 21초
		

		
		
	

	}
}
