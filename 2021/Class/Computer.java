package Class;

public class Computer {
	//매개 변수의 수를 모를 경우 -> 배열 타입으로 선업하면 된다. 	
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];			
		}
		return sum;
	}
	
	//...를 사용하면 메소드 호출 시 넘겨준 값의 수에 따라 자동으로 배열이 생성되고 매개값으로 사용된다. 
	int sum2(int ... values) {
		int sum=0;
		for(int i = 0; i<values.length; i++) {
			sum += values[i];		
		}
		return sum;
	}
}
