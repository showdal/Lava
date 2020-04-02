package day12;
/**
 * 이 클래스는 사람의 정보를 저장할 클래스
 * @author	쇼영
 * @since	2020.03.24
 * @version	v.1.0
 */
public class People {
	//이 클래스는 주소록에 사용할 사람의 정보를 기억할 용도의 클래스
	//사람의 정보들을 기억할 변수들이 만들어져야 한다.
	String name, addr,tel,mail,birth,gen,cop;
	
	//이 클래스가 객체가 될 때 디폴트값(기본정보)을 정할 변수도 존재한다.
	
	//생성자함수 정의
	//기본 생성자함수
	public People() {
		
	}
	public People(String name, String addr,String tel,String mail,String birth,String gen) {
		this("increpas",name,addr,tel,mail,birth,gen);
	}
	
	public People(String cop, String name, String addr,String tel,String mail,String birth,String gen) {
		this.cop=cop;
		this.name=name;
		this.addr=addr;
		this.tel=tel;
		this.mail=mail;
		this.birth=birth;
		this.gen=gen;
	}
	
	

}