package sec06.exam01;

public class IfElseIfElseExample {
	public static void main(String[] args) {
		int score = 75;
		
		if(score>=90) {
			System.out.println("������ 90������ Ů�ϴ�.");
			System.out.println("����� A����Դϴ�.");
		} else if(score>=80) {
			System.out.println("������ 80~89.");
			System.out.println("����� B��� �Դϴ�.");
		} else if(score>=70) {
			System.out.println("������ 70~79.");
			System.out.println("����� C��� �Դϴ�.");
		} else {
			System.out.println("������ 70�� �̸�");
			System.out.println("����� D��� �Դϴ�.");
		}
		
	}
}
