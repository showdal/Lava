package day03;

public class Ex01 {
	public Ex01() {
		sol();
		
		
		
	}
//	1-100 중 정수 3개 랜덤 추출하여 큰 수부터 차례로 출력되게 하세요. 변수 4개
	public void sol() {
		int no1 = (int)(Math.random()*(100-1+1))+1;
		int no2 = (int)(Math.random()*(100-1+1))+1;
		int no3 = (int)(Math.random()*(100-1+1))+1;
		
		
//		no2 no1 no3 
//		no2 no3 no1
//		no3 no2 no1

//		no1 no2 no3	
//		no1 no3 no2
//		no3 no1 no2	
		if(no1 > no2 && no2 < no3 || no1 < no3) {
			int no4 = no2;
			no2 = no1;
			no1 = no4;
			
		} else if(no2 > no3) {
			int no4 = no2;
			no2 = no3;
			no3 = no4;
		} else if(no2 > no3) {
			int no4 = no2;
			no2 = no3;
			no3 = no4;	
		} else if(no2 > no3) {
			int no4 = no2;
			no2 = no3;
			no3 = no4;		
		} else {
			
			
		}

			
		
		
		
		System.out.println(no1 + ", " +no2 + ", " + no3);
		
		
	}
	public static void main(String[] args) {
		new Ex01();
		for(int i = 0; i < 10 ; i++ ) {
			// 세 정수를 랜덤하게 만든다.
			int max = (int)(Math.random()*(100 - 1 + 1) + 1);
			int mid = (int)(Math.random()*(100 - 1 + 1) + 1);
			int min = (int)(Math.random()*(100 - 1 + 1) + 1);
			// 임시변수를 만든다.
			int tmp = 0;
			
			// 비교해서 처리한다.
			if(max >= mid) {
				// max > mid
				if(mid >= min) { // max > mid > min
					// 할일 없음
				} else { // min > mid
					// max와 min 이 대소비교가 아니된 상태
					if(max >= min) { // max > min > mid
						tmp = mid;
						mid = min;
						min = tmp;
					} else { // min > max > mid
						tmp = max;
						max = min;
						min = tmp;
						
						tmp = mid;
						mid = min;
						min = tmp;
					}
				}
			} else {
				// mid > max
				
				if(mid >= min) { // mid > max & min
					if(max > min) { // mid > max >min
						tmp = max;
						max = mid;
						mid = tmp;
					} else { // mid > min > max
						tmp = max;
						max = mid;
						mid = tmp;
						
						tmp = mid;
						mid = min;
						min = tmp;
					}
				} else { // min > mid > max
					tmp = max;
					max = min;
					min = tmp;
				}
			}
			
			// 출력한다.
			System.out.print("max : " + max + " | ");
			System.out.print("mid : " + mid + " | ");
			System.out.print("min : " + min + " ");
			System.out.println((max >= mid)&&(mid >= min));
			
		}
		
	}



	}


