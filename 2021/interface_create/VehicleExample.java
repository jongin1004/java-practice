package interface_create;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkFare(); //���� Ŭ������ �ִ� �޼ҵ�� �������̽� Ÿ������ �ڵ� Ÿ�� ���� ��쿡 ��� �Ұ���
		
		//�������̽� Ÿ�Կ��� ���� Ŭ���� Ÿ������ ���� Ÿ�� ��ȯ(casting)
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
		
	}
}
