package nested_class_limit_to_use;

public class A1 {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();					
		}		
	}
	
	static class C{
		void method() {
			//field1 = 10; 인스턴스 필드/메소드에 접글 불가능
			//method1();
			
			field2 = 10;
			method2();
		}
	}
}
