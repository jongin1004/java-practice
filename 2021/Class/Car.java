package Class;

public class Car {
	//�ʵ�
	String company = "�����ڵ���";
	String model = "�׷���";
	String color = "����";
	int maxSpeed = 350;
//	int speed;
	int gas;
	
	//�ܺο��� �ʵ尪�� �������� ���ϵ��� private ���� ������
	private int speed; 
	private boolean stop;
	
	//������
	Car(){
			
	}
	
//	Car(String model, String color){
//		this.model = model;
//		this.color = color;
//	}
	
	Car(String model){
//		this(model, "����", 120);
		this.model = model;
	}
	
	Car(String model, String color){
		this(model, color, 250);
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	//�޼ҵ�
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		}
		System.out.println("gas�� �ֽ��ϴ�.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				speed += 10;
				this.setSpeed(speed);
				System.out.println("�޸��ϴ�. (�ü� :" + speed + "km/h)");
				System.out.println("�޸��ϴ�. (gas �ܷ�" + gas + ")");
				gas -= 1;				
			} else {
				System.out.println("����ϴ�. (gas �ܷ�" + gas + ")");
				return;
			}
		}
	}
	
//	int getSpeed() {
//		return speed;		
//	}
//	
	void keyTurnOn() {
		System.out.println("Ű�� �����ϴ�.");		
	}
	
	//this�� ��ü �ڽ��� ����Ű�� ��, this�� ���ؼ� ��ü�� �ʵ带 ����ų �� �ִ�. 
//	void setSpeed(int speed) {
//		this.speed = speed;
//	}
}
