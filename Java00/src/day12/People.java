package day12;
/**
 * �� Ŭ������ ����� ������ ������ Ŭ����
 * @author	�
 * @since	2020.03.24
 * @version	v.1.0
 */
public class People {
	//�� Ŭ������ �ּҷϿ� ����� ����� ������ ����� �뵵�� Ŭ����
	//����� �������� ����� �������� ��������� �Ѵ�.
	String name, addr,tel,mail,birth,gen,cop;
	
	//�� Ŭ������ ��ü�� �� �� ����Ʈ��(�⺻����)�� ���� ������ �����Ѵ�.
	
	//�������Լ� ����
	//�⺻ �������Լ�
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