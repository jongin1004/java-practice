package Class;

public class Car {
	//필드
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
//	int speed;
	int gas;
	
	//외부에서 필드값을 변경하지 못하도록 private 접근 제한자
	private int speed; 
	private boolean stop;
	
	//생성자
	Car(){
			
	}
	
//	Car(String model, String color){
//		this.model = model;
//		this.color = color;
//	}
	
	Car(String model){
//		this(model, "은색", 120);
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
	
	//메소드
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
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				speed += 10;
				this.setSpeed(speed);
				System.out.println("달립니다. (시속 :" + speed + "km/h)");
				System.out.println("달립니다. (gas 잔량" + gas + ")");
				gas -= 1;				
			} else {
				System.out.println("멈춥니다. (gas 잔량" + gas + ")");
				return;
			}
		}
	}
	
//	int getSpeed() {
//		return speed;		
//	}
//	
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");		
	}
	
	//this는 객체 자신을 가르키는 것, this를 통해서 객체의 필드를 가르킬 수 있다. 
//	void setSpeed(int speed) {
//		this.speed = speed;
//	}
}
