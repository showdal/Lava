package day20;

/*
 	회원번호를 입력하면
 	데이터베이스의 회원 정보를 조회해주는 프로그램을 작성하세요.
 */


import java.sql.*;
import javax.swing.*;
public class Test02 {
	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public Test02() {
		dbInit();
		
		// 회원번호를 입력받는다.
		int no = -1;
		while(true) {
			String sno = JOptionPane.showInputDialog("조회할 회원번호를 입력하세요");
		try {
			no = Integer.parseInt(sno);
			break;
		} catch(Exception e) {
			e.printStackTrace();
			continue;
			}
		}
		// 질의 명령을 만든다.
		String sql = "SELECT mno, name, id, pw, mail email, gen, tel HP, ano avatarno, isshow status FROM member WHERE mno = " + no;
		String psql = "SELECT mno, name, id, pw, mail email, gen, tel HP, ano avatarno, isshow status FROM member WHERE mno = ?";
		
		try {
			/*
			// Statement를 얻어오고
			stmt = con.createStatement();
			// 질의 명령 실어서 보내고
			rs = stmt.executeQuery(sql);
			*/
			
			// ? 를 채워줘야하는 질의 명령을 사용할때 사용하는 Statement 는 PreparedStatement 이다.
			pstmt = con.prepareStatement(psql);
			// PreparedStatement 는 질의명령을 가지고 만들어야 하고
			// 만들어진 후에는 질의 명령을 완성해야 질의 명령이 정상적으로 작동할 것이다.
			
			// 질의명령 완성하고
			pstmt.setInt(1, no);
			
			// 질의 명령 보내고 결과 받고
			rs = pstmt.executeQuery();
			
			
			// 작업 한줄 내리고
			rs.next();
			
			// 필요한 데이터 뽑아오고...
			int mno = rs.getInt("mno");
			String name = rs.getString("name");
			String mid = rs.getString("id");
			String mpw = rs.getString("pw");
			String mail = rs.getString("email");
			String gen = rs.getString("gen");
			String tel = rs.getString("HP");
			int ano = rs.getInt("avatarno");
			char isshow = rs.getString("status").charAt(0);
			
			
			
			// 보여주고
			JOptionPane.showMessageDialog(null, name  + "인포\n 회원번호  : " + mno
					+ "\n 아이디  : " + mid	 + "\n 패스워드  : " + mpw + "\n 이메일  : " + mail
					 + "\n 성별  : " + gen  + "\n 전화번호  : " + tel + "\n 아바타번호  : " + ano
					 + "\n 활동여부  : " + ((isshow =='Y')?"활동중":"탈퇴회원")); 
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				stmt.close();
				con.close();
			} catch(Exception e) {}
		}
		
		//
		
	}
	// 데이터베이스 드라이버 로딩하고 커넥션 얻어주는 함수
	public void dbInit() {
		try {
			
		// 드라이버 로딩하고
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 커넥션 얻어오고
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "hello";
		String pw = "hello";
		
		con = DriverManager.getConnection(url,user,pw);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Test02();
	}
}
