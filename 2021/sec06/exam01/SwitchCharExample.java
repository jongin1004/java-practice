package sec06.exam01;

public class SwitchCharExample {
	public static void main(String[] args) {
		char grade = 'B';
		
		//���� ��ҹ��ڿ� ������� �Ȱ��� ���ĺ��̶�� �����ϰ� ó���ϵ��� ���� switch���̴�. 
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("��� ȸ���Դϴ�.");
			break;
			
		case 'B':
		case 'b':
			System.out.println("�Ϲ� ȸ���Դϴ�.");
			break;			
		}
	}
}
