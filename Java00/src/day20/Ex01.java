package day20;

/*
  	���� 1 ]
  		emp ���̺��� �����
  		����̸��� 'SMITH'�� �����
  			�����ȣ, ����̸�, �޿�, �μ���ȣ, �μ��̸�, �μ���ġ
  		�� ������ �����ּ���.
  		
  		
 */
import java.util.*;
import java.sql.*;
import javax.swing.*;
public class Ex01 {
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	public Ex01() {
		dbInit();
		
		String sql = "SELECT empno, ename, sal, deptno, dname, dloc FROM emp,dept WHERE ename ="SMITH",;
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
