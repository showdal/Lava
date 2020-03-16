package day04;
/*
	label이 붙은 for 명령 : 반복문이 중첩될 경우
							내부의 반복문에서 조건에 따라서 바깥 반복문을
							제어해야 될 경우가 생긴다.
							이때 해당 반복문을 제어해줄 용도로 쓰이는 반복문
							적용 명령은 break나 continue를 쓸 수 있다.
						
							
	형식]
		
		라벨이름 :
		for(;;){
			for(;;){
				break 라벨이름; 
			}
		}
	
	주의]
		라벨에 의한 처리는 직속관계에 한해서만 작용
		
		label1:
		for(){
		
		}
		for(){
			break 라벨;		<= ㄴㄴ
			continue label; <= ㅇㅋ
		}	
	
 */
public class Test07 {

	public static void main(String[] args) {
		t1:
		for(int no = 2; no <=9; no++) {
			for(int go = 1; go <= 9; go++) {
				if(no ==3 && go >=5) {
					continue t1;
				}
				System.out.println(no + "x" + go + "=" + no*go);
			}
		}
	}

}
