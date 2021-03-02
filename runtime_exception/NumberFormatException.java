package runtime_exception;

public class NumberFormatException {
	//문자열 숫자열로 변환할 때 parseOOO() 메소드가 사용되는데, 숫자로 변환 가능한 문자열이면 정상 작동하지만,
	//숫자로 변환 불가능한 문자열일 경우에는 NuberFormatException 예외처리가 발생한다.
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		System.out.println(data1 + "+" +data2 + " = " + result);
	}
}
