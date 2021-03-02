package abstract_class;

//abstract 키워드를 붙히면 추상 클래스를 선언하는 것이다. 
public abstract class Phone {
	//필드
	public String owner;
	
	//생성자
	//추상 클래스는 new 연산자를 통해서 생성자를 호출하는 것이 불가능하지만, 자식 객체가 생성될 때 super()를 호출해서 추상 클래스 객채를 생성하므로,
	//추상 클래스도 생성자가 반드시 있어야 한다.
	public Phone(String owner) {		
		this.owner = owner;
	}
	
	//메소드
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
