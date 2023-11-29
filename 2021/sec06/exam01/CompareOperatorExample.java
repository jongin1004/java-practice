package sec06.exam01;

public class CompareOperatorExample {
	public static void main(String[] args) {
		//비교 연산자에서도 연산을 수행하기 전에 타입 변환을 통해서 피연산자의 타입을 일치시킨다.
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); // int와 double중에서 크기가 더 큰 double로 통일 시킨뒤에 비교한다. 
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); // 부동소수점 타입이기 때문에 0.1f는 0.1의 근사값이 되어 0.1과 다른 값이 된다. 그래서 false가  나옴
		System.out.println((float)v4 == v5); //double 타입을 float로 강제 변환을 시켜준다음에 비교하면 된다.
		System.out.println((int)(v4*10) == (int)(v5*10)); //또는 정수로 변환해서 비교 
	
	}
}
