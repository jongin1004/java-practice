package Class;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1 = " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x,  y);
		System.out.println("result2 = " + result2);
		
		myCalc.powerOff();
		
		Calculator myCalc2 = new Calculator();
		myCalc2.execute(7, 10);
		
		Calculator myCalc3 = new Calculator();
		double result3 = myCalc3.areaRectangle(5);
		double result4 = myCalc3.areaRectangle(5, 10);
		System.out.println("정사각형의 넓이 : " + result3);
		System.out.println("직사각형의 넓이 : " + result4);
		
		double result5 = 10 * 10 * Calculator.pi;
		int result6 = Calculator.plus(10,5);
		int result7 = Calculator.minus(10,5);
		
		System.out.println("result 5 :" + result5);
		System.out.println("result 6 :" + result6);
		System.out.println("result 7 :" + result7);
					
	}
}
