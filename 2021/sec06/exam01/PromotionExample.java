package sec06.exam01;

public class PromotionExample {
	public static void main(String[] args) {
		//���� ũ���� Ÿ�Կ��� ū ũ���� Ÿ������ ��ȯ�� �����ϴ�. -> ������ ���� �����ȴ�. 
		int intValue = 10;
		long longValue = intValue;
		
		System.out.println(longValue);
		
		char charValue = '��';
		intValue = charValue;
		System.out.println("���� �����ڵ� = "+ intValue);
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
	}
}
