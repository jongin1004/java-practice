package Class;

public class Calculator {
	static double pi = 3.141592;
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}	
	
	//�޼ҵ�
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	
	//�޼ҵ��� Ÿ���� return ���� ���� type�� �����ϰ� �����ָ�ȴ�.
//	int plus(int x, int y) {
//		int result = x + y;
//		return result;
//	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}
	
	//Ŭ���� �ܺο��� �޼ҵ带 ȣ���� ��쿡�� �켱 Ŭ������ ���� ��ü�� ������ ��, ���� ������ �̿��ؼ� �޼ҵ带 ȣ���ؾ��Ѵ�. -> ��ü�� �����ؾ� �޼ҵ嵵 �����ϱ� ������
	//������, Ŭ���� ���ο��� �޼ҵ带 ȣ���Ұ�쿡�� �޼ҵ��� �̸��� �����ָ� ������ �����ϰ� return�� �ִ� �޼ҵ��� ��쿡�� 
	//return�� ���� Ÿ���̳� ��ȭ�� ������ Ÿ�� ������ ���� �޾Ƶ��̸� �ȴ�. 
	void execute(int x, int y) {
		double result = avg(x, y);
		println("������ : " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
	
	double divide(double x, double y) {
		double result = x / y;
		return result;
	}
	
	//return�� ���� �ʴ� �޼ҵ�� void�� �����ָ� �ȴ�.
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	//���簢���� ����
	double areaRectangle(double width) {
		return width * width;
	}
	
	//���簢���� ����
	double areaRectangle(double width, double height) {
		return width * height;
	}
}
