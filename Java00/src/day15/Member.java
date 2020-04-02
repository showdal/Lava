package day15;
/**
 * 이 클래스는 회원의 정보를 저장할 VO클래스
 * @author	쇼영
 * @since	2020.03.27
 * @version	v.1.0
 *
 */
public class Member {
	private int mno;
	private String id;
	private String pw;
	private String name;
	private String tel;
	private String addr;
	private String mail;
	private String gen;
	private String birth;

	private int avtNo;
	private String avatar;
	private String sDate;
	private String sTime;
	private String isShow;

	
	
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getAvtNo() {
		return avtNo;
	}
	public void setAvtNo(int avtNo) {
		this.avtNo = avtNo;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getsDate() {
		return sDate;
	}
	public void setsDate(String sDate) {
		this.sDate = sDate;
	}
	public String getsTime() {
		return sTime;
	}
	public void setsTime(String sTime) {
		this.sTime = sTime;
	}
	public String getIsShow() {
		return isShow;
	}
	public void setIsShow(String isShow) {
		this.isShow = isShow;
	}
	
	public String toString() {
		StringBuffer buff = new StringBuffer();
		buff.append("NUMBER : ");
		buff.append(mno);
		buff.append("\n");
		buff.append("NAME : ");
		buff.append(name);
		buff.append("\n");
		buff.append("ID : ");
		buff.append(id);
		buff.append("\n");
		buff.append("EMAIL : ");
		buff.append(mail);
		buff.append("\n");
		
		return buff.toString();
	} // String함수는 Heap에 데이터를 계속 쌓으므로 메모리 낭비가 있다.
	  // 데이터 변경이 많은 경우 StringBuffer 혹은 StringBuilder를 사용하는 것이 이득이다.
	  // 사용 완료 후 String 형태로 변경하여 저장한다.
}








