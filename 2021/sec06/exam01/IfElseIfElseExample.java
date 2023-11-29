package sec06.exam01;

public class IfElseIfElseExample {
	public static void main(String[] args) {
		int score = 75;
		
		if(score>=90) {
			System.out.println("점수가 90점보다 큽니다.");
			System.out.println("등급은 A등급입니다.");
		} else if(score>=80) {
			System.out.println("점수가 80~89.");
			System.out.println("등급은 B등급 입니다.");
		} else if(score>=70) {
			System.out.println("점수가 70~79.");
			System.out.println("등급은 C등급 입니다.");
		} else {
			System.out.println("점수가 70점 미만");
			System.out.println("등급은 D등급 입니다.");
		}
		
	}
}
