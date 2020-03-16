package day03;
import java.util.*;
/*
	������
		=> ���� ���� �� �� 
		   ���� ���� �ٲ� �� ����ϴ� ���
	
	1. ���� ���� ��� : Ư�� ���ǿ� ���� ���� ������ �ٲٴ� ���
		   
	����]	
		1) if : ������ �����ϰ� �� ���ǿ� �´� ��쿡�� ó���ϴ� ���ǹ�
			
		����]
			if(���ǽ�){
				���๮...
			}
			==> ���ǽ��� �´� ��쿡�� ���๮�� �����ϰ� 
				���� �ʴ� ��쿡�� ���๮�� �ǳʶٴ� ���
				
		2) if ~ else : ������ �����ϰ� ���ǿ� �´� ���� ���� ��� �ΰ����� ó���ϴ� ���ǹ�
			
		����]
			if(���ǽ�){
				���๮1	<= ��
			} else {
				���๮2	<= ����
			}
			==> ���ǽ��� �´� ���� ���๮1�� �����ϰ�, 
				�´� ���� ���๮2�� �����ϴ� ���
			
		3) if ~ else if ~ else : ������ �ΰ� �̻��� �����ϰ� �� ���ǿ� �´� ��츦 ó���ϴ� ���ǹ�
			
		����]
			if(���ǽ�1){
				���๮1
			} else if(���ǽ�2){
				���๮2
			} else if(���ǽ�3){
				���๮3
			...
					
			} else {
				���๮n
			}
			==> ���ǽ��� �������� �����ؼ� �� ���ǹ��� �´� ���๮�� �����ϴ� ���ǹ�
				
			
		4) switch ~ case : ������ ó���ϴµ� �����͸� �������� �����ϰ� 
						   �� �����Ϳ� �´� ��� ó�����ִ� ���
		����]
			switch(����){
			case ������1:
				 ���๮1;
				   break;
			case ������2:
				 ���๮2;
				   break;
			...
			default:
				 ���๮n;
			}
			==> ������ ���� ��ġ�ϴ� case ���� ���๮�� ���� ó���ϴ� ���ǽ�		
				
				
	2. �ݺ� ���� ��� : 
	
				
				
 */
public class Test01 {
	public Test01() {
		sol1();
		sol2();
		sol3();
	}
//	����] ���� �ΰ��� �Է¹޾Ƽ� ū ������ ���� ���� �� ���� ����ϼ���.
	public void sol1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("no1 : ");
		int no1 = sc.nextInt();
		System.out.print("no2 : ");
		int no2 = sc.nextInt();
		int no3 = no1 - no2;
		System.out.println(Math.abs(no3));
	}
	
	public void sol2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("no1 : ");
		int no1 = sc.nextInt();
		System.out.print("no2 : ");
		int no2 = sc.nextInt();
		
		int no3 = 0;
		int max = 0;
		int min = 0;
		
		if(no1 > no2) {
			max = no1;
			min = no2;
			no3 = no1 - no2;
		} else {
			max = no2;
			min = no1;
			no3 = no2 - no1;
		}
		System.out.println(max +"��"+ min +"���� : "+ no3 );
	}
	
	public void sol3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("no1 : ");
		int no1 = sc.nextInt();
		System.out.print("no2 : ");
		int no2 = sc.nextInt();
		int no3 = 0;
		
		if(no2 > no1) {
			int max = no1;
			no1 = no2;
			no2 = max;
			no3 = no1 - no2;
		} else {
			no3 = no2 - no1;
		}
		System.out.println(no1 +"��"+ no2 +"���� : "+ no3 );
	}
	
	
	public static void main(String[] args) {
		new Test01();

	}

}
