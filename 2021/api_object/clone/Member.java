package api_object.clone;

public class Member implements Cloneable {
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();
		} catch(CloneNotSupportedException e) {} //Cloneable 인터페이스를 구현하지 않으면 CloneNotSupportedException 예외가 발생한다. -> try-catch를 사용해야함
		return cloned;
	}
}
