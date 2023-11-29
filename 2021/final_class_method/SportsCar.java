package final_class_method;

public class SportsCar extends Car{
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	//stop메소드는 Car 클래스에서 final로 정의되어있기 때문에 Override가 불가능
	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
}
