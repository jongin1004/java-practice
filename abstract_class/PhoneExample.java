package abstract_class;

public class PhoneExample{
	public static void main(String[] args) {
		//Phone phone = new Phone(); 추상 클래스는 직접 생성자를 호출(객채생성)이 불가능하다.
		
		SmartPhone smartPhone = new SmartPhone("종인");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();		
	}
}
