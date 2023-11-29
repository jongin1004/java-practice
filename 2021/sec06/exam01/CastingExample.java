package sec06.exam01;

public class CastingExample {
	public static void main(String[] args) {
		//큰 크기의 타입에서 작은 크기의 타입으로 변경을 하는 것은 불가능하다. 
		//하지만, 강제로 변경을 시켜주는 방법이있다. 캐스팅 연산자()를 이용한다. 
		//기존 int(4byte) 타입을 byte(1byte) 타입으로 강제변환을 하면 맨 끝의 1byte값만 저장이 된다. -> 기존의 값이 보존되지 않는다. 
		
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
	}
}
