package protected_access_restriction2;

import protected_access_restriction.*;

public class D extends A{
	//protected�� ������ A class�� �ٸ� ��Ű���ӿ���, A class�� ��� �޾ұ� ������ ������, �޼ҵ�, �ʵ忡 ������ �����ϴ�. 
	public D() {
		super();
		this.field = "value";
		this.method();
	}
}
