package sec06.exam01;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println(result1);
		System.out.println(result2);
		
		short s = 100;
		int result3 = -s; //부호 연산자의 산출 타입은 int 타입이 되기 때문에  데이터 타입을 int로 바꿔줘야한다. 
		System.out.println(result3);
	}
}
