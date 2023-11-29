package protected_access_restriction2;

import protected_access_restriction.*;

public class C {
	//A class에서 필드와 메소드 생성자가 protected 접근 제한자로 설정되어  있기 때문에, 상속 받은 것도 아니고 패키지도 다른 C class에서는 접근이 불가능하다.
	public void method() {
		A a = new A();
		a.field = "value";
		a.method();
	}
}
