package nested_interface;

public class CallListener implements Button.OnClickListener{
	@Override
	public void onClick() {
		System.out.println("��ȭ�� �̴ϴ�.");
	}
}
