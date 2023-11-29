package interface_extend;

public class ParentExample {
	public static void main(String[] args) {
		ChildInterfaceA cia = new ChildInterfaceA() {
			@Override
			public void method1() {
				System.out.println("ChildInterfaceA-method1");
			}
			
			@Override
			public void method3() {
				System.out.println("ChildInterfaceA-method3");
			}
		};
		
		cia.method1();
		cia.method2(); //ParentInterface에 default 메소드 이기 때문에 구현 클래스에서 따로 재정의를 하지 않고 사용가능하다.
		cia.method3();
		
		ChildInterfaceB cib = new ChildInterfaceB() {
			@Override
			public void method1() {
				System.out.println("ChildInterfaceB-method1");
			}
			
			@Override
			public void method3() {
				System.out.println("ChildInterfaceB-method3");
			}
		};
		
		cib.method1();
		cib.method2(); //ChildInterfaceB에서 default된 메소드를 다시한번 Override로 Default 메소드로 재정의 했기 때문에 구현 클래스에서는 재정의 하지 않아도 된다.
		cib.method3();
		
		ChildInterfaceC cic = new ChildInterfaceC() {
			@Override
			public void method1() {
				System.out.println("ChildInterfaceC-method1");
			}
			
			@Override
			public void method2() {
				System.out.println("ChildInterfaceC-method2");
			}
			
			@Override
			public void method3() {
				System.out.println("ChildInterfaceC-method3");
			}
		};
		
		
		cic.method1();
		cic.method2(); //ChildInterfaceC에서 default된 메소드를 추상 메소드로 Override로 바꿨기 때문에, 구현 클래스에서는 다시 Override를 통해서 재정의해서 사용해야한다.
		cic.method3();
	}
}
