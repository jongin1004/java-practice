package promotion_class;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2();
//		parent.method3(); Ÿ�Ժ�ȯ�� ������쿡 Parent�� ������ method�� ��밡���ϱ� ���� (Override�� �޼ҵ� ����)
	}
}
