package package_create.package2;

import package_create.package1.*;

//클래스의 접근 제한 public 다른 패키지에서도 접근 가능하다.
public class C {
	A a;  // (x) A클래스는 default 접근 제한이 있기 때문에 A클래스가 있는 package1의 있는 클래스가 아니라면 접근이 불가능하다.
	B b;  // (o) B클래스는 public 접근 제한이 있기 때문에 import만 해주면, 다른 package에서도 접근이 가능하다.
}
