package interface_create;

public class RemoteControlExample {
	public static void main(String[] args) {
//		RemoteControl rc;
//		rc = new Television();
//		rc = new Audio();	
		
		
		//�͸� ���� Ŭ���� 
		//���� ���� ó�� ���� Ŭ����(Television / Audio)�� ���� ����ϴ� ���� �Ϲ����̰� Ŭ������ ������ �� �ֱ� ������ ��������,
		//��ȸ���� ���� ��ü�� ����� ���� �ҽ������� ����� Ŭ������ �����ϴ� ���� ��ȿ�����̴�.
		//�׷��� �ҽ������� ������ �ʰ� ���� ��ü�� ���� �� �ִ� ����̴�.
		//��� ��ü�� Ŭ������ ���� �����Ǳ� ������ { }�ȿ� �ִ� ���� Ŭ������ �ǰ� �̰��� ���輭�ν� ��ü�� ���������.
//		RemoteControl rc = new RemoteControl() {
//			public void turnOn() {���๮}
//			public void turnOff() {���๮}
//			public void setVolume() {���๮}			
//		}
		
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn(); //�߻�޼ҵ� ���
		rc.setMute(true); //default �޼ҵ� ���
		rc.turnOff(); //�߻�޼ҵ� ���
		
		rc = new Audio();
		rc.turnOn(); //�߻�޼ҵ� ���
		rc.setMute(true); //default �޼ҵ带 Overrid�ؼ� ���
		rc.turnOff(); //�߻�޼ҵ� ���
				
		RemoteControl.changeBattery(); //���� �޼ҵ� ���
		
		
	}
}
