package api_object;

public class SmartPhoneExample {
	public static void main(String[] args) {
		//Object�� toString() �޼ҵ�� ��ü�� ���� ������ �����Ѵ�. -> ��ü�� ���ڿ��� ǥ���� �� -> "Ŭ������@16�����ؽ��ڵ�"
		//���� ����ġ ���� ���̱� ������ �������Ͽ� �����ϰ� ������ ������ �����ϵ��� �Ѵ�.
		SmartPhone myPhone = new SmartPhone("����", "�ȵ���̵�");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
	}
}
