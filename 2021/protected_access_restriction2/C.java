package protected_access_restriction2;

import protected_access_restriction.*;

public class C {
	//A class���� �ʵ�� �޼ҵ� �����ڰ� protected ���� �����ڷ� �����Ǿ�  �ֱ� ������, ��� ���� �͵� �ƴϰ� ��Ű���� �ٸ� C class������ ������ �Ұ����ϴ�.
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
	}
}
