package sec06.exam01;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;
		
		if(score>=90) {
			System.out.println("������ 90������ Ů�ϴ�.");
			System.out.println("����� A����Դϴ�.");
		}
		
		//if���� ���๮�� 1���� ��쿡�� {}�� ���������ϴ�. ������ ������ ����� ������ �� ���� �� �ֱ� ������ �����°� ����.
		if(score<90) 
			System.out.println("������ 90������ �۽��ϴ�.");
			System.out.println("����� A����� �ƴմϴ�."); // if�� �ۿ� �ִ� ���๮�̱� ������ if����� ������� ����
	}
}
 