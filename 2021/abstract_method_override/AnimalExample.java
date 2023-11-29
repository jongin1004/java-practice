package abstract_method_override;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
					
		dog.sound();
		cat.sound();
		System.out.println("***********");
		
		//변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		System.out.println("***********");
		
		//메소드의 다형성
		animalSound(new Dog()); //Animal타입으로 자동 타입 변환 되어서 매개값으로 들어간다.
		animalSound(new Cat()); //Animal타입으로 자동 타입 변환 되어서 매개값으로 들어간다.
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
