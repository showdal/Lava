package day12;
/*
 	����1] �л��� java,db,himl,javascript,spring,sum,avg
 		   ������ ������ �迭�� �����
 		   ������ ����� ���ؼ� ����ϼ���.
 		   
 		   5���� �л��� ������ ���
 		   ���� ������ ����� �迭�� ���� ����ϼ���.
 		   
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
