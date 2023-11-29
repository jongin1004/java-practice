package interface_create;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkFare(); //구현 클래스에 있는 메소드는 인터페이스 타입으로 자동 타입 했을 경우에 사용 불가능
		
		//인터페이스 타입에서 구현 클래스 타입으로 강제 타입 변환(casting)
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
		
	}
}
