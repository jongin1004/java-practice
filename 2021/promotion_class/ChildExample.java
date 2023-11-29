package promotion_class;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2();
//		parent.method3(); 타입변환을 했을경우에 Parent에 지정한 method만 사용가능하기 때문 (Override된 메소드 제외)
	}
}
