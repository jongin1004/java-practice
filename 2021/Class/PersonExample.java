package Class;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("����", "123456-1234567");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		
		//nation�� ssn�� PersonŬ���� ���迡�� final ������ ��� ������, ������ �Ұ����ϴ�. 
		//p1.nation = "usa"; 
		//p1.ssn = "123674-574523";
		p1.name = "�汸";
		System.out.println(p1.name);
	}
}
