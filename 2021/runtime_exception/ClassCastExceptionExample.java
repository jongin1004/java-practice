package runtime_exception;

public class ClassCastExceptionExample {
	//class의 타입변환은 상위 클래스와 하위 클래스 간에 발생하고 구현 클래스와 인터페이스 간에도 발생한다.
	//이러한 관계가 아니라면 클래스는 다른 클래스로 타입 변환할 수 없다. 억지로 할 경우에는 ClassCastException이 발생한다.
	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	
	public static void changeDog(Animal animal) {
//		if(animal instanceof Dog){
			Dog dog = (Dog) animal;
//		}
	}
}

class Animal {}
class Dog extends Animal{}
class Cat extends Animal{}
