package day20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;
public class Test01 {

	public Test01() {
		// 할일
		/*
		 1. JDBC라고 외부 데이터베이스를 연결할 드라이버는 이미 추가를 해 놓았다.
		 	이제 이 프로그램에서 그 드라이버를 가지고 와야 한다.
		 	외부 클래스를 로딩하는 함수
		 	
		 		Class.forName(클래스이름)
		 */
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 1. 이제 드라이버 로딩은 끝난 상태다.
			// 2. 연결을 시도해보자.
			
			/*
			 	각각의 데이터베이스마다 접속하는 방법(URL)이 약간씩 다르다.
			 	이 방법 역시 구글링....힛
			 	
			 	접속하는 방법은 JDBC에게 명령을 하면 된다.
			 	DriverManager.getConnection();
			 */
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "hello";
			String pw = "hello";
			
			// 이 url은 데이터베이스마다 조금씩 달라진다.
			Connection con = DriverManager.getConnection(url,user,pw);
			
			/*
			 	이처럼 접속을 하게되면 접속자를 관리하는 세션을 제공하는데
			 	이 세션을 관리하는 클래스가 바로 Connection 이다.
			 	
			 	여기까지가 데이터베이스들마다 조금씩 내용이 달라지는 부분이다
			 	이후부터는 항상 동일한 방식으로 JDBC에게 명령을 내리면
			 	JDBC가 해당 DBMS에게 명령을 전달한다.
			 */
			
			JOptionPane.showMessageDialog(null, "완");
			
			// 이제 오라클에 접속도 되었고 이제 질의명령을 보내보자.
			// 3. Statement 만든다.
			Statement stmt = con.createStatement();
			
			// 4. 질의 명령을 만들고
			ArrayList<String> avtList = new ArrayList<String>();
			avtList.add("INSERT INTO avatar VALUES(11, 'img_avatar1.png','img_avatar1.png','M')");
			avtList.add("INSERT INTO avatar VALUES(12, 'img_avatar1.png','img_avatar1.png','M')");
			avtList.add("INSERT INTO avatar VALUES(13, 'img_avatar1.png','img_avatar1.png','M')");
			avtList.add("INSERT INTO avatar VALUES(14, 'img_avatar1.png','img_avatar1.png','F')");
			avtList.add("INSERT INTO avatar VALUES(15, 'img_avatar1.png','img_avatar1.png','F')");
			avtList.add("INSERT INTO avatar VALUES(16, 'img_avatar1.png','img_avatar1.png','F')");
			
			String sql01 = "INSERT INTO member VALUES(1001, '김소영', 'show','12345','show@increpas.com','F','010-2411-7378','14','Y')";
			String sql02 = "INSERT INTO member VALUES(1000, '최두용', 'DD','12345','DD@increpas.com','M','010-1111-1111','11','Y')";
			String sql03 = "INSERT INTO member VALUES(1002, '김수진', 'chairman','12345','chair@increpas.com','F','010-2222-2222','12','Y')";
			
			// 이제 Statement에 질의 명령을 실어보내면 된다.
			/*
			int cnt = 0;
			for(int i=0; i<avtList.size(); i++) {
				cnt += stmt.executeUpdate(avtList.get(i));
			}
			JOptionPane.showMessageDialog(null, "입력된 데이터 수"+cnt);
			// 회원도 추가해보자.
			stmt.execute(sql01);
			stmt.execute(sql02);
			stmt.execute(sql03);
			 */
			
			String sql04 = "SELECT * FROM member WHERE mno = 1001";
			ResultSet rs = stmt.executeQuery(sql04);
			// 현재 작업줄은 BOF이므로 실제 데이터 들어있는 행으로 한 행 내려야 된다.
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
			
			
			
			
			JOptionPane.showMessageDialog(null, name + " 인포\n 회원번호  : " + mno
					+ "\n 아이디  : " + mid	 + "\n 패스워드  : " + mpw + "\n 이메일  : " + mail
					 + "\n 성별  : " + gen  + "\n 전화번호  : " + tel + "\n 아바타번호  : " + ano
					 + "\n 활동여부  : " + ((isshow=='Y')?"활동중":"탈퇴회원")); 
			
			
			/*
			if(bool) {
				JOptionPane.showMessageDialog(null, "결과있다");
			} else {
				JOptionPane.showMessageDialog(null, "결과없다");
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
