package try_catch_finally;

public class TryCatchFinallyExample {
	//try{예외 발생 가능 코드} catch(예외클래스 e){예외처리}finally{항상실행}
	public static void main(String[] args) {
		try {
			//Class.forName()메소드는 매개값으로 주어진 클래스가 존재하면 Class객체를 리턴하지만, 존재하지 않으면
			//ClassNotFundException 예외를 발생한다 -> 일반 예외이므로 컴파일러는 개발자로 하여금 예외 처리 코드를 작성하도록 요구한다. 
			Class clazz = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
}
