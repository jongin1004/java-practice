package interface_extend;

public class DefaultMethodExample {
	public static void main(String[] args) {
		MyClassA mca = new MyClassA();
		MyClassB mcb = new MyClassB();
		
		MyInterface mi1 = mca;
		MyInterface mi2 = mcb;
		
		mi1.method1();
		mi1.method2();
		
		mi2.method1();
		mi2.method2();
	}
}
