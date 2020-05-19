package day20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;
public class Test01 {

	public Test01() {
		// ����
		/*
		 1. JDBC��� �ܺ� �����ͺ��̽��� ������ ����̹��� �̹� �߰��� �� ���Ҵ�.
		 	���� �� ���α׷����� �� ����̹��� ������ �;� �Ѵ�.
		 	�ܺ� Ŭ������ �ε��ϴ� �Լ�
		 	
		 		Class.forName(Ŭ�����̸�)
		 */
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 1. ���� ����̹� �ε��� ���� ���´�.
			// 2. ������ �õ��غ���.
			
			/*
			 	������ �����ͺ��̽����� �����ϴ� ���(URL)�� �ణ�� �ٸ���.
			 	�� ��� ���� ���۸�....��
			 	
			 	�����ϴ� ����� JDBC���� ����� �ϸ� �ȴ�.
			 	DriverManager.getConnection();
			 */
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "hello";
			String pw = "hello";
			
			// �� url�� �����ͺ��̽����� ���ݾ� �޶�����.
			Connection con = DriverManager.getConnection(url,user,pw);
			
			/*
			 	��ó�� ������ �ϰԵǸ� �����ڸ� �����ϴ� ������ �����ϴµ�
			 	�� ������ �����ϴ� Ŭ������ �ٷ� Connection �̴�.
			 	
			 	��������� �����ͺ��̽��鸶�� ���ݾ� ������ �޶����� �κ��̴�
			 	���ĺ��ʹ� �׻� ������ ������� JDBC���� ����� ������
			 	JDBC�� �ش� DBMS���� ����� �����Ѵ�.
			 */
			
			JOptionPane.showMessageDialog(null, "��");
			
			// ���� ����Ŭ�� ���ӵ� �Ǿ��� ���� ���Ǹ���� ��������.
			// 3. Statement �����.
			Statement stmt = con.createStatement();
			
			// 4. ���� ����� �����
			ArrayList<String> avtList = new ArrayList<String>();
			avtList.add("INSERT INTO avatar VALUES(11, 'img_avatar1.png','img_avatar1.png','M')");
			avtList.add("INSERT INTO avatar VALUES(12, 'img_avatar1.png','img_avatar1.png','M')");
			avtList.add("INSERT INTO avatar VALUES(13, 'img_avatar1.png','img_avatar1.png','M')");
			avtList.add("INSERT INTO avatar VALUES(14, 'img_avatar1.png','img_avatar1.png','F')");
			avtList.add("INSERT INTO avatar VALUES(15, 'img_avatar1.png','img_avatar1.png','F')");
			avtList.add("INSERT INTO avatar VALUES(16, 'img_avatar1.png','img_avatar1.png','F')");
			
			String sql01 = "INSERT INTO member VALUES(1001, '��ҿ�', 'show','12345','show@increpas.com','F','010-2411-7378','14','Y')";
			String sql02 = "INSERT INTO member VALUES(1000, '�ֵο�', 'DD','12345','DD@increpas.com','M','010-1111-1111','11','Y')";
			String sql03 = "INSERT INTO member VALUES(1002, '�����', 'chairman','12345','chair@increpas.com','F','010-2222-2222','12','Y')";
			
			// ���� Statement�� ���� ����� �Ǿ���� �ȴ�.
			/*
			int cnt = 0;
			for(int i=0; i<avtList.size(); i++) {
				cnt += stmt.executeUpdate(avtList.get(i));
			}
			JOptionPane.showMessageDialog(null, "�Էµ� ������ ��"+cnt);
			// ȸ���� �߰��غ���.
			stmt.execute(sql01);
			stmt.execute(sql02);
			stmt.execute(sql03);
			 */
			
			String sql04 = "SELECT * FROM member WHERE mno = 1001";
			ResultSet rs = stmt.executeQuery(sql04);
			// ���� �۾����� BOF�̹Ƿ� ���� ������ ����ִ� ������ �� �� ������ �ȴ�.
			rs.next();
			/*
			int mno = rs.getInt(1);
			String name = rs.getString(2);
			String mid = rs.getString(3);
			String mpw = rs.getString(4);
			String mail = rs.getString(5);
			String gen = rs.getString(6);
			String tel = rs.getString(7);
			int ano = rs.getInt(8);
			char isshow = rs.getString(9).charAt(0);
			*/
			int mno = rs.getInt("mno");
			String name = rs.getString("name");
			String mid = rs.getString("id");
			String mpw = rs.getString("pw");
			String mail = rs.getString("mail");
			String gen = rs.getString("gen");
			String tel = rs.getString("tel");
			int ano = rs.getInt("ano");
			char isshow = rs.getString("isshow").charAt(0);
			
			
			
			
			JOptionPane.showMessageDialog(null, name + " ����\n ȸ����ȣ  : " + mno
					+ "\n ���̵�  : " + mid	 + "\n �н�����  : " + mpw + "\n �̸���  : " + mail
					 + "\n ����  : " + gen  + "\n ��ȭ��ȣ  : " + tel + "\n �ƹ�Ÿ��ȣ  : " + ano
					 + "\n Ȱ������  : " + ((isshow=='Y')?"Ȱ����":"Ż��ȸ��")); 
			
			
			/*
			if(bool) {
				JOptionPane.showMessageDialog(null, "����ִ�");
			} else {
				JOptionPane.showMessageDialog(null, "�������");
			}
			*/
			
			
//			String dsql = "TRUNCATE TABLE MEMBER";
//			stmt.execute(dsql);
		} catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
		} 
	}
	public static void main(String[] args) {
		new Test01();
	}
}
