package sec06.exam01;

public class WhileKeyControlExample {
	public static void main(String[] args) throws Exception {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode!=13 && keyCode !=10) { //EnterŰ�� �ԷµǸ� ĳ��������(13) �� �����ǵ�(10)�� �ԷµǹǷ� �� ���� ���ܽ�Ŵ
				System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤ�");
				System.out.println("1.���� | 2���� | 3.����");
				System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤ�");
				System.out.println("����");
			}
			
			keyCode = System.in.read(); //Ű������ �ڵ带 ����
			
			if (keyCode == 49) { //1�� �о��� ��
				speed++;
				System.out.println("���� �ӵ� = " + speed);
			} else if(keyCode == 50) {
				speed--;
				System.out.println("���� �ӵ� = " + speed);
			} else if(keyCode == 51) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
}

