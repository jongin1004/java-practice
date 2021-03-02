package casting_class;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		
		parent.field1 = "value";
		parent.method1();
		parent.method2();
//		parent.method3(); 자동 변환을 통해서 Parent 클래스 타입의 필드와 메소드 밖에 사용 불가능하기 때문에 method3은 사용불가능
		
		//자동 변환 해서 부모 클래스로 타입변환한  클래스는 casting을 통해서 다시 자식 클래스로 강제타입 변환을 할 수 있다.
		//따라서, 자식 클래스에 있는 메소드도 다시 사용가능하고 상속 받은 클래스의 필드와 메소드도 모두 사용가능하다. 
		Child child = (Child) parent;
		child.field1 = "value2";
		child.field2 = "value3";
		child.method1();
		child.method2();
		child.method3();
		
		
	}
}
