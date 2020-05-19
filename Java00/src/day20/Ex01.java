package day20;

/*
  	문제 1 ]
  		emp 테이블의 사원중
  		사원이름이 'SMITH'인 사원의
  			사원번호, 사원이름, 급여, 부서번호, 부서이름, 부서위치
  		를 꺼내서 보여주세요.
  		
  		
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
