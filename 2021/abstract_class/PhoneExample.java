package abstract_class;

public class PhoneExample{
	public static void main(String[] args) {
		//Phone phone = new Phone(); �߻� Ŭ������ ���� �����ڸ� ȣ��(��ä����)�� �Ұ����ϴ�.
		
		SmartPhone smartPhone = new SmartPhone("����");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();		
	}
}
