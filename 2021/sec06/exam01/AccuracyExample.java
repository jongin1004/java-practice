package sec06.exam01;

public class AccuracyExample {
	public static void main(String[] args) {
		//�ε��Ҽ��� Ÿ��(float, double)�� 0.1�� ��Ȯ�� ǥ���� �� ���� �ٻ�ġ�� ó���ϱ� ������ ��Ȯ�� ���� ������ �ʰ� 0.2999999999993�� ����
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number * pieceUnit;
		
		System.out.println("��� �Ѱ����� ");
		System.out.println("0.7 ������ ���� ");
		System.out.println(result + "������ ���´�.");
		
		System.out.println("-------------------");
		
		int apple2 = 1;
		
		int totalPieces = apple2 * 10;
		int number2 = 7;
		int temp = totalPieces - number2;
		
		double result2 = temp/10.0;
		
		System.out.println("��� �Ѱ����� ");
		System.out.println("0.7 ������ ���� ");
		System.out.println(result2 + "������ ���´�.");
		
		
	}
}
