package abstract_class;

//abstract Ű���带 ������ �߻� Ŭ������ �����ϴ� ���̴�. 
public abstract class Phone {
	//�ʵ�
	public String owner;
	
	//������
	//�߻� Ŭ������ new �����ڸ� ���ؼ� �����ڸ� ȣ���ϴ� ���� �Ұ���������, �ڽ� ��ü�� ������ �� super()�� ȣ���ؼ� �߻� Ŭ���� ��ä�� �����ϹǷ�,
	//�߻� Ŭ������ �����ڰ� �ݵ�� �־�� �Ѵ�.
	public Phone(String owner) {		
		this.owner = owner;
	}
	
	//�޼ҵ�
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
