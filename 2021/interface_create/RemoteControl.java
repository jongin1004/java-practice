package interface_create;

public interface RemoteControl {
	//���
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ� -> ���೻�� �ۼ� x
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//����Ʈ �޼ҵ� -> ���೻�� �ۼ�
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("�������");
		} else {
			System.out.println("������� ����");
		}
	}
	
	//���� �޼ҵ�
	public static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
