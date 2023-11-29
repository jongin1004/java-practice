package interface_inheritance;

public class Example {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		//interfaceA ������ methodA()�� ȣ��
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		//interfaceB ������ methodB()�� ȣ��
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		//interfaceC ������ interfaceA/B�� ���߻�� �ޱ� ������, ��� �޼ҵ带 ȣ�� �����ϴ�.
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		System.out.println();
		
		
	}
}
