package sec06.exam01;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		long i = 128;
		
		if( (i<Integer.MIN_VALUE) || (i>Integer.MAX_VALUE) ) {
			System.out.println("byteŸ������ ��ȯ�� �� �����ϴ�.");
			System.out.println("���� �ٽ� Ȯ�����ּ���.");
		} else {
			int b = (int) i;
			System.out.println(b);
		}
	}
}
