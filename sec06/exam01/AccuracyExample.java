package sec06.exam01;

public class AccuracyExample {
	public static void main(String[] args) {
		//부동소수점 타입(float, double)은 0.1을 정확히 표현할 수 없어 근사치로 처리하기 때문에 정확한 답이 나오지 않고 0.2999999999993이 나옴
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number * pieceUnit;
		
		System.out.println("사과 한개에서 ");
		System.out.println("0.7 조각을 빼면 ");
		System.out.println(result + "조각이 남는다.");
		
		System.out.println("-------------------");
		
		int apple2 = 1;
		
		int totalPieces = apple2 * 10;
		int number2 = 7;
		int temp = totalPieces - number2;
		
		double result2 = temp/10.0;
		
		System.out.println("사과 한개에서 ");
		System.out.println("0.7 조각을 빼면 ");
		System.out.println(result2 + "조각이 남는다.");
		
		
	}
}
