package try_catch_finally;

public class TryCatchFinallyExample {
	//try{���� �߻� ���� �ڵ�} catch(����Ŭ���� e){����ó��}finally{�׻����}
	public static void main(String[] args) {
		try {
			//Class.forName()�޼ҵ�� �Ű������� �־��� Ŭ������ �����ϸ� Class��ü�� ����������, �������� ������
			//ClassNotFundException ���ܸ� �߻��Ѵ� -> �Ϲ� �����̹Ƿ� �����Ϸ��� �����ڷ� �Ͽ��� ���� ó�� �ڵ带 �ۼ��ϵ��� �䱸�Ѵ�. 
			Class clazz = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}
	}
}
