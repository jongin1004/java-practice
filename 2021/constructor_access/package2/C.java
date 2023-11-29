package constructor_access.package2;

import constructor_access.package1.*;

public class C {
	//필드
	A a1 = new A(true);
	A a2 = new A(1); //A클래스에서 int 타입 매개변수의 생성자는 default로 작성되어있기 때문에, 패키지가 다른 C클래스에서는 생성자 호출이 불가능
	A a3 = new A("문자열"); //private이기 때문에 호출 불가능.
}
