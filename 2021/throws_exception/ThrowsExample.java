package throws_exception;

public class ThrowsExample {
	//throws exception을 사용하면 메소드(or 생성자)를 호출한 곳으로 예외를 넘길 수 있다.
	//throws가 포함된 메소드를 호출하는 부분에는 try-catch로 작성되어 있어야한다.
	//또는, 다시 throws로 다른 곳으로 넘기는 방법도 있다. 하지만 결국은 받는 곳은 try-catch로 작성되어야만 한다.
	public static void main(String[] args) {
		try {
			findClass();
		}catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
		
	public static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String2");
	}
}
