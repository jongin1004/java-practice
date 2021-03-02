package runtime_exception;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		//참조객체가 없는 상태에서 (.)연산자를 사용해서 toString() 메소드를 호출할려 했기 때문에 nullPointerException이 발생한다.
		String data = null;
		System.out.println(data.toString());
	}
}
