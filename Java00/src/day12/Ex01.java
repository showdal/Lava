package day12;
/*
 	문제1] 학생의 java,db,himl,javascript,spring,sum,avg
 		   점수를 관리할 배열을 만들고
 		   총점과 평균을 구해서 출력하세요.
 		   
 		   5명의 학생의 총점과 평균
 		   과목별 총점과 평균을 배열로 만들어서 출력하세요.
 		   
 		   double[][] score = new double[7][7];
 
 */
public class Ex01 {
	double[][] score = new double[7][7];
	int java,db,html,javascript,spring,sum;
	double avg;
	
	
	public Ex01() {
		
		
		
		setSub();
		setAvg();
		toPrint();
	}
	public Ex01(int java,int db,int html,int javascript,int spring,int sum, double avg){
		this.java=java;
		this.db=db;
		this.html=html;
		this.javascript=javascript;
		this.spring=spring;
		
		
		
	}
	public void setSub() {
		for(int i=0; i<score.length-2; i++) {
			for(int j=0; j<score[i].length-2; j++) {
			
				score[i][j]+=(int)(Math.random()*100+1);
			}
			System.out.println(score[i][0]);
		}
	}
	
	public double setAvg() {
		avg = sum/5;
		return avg;
	}
	public void toPrint() {
		System.out.println(java);
		System.out.println(db); 
		System.out.println(html);
		System.out.println(javascript);
		System.out.println(spring);

		System.out.println(sum);
		System.out.println(avg);
		
		
	}
	
	
	public static void main(String[] args) {
		new Ex01();
	}

}
