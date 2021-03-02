package runtime_exception;

public class ArrayIndexOutOfBoundsExceptionExample {
	//배열에서 인덱스 범위를 초과하여 사용할 경우 실행되는 예외
	public static void main(String[] args) {
//		String data1 = args[0];
//		String data2 = args[1];
//		
//		System.out.println("args[0] : "+ data1);
//		System.out.println("args[1] : "+ data2);
		
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println("args[0] : "+ data1);
			System.out.println("args[1] : "+ data2);
		} else {
			System.out.println("[실행 방법]");
			System.out.println("java ArrayIndexOutOfBoundsExceptionExample ");
			System.out.println("값1 값2");
		}
	}
}