package sec06.exam01;

public class CharOperationExample {
	public static void main(String[] args) {
		char c1 = 'A' + 1; // ���ͷ� ���� ������ Ÿ�� ��ȯ ���� �ش� Ÿ������ ��� �ϱ� ������ ���� ����
		char c2 = 'A';
//		char c3 = c2 + 1; ����-> c2�� int Ÿ���� �ǰ� 1�� ������ �Ǳ⶧���� ���� Ÿ���� int�� �Ǳ� ����		
		char c3 = (char) (c2 + 1);
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);	
	}
}
