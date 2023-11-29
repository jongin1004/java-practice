package polymorphism_parameta;

public class Driver {
	//메소드의 매개변수로써 클래스를 사용할 수 있다. -> 해당 클래스의 객체뿐만 아니라 자식 객체까지도 매개값으로 사용할 수 있다느 것이다.
	//매가값으로 어떤 자식객체가 제공되느냐에 따라 메소드의 실행 결과는 다양해질 수 있다.(매개 변수의 다형성)
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
}
