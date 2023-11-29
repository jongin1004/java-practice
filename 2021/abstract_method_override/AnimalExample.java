package abstract_method_override;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
					
		dog.sound();
		cat.sound();
		System.out.println("***********");
		
		//������ �ڵ� Ÿ�� ��ȯ
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		System.out.println("***********");
		
		//�޼ҵ��� ������
		animalSound(new Dog()); //AnimalŸ������ �ڵ� Ÿ�� ��ȯ �Ǿ �Ű������� ����.
		animalSound(new Cat()); //AnimalŸ������ �ڵ� Ÿ�� ��ȯ �Ǿ �Ű������� ����.
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
}
