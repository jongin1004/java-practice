package nested_class_limit_to_use;

public class Outter {
	//�ڹ�7���� ������ final������ ����߸� �ߴ�. 
	//�Ű� ������ ���� ������ �����ǰ� ���� ���ϰ� �Ǹ� ���� Ŭ������ ������ �� ���� �޶����� ������ �ذ��ϱ� �����̴�.
	public void method1(final int arg) {
		final int localVariable = 1;
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	//�ڹ�8���� ���ĺ��ʹ� final������ ���� �ʾƵ� �ڵ�������  finalƯ���� ������ �ȴ�.
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
