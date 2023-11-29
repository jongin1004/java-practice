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
		cia.method2(); //ParentInterface�� default �޼ҵ� �̱� ������ ���� Ŭ�������� ���� �����Ǹ� ���� �ʰ� ��밡���ϴ�.
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
		cib.method2(); //ChildInterfaceB���� default�� �޼ҵ带 �ٽ��ѹ� Override�� Default �޼ҵ�� ������ �߱� ������ ���� Ŭ���������� ������ ���� �ʾƵ� �ȴ�.
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
		cic.method2(); //ChildInterfaceC���� default�� �޼ҵ带 �߻� �޼ҵ�� Override�� �ٲ�� ������, ���� Ŭ���������� �ٽ� Override�� ���ؼ� �������ؼ� ����ؾ��Ѵ�.
		cic.method3();
	}
}
