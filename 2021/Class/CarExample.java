package Class;

public class CarExample {
	public static void main(String[] args) {
		//��ü ����
//		Car myCar = new Car(); Car class�� �⺻�����ڰ� �ƴ� ��� �����ڸ� ������� ������ �׿� �´� �Ű����� ������߸� ��ü�� ������ �� �ִ�. 
//		Car myCar = new Car("���", 3000);
		
		//�ʵ尪 �ϱ�
//		System.out.println("����ȸ��: " + myCar.company);
//		System.out.println("��: " + myCar.model);
//		System.out.println("����: " + myCar.color);
//		System.out.println("�ְ��ǵ�: " + myCar.maxSpeed);
//		System.out.println("���罺�ǵ�: " + myCar.speed);
//			
//		//�ʵ尪 ����
//		myCar.speed = 60;
//		System.out.println("���罺�ǵ�: " + myCar.speed);
		
//		Car car1 = new Car();
//		System.out.println("car1.company : " + car1.company);
//		System.out.println();
//		
//		Car car2 = new Car("�׷���", "���");
//		System.out.println("car1.company : " + car2.company);
//		System.out.println("car1.model : " + car2.model);
//		System.out.println("car1.color : " + car2.color);
//		System.out.println();
//		
//		Car car3 = new Car("�ڰ���", "����", 200);
//		System.out.println("car1.company : " + car3.company);
//		System.out.println("car1.model : " + car3.model);
//		System.out.println("car1.color : " + car3.color);
//		System.out.println("car1.maxSpeed : " + car3.maxSpeed);
//		System.out.println();
//		
//		Car car4 = new Car("����");
//		System.out.println("car1.company : " + car4.company);
//		System.out.println("car1.model : " + car4.model);
//		System.out.println("car1.color : " + car4.color);
//		System.out.println("car1.maxSpeed : " + car4.maxSpeed);
//		
		
//		Car myCar = new Car();
//				
//		myCar.setGas(5);
//		
//		boolean gasState = myCar.isLeftGas();
//		if(gasState) {
//			System.out.println("����մϴ�.");
//			myCar.run();			
//		}
//		
//		if(myCar.isLeftGas()) {
//			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
//		} else {
//			System.out.println("gas�� �����ϼ���.");
//		}
		
//		Car myCar2 = new Car();
//		myCar2.keyTurnOn();
//		myCar2.run();
//		int speed = myCar.getSpeed();
//		System.out.println("���� �ӵ� : " + speed + "km/h");

//		Car myCar3 = new Car("�ƿ��");
//		myCar3.setSpeed(30);
//		myCar3.setGas(5);		
//		myCar3.run();
		
		Car myCar = new Car();
		
		//�߸��� �ӵ� ����
		myCar.setSpeed(-50);
		
		System.out.println("���� �ӵ� : " + myCar.getSpeed());
		
		//�ùٸ� �ӵ� ����
		myCar.setSpeed(60);
		
		System.out.println("���� �ӵ� : " + myCar.getSpeed());
		
		//����
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("���� �ӵ� : " + myCar.getSpeed());
	}
}
