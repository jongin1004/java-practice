package interface_extend;

public interface MyInterface {
	public void method1();
	
	
	//interface���� default�� �޼ҵ带 �����ϰ� �Ǹ�, ���� Ŭ���������� �� �޼ҵ带 ���� �������� �ʾƵ� ����� ���������� ������
	//�ڵ� �����ϱ⿡ �����ϴ�. -> �ʿ信 ���󼭴� ���� Ŭ�������� Override�� ���ؼ� ��ȭ�ؼ� ��밡��
	public default void method2() {
		System.out.println("MyInterface-method2 ����");
	}
}
