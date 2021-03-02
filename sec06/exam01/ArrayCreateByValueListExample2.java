package sec06.exam01;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83,90,87};
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		
		System.out.println("총합 : " + sum1);	
		
		int sum2 = add( new int[] {83, 90, 87} );
		
		System.out.println("총합 =" + sum2);
		System.out.println();
	}
	
	//매개 변수로 int[] 배열을 선언했을 경우 
	//메소드의 매개값으로 사용하고자 할 때에는  14번줄 처럼 new 연산자를 사용해서 배열을 생성해야한다. 
	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
