package interface_inheritance;

public class Example {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		//interfaceA 변수는 methodA()만 호출
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		//interfaceB 변수는 methodB()만 호출
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		//interfaceC 변수는 interfaceA/B를 다중상속 받기 때문에, 모든 메소드를 호출 가능하다.
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		System.out.println();
		
		
	}
}
