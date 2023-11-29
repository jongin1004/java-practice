package Class;

public class Singleton {
	//�̱����� ��ü ���α׷����� �� �ϳ��� ��ü�� ���鵵�� �����ؾ��ϴ� ���, �� �ϳ��� �����Ǵ� ��ü�̴�.
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		
	}
	
	//�ܺο��� ��ü�� ��� ������ ����� getInstance() �޼ҵ带 ȣ���ϴ� ���̴�. 
	static Singleton getInstance() {
		return singleton;
	}
}
