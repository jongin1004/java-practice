package field_method_access.package1;

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
		a.field3 = 1; //private로 제한 되어있기 때문에 다른 클래스에서 호출 불가능
		
		a.method1();
		a.method2();
		a.method3(); //private로 제한 되어있기 때문에 다른 클래스에서 호출 불가능
		
	}
}
