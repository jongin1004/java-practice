package throws_exception;

public class ThrowsExample {
	//throws exception�� ����ϸ� �޼ҵ�(or ������)�� ȣ���� ������ ���ܸ� �ѱ� �� �ִ�.
	//throws�� ���Ե� �޼ҵ带 ȣ���ϴ� �κп��� try-catch�� �ۼ��Ǿ� �־���Ѵ�.
	//�Ǵ�, �ٽ� throws�� �ٸ� ������ �ѱ�� ����� �ִ�. ������ �ᱹ�� �޴� ���� try-catch�� �ۼ��Ǿ�߸� �Ѵ�.
	public static void main(String[] args) {
		try {
			findClass();
		}catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}
		
	public static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String2");
	}
}
