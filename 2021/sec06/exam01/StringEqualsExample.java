package sec06.exam01;

public class StringEqualsExample {
	public static void main(String[] args) {
		//���ڿ� ���ͷ��� �����ϴٸ� ������ string ��ü�� �����ϵ��� �Ǿ��ִ�.
		//�׷��� strVar1 �� strVar2�� ������ String ��ü�� �������� �������ִ�. ������ strVar3�� new�� ������ ���ο� ��ü�� �������� ���� �ȴ�.
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		String strVar3 = new String("�Ź�ö");
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar2 == strVar3); //== �����ڴ� ������ ����� ���� ���ϱ� ������ �̷��� ����� ���´�. 
		
		System.out.println();
		 
		System.out.println(strVar1.equals(strVar2)); // equals() �Լ��� ����ϸ� ���� ���ڿ��� �Ű������� �־��� �񱳹��ڿ��� �������� ���Ѵ�. 
		System.out.println(strVar2.equals(strVar3));
		
	}
}
