package sec06.exam01;

public class CharOperationExample {
	public static void main(String[] args) {
		char c1 = 'A' + 1; // 리터럴 간의 연산은 타입 변환 없이 해당 타입으로 계산 하기 때문에 에러 없음
		char c2 = 'A';
//		char c3 = c2 + 1; 에러-> c2는 int 타입이 되고 1과 연산이 되기때문에 산출 타입은 int가 되기 때문		
		char c3 = (char) (c2 + 1);
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);	
	}
}
