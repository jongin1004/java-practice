package final_class_method;

public class SportsCar extends Car{
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	//stop�޼ҵ�� Car Ŭ�������� final�� ���ǵǾ��ֱ� ������ Override�� �Ұ���
	@Override
	public void stop() {
		System.out.println("������ī�� ����");
		speed = 0;
	}
}
