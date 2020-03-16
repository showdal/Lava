package day03;

public class Member {
	int no;
	String id;
	String name;
	
	public Member() {
	}
	public Member(int no, String id, String name) {
		this.no = no;
		this.id = id;
		this.name = name;
	}
	
	public static void abc() {
		Member m = new Member();
		m.no = 1000;
		m.id = "show";
		m.name = "soyoung";
		
		Member mm = new Member(1001,"show","soyoung");
		
		System.out.println(m.no + m.id + m.name);
		System.out.println(mm.no + mm.id + mm.name);
	}
	public static void main (String[] args) {
		abc();
		
	}
}
