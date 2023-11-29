package sec06.exam01;

public class FloatDoubleExample {
	public static void main(String[] args) {
		double var1 = 3.14;
		float var2 = 3.14F; //자바의 실수 리터럴의 기본 타입을 double로 간주하기 때문에 실수 리터럴을 float 타입에 그냥 저장할 수 없기 때문에 뒤에 F(=f)를 붙혀서 float타입이라는 것을 알려야한다.
		
		//정밀도 테스트
		double var3 = 0.12345678901235465;
		float var4 = 0.12345678901235465F;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		//e 사용하기
		int var5 = 3000000;
		double var6 = 3e6;
		float var7 = 3e6F;
		double var8 = 2e-3;
		
		System.out.println(var5);
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
	}
}
