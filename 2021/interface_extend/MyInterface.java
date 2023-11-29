package interface_extend;

public interface MyInterface {
	public void method1();
	
	
	//interface에서 default로 메소드를 선언하게 되면, 구현 클래스에서는 이 메소드를 따로 선언하지 않아도 사용이 가능해지기 때문에
	//코드 수정하기에 유리하다. -> 필요에 따라서는 구현 클래스에서 Override를 통해서 변화해서 사용가능
	public default void method2() {
		System.out.println("MyInterface-method2 실행");
	}
}
