package interface_create;

public class RemoteControlExample {
	public static void main(String[] args) {
//		RemoteControl rc;
//		rc = new Television();
//		rc = new Audio();	
		
		
		//익명 구현 클래스 
		//보통 위에 처럼 구현 클래스(Television / Audio)를 만들어서 사용하는 것이 일방적이고 클래스를 재사용할 수 있기 때문에 편리하지만,
		//일회성의 구현 객체를 만들기 위해 소스파일을 만들고 클래스를 선언하는 것은 비효율적이다.
		//그래서 소스파일을 만들지 않고도 구현 객체를 만들 수 있는 방법이다.
		//모든 객체는 클래스로 부터 생성되기 때문에 { }안에 있는 것이 클래스가 되고 이것을 설계서로써 객체가 만들어진다.
//		RemoteControl rc = new RemoteControl() {
//			public void turnOn() {실행문}
//			public void turnOff() {실행문}
//			public void setVolume() {실행문}			
//		}
		
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn(); //추상메소드 사용
		rc.setMute(true); //default 메소드 사용
		rc.turnOff(); //추상메소드 사용
		
		rc = new Audio();
		rc.turnOn(); //추상메소드 사용
		rc.setMute(true); //default 메소드를 Overrid해서 사용
		rc.turnOff(); //추상메소드 사용
				
		RemoteControl.changeBattery(); //정적 메소드 사용
		
		
	}
}
