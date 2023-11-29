package api_object;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	//Object�� toString() �޼ҵ�� ��ü�� ���� ������ �����Ѵ�. -> ��ü�� ���ڿ��� ǥ���� �� -> "Ŭ������@16�����ؽ��ڵ�"
	//���� ����ġ ���� ���̱� ������ �������Ͽ� �����ϰ� ������ ������ �����ϵ��� �Ѵ�.
	@Override
	public String toString() {
		return company + ", " + os;
	}
}
