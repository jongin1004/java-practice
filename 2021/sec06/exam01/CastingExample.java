package sec06.exam01;

public class CastingExample {
	public static void main(String[] args) {
		//ū ũ���� Ÿ�Կ��� ���� ũ���� Ÿ������ ������ �ϴ� ���� �Ұ����ϴ�. 
		//������, ������ ������ �����ִ� ������ִ�. ĳ���� ������()�� �̿��Ѵ�. 
		//���� int(4byte) Ÿ���� byte(1byte) Ÿ������ ������ȯ�� �ϸ� �� ���� 1byte���� ������ �ȴ�. -> ������ ���� �������� �ʴ´�. 
		
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
	}
}
