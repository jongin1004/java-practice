package runtime_exception;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		//������ü�� ���� ���¿��� (.)�����ڸ� ����ؼ� toString() �޼ҵ带 ȣ���ҷ� �߱� ������ nullPointerException�� �߻��Ѵ�.
		String data = null;
		System.out.println(data.toString());
	}
}
