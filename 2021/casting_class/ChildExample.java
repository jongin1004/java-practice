package casting_class;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		
		parent.field1 = "value";
		parent.method1();
		parent.method2();
//		parent.method3(); �ڵ� ��ȯ�� ���ؼ� Parent Ŭ���� Ÿ���� �ʵ�� �޼ҵ� �ۿ� ��� �Ұ����ϱ� ������ method3�� ���Ұ���
		
		//�ڵ� ��ȯ �ؼ� �θ� Ŭ������ Ÿ�Ժ�ȯ��  Ŭ������ casting�� ���ؼ� �ٽ� �ڽ� Ŭ������ ����Ÿ�� ��ȯ�� �� �� �ִ�.
		//����, �ڽ� Ŭ������ �ִ� �޼ҵ嵵 �ٽ� ��밡���ϰ� ��� ���� Ŭ������ �ʵ�� �޼ҵ嵵 ��� ��밡���ϴ�. 
		Child child = (Child) parent;
		child.field1 = "value2";
		child.field2 = "value3";
		child.method1();
		child.method2();
		child.method3();
		
		
	}
}
