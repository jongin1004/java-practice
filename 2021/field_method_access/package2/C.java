package field_method_access.package2;

import field_method_access.package1.*;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1; //default�� ���� �Ǿ��ֱ� ������ �ٸ� ��Ű������ ȣ�� �Ұ���
		a.field3 = 1; //private�� ���� �Ǿ��ֱ� ������ �ٸ� Ŭ�������� ȣ�� �Ұ���
		
		a.method1();
		a.method2(); //default�� ���� �Ǿ��ֱ� ������ �ٸ� ��Ű������ ȣ�� �Ұ���
		a.method3(); //private�� ���� �Ǿ��ֱ� ������ �ٸ� Ŭ�������� ȣ�� �Ұ���
		
		
	}
}
