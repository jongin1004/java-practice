package interface_create;

public interface RemoteControl {
	//상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상 메소드 -> 실행내용 작성 x
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//디폴트 메소드 -> 실행내용 작성
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음모드");
		} else {
			System.out.println("무음모드 해제");
		}
	}
	
	//정적 메소드
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
