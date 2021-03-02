package Class;

public class CarExample {
	public static void main(String[] args) {
		//객체 생성
//		Car myCar = new Car(); Car class에 기본생성자가 아닌 명시 생성자를 만들었기 때문에 그에 맞는 매개값을 보내줘야만 객체를 생성할 수 있다. 
//		Car myCar = new Car("노랑", 3000);
		
		//필드값 일기
//		System.out.println("제작회사: " + myCar.company);
//		System.out.println("모델: " + myCar.model);
//		System.out.println("색상: " + myCar.color);
//		System.out.println("최고스피드: " + myCar.maxSpeed);
//		System.out.println("현재스피드: " + myCar.speed);
//			
//		//필드값 변경
//		myCar.speed = 60;
//		System.out.println("현재스피드: " + myCar.speed);
		
//		Car car1 = new Car();
//		System.out.println("car1.company : " + car1.company);
//		System.out.println();
//		
//		Car car2 = new Car("그랜저", "노랑");
//		System.out.println("car1.company : " + car2.company);
//		System.out.println("car1.model : " + car2.model);
//		System.out.println("car1.color : " + car2.color);
//		System.out.println();
//		
//		Car car3 = new Car("자가용", "빨강", 200);
//		System.out.println("car1.company : " + car3.company);
//		System.out.println("car1.model : " + car3.model);
//		System.out.println("car1.color : " + car3.color);
//		System.out.println("car1.maxSpeed : " + car3.maxSpeed);
//		System.out.println();
//		
//		Car car4 = new Car("세단");
//		System.out.println("car1.company : " + car4.company);
//		System.out.println("car1.model : " + car4.model);
//		System.out.println("car1.color : " + car4.color);
//		System.out.println("car1.maxSpeed : " + car4.maxSpeed);
//		
		
//		Car myCar = new Car();
//				
//		myCar.setGas(5);
//		
//		boolean gasState = myCar.isLeftGas();
//		if(gasState) {
//			System.out.println("출발합니다.");
//			myCar.run();			
//		}
//		
//		if(myCar.isLeftGas()) {
//			System.out.println("gas를 주입할 필요가 없습니다.");
//		} else {
//			System.out.println("gas를 주입하세요.");
//		}
		
//		Car myCar2 = new Car();
//		myCar2.keyTurnOn();
//		myCar2.run();
//		int speed = myCar.getSpeed();
//		System.out.println("현재 속도 : " + speed + "km/h");

//		Car myCar3 = new Car("아우디");
//		myCar3.setSpeed(30);
//		myCar3.setGas(5);		
//		myCar3.run();
		
		Car myCar = new Car();
		
		//잘못된 속도 변경
		myCar.setSpeed(-50);
		
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		//올바른 속도 변경
		myCar.setSpeed(60);
		
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		//멈춤
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("현재 속도 : " + myCar.getSpeed());
	}
}
