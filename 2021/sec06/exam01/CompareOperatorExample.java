package sec06.exam01;

public class CompareOperatorExample {
	public static void main(String[] args) {
		//�� �����ڿ����� ������ �����ϱ� ���� Ÿ�� ��ȯ�� ���ؼ� �ǿ������� Ÿ���� ��ġ��Ų��.
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); // int�� double�߿��� ũ�Ⱑ �� ū double�� ���� ��Ų�ڿ� ���Ѵ�. 
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5); // �ε��Ҽ��� Ÿ���̱� ������ 0.1f�� 0.1�� �ٻ簪�� �Ǿ� 0.1�� �ٸ� ���� �ȴ�. �׷��� false��  ����
		System.out.println((float)v4 == v5); //double Ÿ���� float�� ���� ��ȯ�� �����ش����� ���ϸ� �ȴ�.
		System.out.println((int)(v4*10) == (int)(v5*10)); //�Ǵ� ������ ��ȯ�ؼ� �� 
	
	}
}
