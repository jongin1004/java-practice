package interface_extend;

public interface ParentInterface {
	public void method1();
	public default void method2() {
		System.out.println("ParentInterface-method2");
	}
}
