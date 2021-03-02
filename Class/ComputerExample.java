package Class;

public class ComputerExample {
	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int[] values1 = {1, 2, 3}; //메소드 사용전에 배열을 먼저 선언하는 것 
		int result1 = myCom.sum1(values1);
		System.out.println("result1 = " + result1);
		
		int result2 = myCom.sum2(new int[] {1,2,3,4,5}); // 메소드를 호출할때 매개값으로  배열을 바로 넣어주는 것
		System.out.println("result2 = " + result2);
		
		int result3 = myCom.sum2(1,2,3); // ...을 이용해서 바로 값만 넘겨주는 방법 
		System.out.println("result3 = " + result3);
		
		int result4 = myCom.sum2(1,2,3,4,5);
		System.out.println("result4 = " + result4);
		
	}
}
