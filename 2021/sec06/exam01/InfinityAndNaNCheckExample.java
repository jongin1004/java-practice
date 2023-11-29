package sec06.exam01;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z = x / y;
		double z2 = x % y;
		
		System.out.println(Double.isInfinite(z)); //해당 값이 infinity 일 경우에 true
		System.out.println(Double.isNaN(z2)); //해당 값이 NaN 일 경우에 true
		
		System.out.println(z+2);  // infinity나 NaN 값에 연산을 하면 무조건 infinity or NaN가 나오기 때문에 제대로된 값이 나오지 않는다. 
	}
}
