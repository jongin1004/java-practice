package interface_extend;

public interface ChildInterfaceB extends ParentInterface{
	public void method3();
	
	@Override
	public default void method2() {
		System.out.println("ChildInterfaceB-method2");
	}
}
