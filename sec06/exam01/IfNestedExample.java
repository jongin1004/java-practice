package sec06.exam01;

public class IfNestedExample {
	public static void main(String[] args) {
		int score = (int)(Math.random()*20) + 81;
		String grade;
		System.out.println("���� = " + score);
		
		if(score>=90) {
			if(score>=95) {
				grade="A+";
			}else {
				grade="A";
			}
			
		} else {
			if(score>=85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		
		System.out.println("��� = " + grade);
	}
}
