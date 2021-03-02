package Class;

public class Singleton {
	//싱글톤은 전체 프로그램에서 단 하나의 객체만 만들도록 보장해야하는 경우, 단 하나만 생성되는 객체이다.
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		
	}
	
	//외부에서 객체를 얻는 유일한 방법은 getInstance() 메소드를 호출하는 것이다. 
	static Singleton getInstance() {
		return singleton;
	}
}
