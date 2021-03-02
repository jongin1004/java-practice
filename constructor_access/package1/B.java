package constructor_access.package1;

public class B {

	//필드
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열"); //에러  클래스 생성자에서 문자열을 매개변수로 받는 경우에는 private로 지정했기 때문에, 외부에서 new 연산자를 통해서 생성자를 호출하는 것이 불가능하다.
}

