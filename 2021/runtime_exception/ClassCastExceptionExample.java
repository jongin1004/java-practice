package runtime_exception;

public class ClassCastExceptionExample {
	//class�� Ÿ�Ժ�ȯ�� ���� Ŭ������ ���� Ŭ���� ���� �߻��ϰ� ���� Ŭ������ �������̽� ������ �߻��Ѵ�.
	//�̷��� ���谡 �ƴ϶�� Ŭ������ �ٸ� Ŭ������ Ÿ�� ��ȯ�� �� ����. ������ �� ��쿡�� ClassCastException�� �߻��Ѵ�.
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
