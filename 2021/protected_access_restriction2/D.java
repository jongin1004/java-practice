package protected_access_restriction2;

import protected_access_restriction.*;

public class D extends A{
	//protected로 설정한 A class와 다른 패키지임에도, A class를 상속 받았기 때문에 생성자, 메소드, 필드에 접근이 가능하다. 
	public D() {
		super();
		this.field = "value";
		this.method();
	}
}
