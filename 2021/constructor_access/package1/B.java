package constructor_access.package1;

public class B {

	//�ʵ�
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("���ڿ�"); //����  Ŭ���� �����ڿ��� ���ڿ��� �Ű������� �޴� ��쿡�� private�� �����߱� ������, �ܺο��� new �����ڸ� ���ؼ� �����ڸ� ȣ���ϴ� ���� �Ұ����ϴ�.
}

