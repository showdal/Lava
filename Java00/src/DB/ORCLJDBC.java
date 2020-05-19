package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * �� Ŭ������ ������ ���̽� �۾��� ���� JDBC�� ó���� �� �ʿ��� �������� ����� �����ϱ� ���� Ŭ����
 * @author	�
 * @since	2020.04.03
 * @version	v.1.0
 * @see		java.sql.*
 */

public class ORCLJDBC {
	Connection con = null;
	/*
	 	�� Ŭ������ new ��Ű�� ����
	 	�⺻������ ���� �ʿ��� ����̹��ε� �۾��� ���ÿ� ������ ���̴�.
	 */
	public ORCLJDBC() {
		try {
			// ����̹� �ε��ϰ�
				Class.forName("oracle.jdbc.driver.OracleDriver");
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	
		// Ŀ�ؼ� ������ �Լ�
		public Connection getCon() {
			return getCon("hello","hello");
		}
		
		public Connection getCon(String id, String password) {
			Connection con = null;
			String url ="jdbc:oracle:thin:@localhost:1521:orcl";
			String user = id;
			String pw = password;
			
			try {
				con = DriverManager.getConnection(url, user, pw);
			} catch(Exception e) {
				e.printStackTrace();
			} 
			this.con = con;
			return con;
		}
		
		// Statement ������ �Լ�
		public Statement getSTMT() {
			Statement stmt= null;
			try {
				stmt = getCon().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			} catch(Exception e) {
				e.printStackTrace();
			} 
			return stmt;
		}
		
		// PreparedStatement ������ �Լ�
		public PreparedStatement getPSTMT(String sql) {
			PreparedStatement pstmt = null;
			try {
				pstmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			} catch(Exception e) {
				e.printStackTrace();
			}
			return pstmt;
		}
		
		// �ʿ䰡 ���� ��� ��� �ݾ��ִ� �Լ�
		public void close(Object o) {
			try {
				if(o instanceof Connection) {
					((Connection) o).close();
				} else if (o instanceof Statement) {
					((Statement) o).close();
				} else if (o instanceof PreparedStatement) {
					((PreparedStatement) o).close();
				} else if (o instanceof ResultSet) {
					((ResultSet) o).close();
				}
			} catch(Exception e) {
		}
	}
}