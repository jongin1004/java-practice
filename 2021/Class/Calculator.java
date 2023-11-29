package Class;

public class Calculator {
	static double pi = 3.141592;
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}	
	
	//메소드
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	//메소드의 타입은 return 해줄 값의 type과 동일하게 적어주면된다.
//	int plus(int x, int y) {
//		int result = x + y;
//		return result;
//	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}
	
	//클래스 외부에서 메소드를 호출할 경우에는 우선 클래스로 부터 객체를 생성한 뒤, 참조 변수를 이용해서 메소드를 호출해야한다. -> 객체가 존재해야 메소드도 존재하기 때문에
	//하지만, 클래스 내부에서 메소드를 호출할경우에는 메소드의 이름만 적어주면 실행이 가능하고 return이 있는 메소드일 경우에는 
	//return과 같은 타입이나 변화이 가능한 타입 변수로 값을 받아들이면 된다. 
	void execute(int x, int y) {
		double result = avg(x, y);
		println("실행결과 : " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
	
	double divide(double x, double y) {
		double result = x / y;
		return result;
	}
	
	//return을 하지 않는 메소드는 void를 적어주면 된다.
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	//정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	//직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
