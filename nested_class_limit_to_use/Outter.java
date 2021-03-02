package nested_class_limit_to_use;

public class Outter {
	//자바7버전 까지는 final선언을 해줘야만 했다. 
	//매개 변수나 로컬 변수가 수정되거 값이 변하게 되면 로컬 클래스에 복사해 둔 값과 달라지는 문제를 해결하기 위함이다.
	public void method1(final int arg) {
		final int localVariable = 1;
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	//자바8버전 이후부터는 final선언을 하지 않아도 자동적으로  final특성을 가지게 된다.
	public void method2(int arg) {
		int localVariable = 1;
		//arg = 100; (x)
		//localVariable = 100;(x)
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
