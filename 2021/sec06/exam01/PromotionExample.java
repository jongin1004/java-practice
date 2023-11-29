package sec06.exam01;

public class PromotionExample {
	public static void main(String[] args) {
		//작은 크기의 타입에서 큰 크기의 타입으로 변환이 가능하다. -> 원래의 값이 보존된다. 
		int intValue = 10;
		long longValue = intValue;
		
		System.out.println(longValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드 = "+ intValue);
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
	}
}
