package Class;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("종인", "123456-1234567");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		
		//nation과 ssn은 Person클래스 설계에서 final 값으로 줬기 때문에, 변경이 불가능하다. 
		//p1.nation = "usa"; 
		//p1.ssn = "123674-574523";
		p1.name = "방구";
		System.out.println(p1.name);
	}
}
