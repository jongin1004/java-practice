package sec06.exam01;

public class FloatDoubleExample {
	public static void main(String[] args) {
		double var1 = 3.14;
		float var2 = 3.14F; //�ڹ��� �Ǽ� ���ͷ��� �⺻ Ÿ���� double�� �����ϱ� ������ �Ǽ� ���ͷ��� float Ÿ�Կ� �׳� ������ �� ���� ������ �ڿ� F(=f)�� ������ floatŸ���̶�� ���� �˷����Ѵ�.
		
		//���е� �׽�Ʈ
		double var3 = 0.12345678901235465;
		float var4 = 0.12345678901235465F;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		//e ����ϱ�
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
