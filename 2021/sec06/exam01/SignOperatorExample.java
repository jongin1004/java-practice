package sec06.exam01;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println(result1);
		System.out.println(result2);
		
		short s = 100;
		int result3 = -s; //��ȣ �������� ���� Ÿ���� int Ÿ���� �Ǳ� ������  ������ Ÿ���� int�� �ٲ�����Ѵ�. 
		System.out.println(result3);
	}
}
