package sec06.exam01;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z = x / y;
		double z2 = x % y;
		
		System.out.println(Double.isInfinite(z)); //�ش� ���� infinity �� ��쿡 true
		System.out.println(Double.isNaN(z2)); //�ش� ���� NaN �� ��쿡 true
		
		System.out.println(z+2);  // infinity�� NaN ���� ������ �ϸ� ������ infinity or NaN�� ������ ������ ����ε� ���� ������ �ʴ´�. 
	}
}
