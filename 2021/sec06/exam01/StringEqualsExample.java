package sec06.exam01;

public class StringEqualsExample {
	public static void main(String[] args) {
		//문자열 리터럴이 동일하다면 동일한 string 객체를 참조하도록 되어있다.
		//그래서 strVar1 과 strVar2는 동일한 String 객체의 번지값을 가지고있다. 하지만 strVar3는 new로 생성한 새로운 객체의 번지값을 갖게 된다.
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철");
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar2 == strVar3); //== 연산자는 변수에 저장된 값만 비교하기 때문에 이러한 결과가 나온다. 
		
		System.out.println();
		 
		System.out.println(strVar1.equals(strVar2)); // equals() 함수를 사용하면 원본 문자열과 매개값으로 주어진 비교문자열이 동일한지 비교한다. 
		System.out.println(strVar2.equals(strVar3));
		
	}
}
