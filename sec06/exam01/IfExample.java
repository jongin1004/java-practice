package sec06.exam01;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;
		
		if(score>=90) {
			System.out.println("점수가 90점보다 큽니다.");
			System.out.println("등급은 A등급입니다.");
		}
		
		//if문의 실행문이 1줄일 경우에는 {}을 생략가능하다. 하지만 가독성 뜻밖의 오류를 가 있을 수 있기 때문에 붙히는게 좋다.
		if(score<90) 
			System.out.println("점수가 90점보다 작습니다.");
			System.out.println("등급은 A등급이 아닙니다."); // if문 밖에 있는 실행문이기 때문에 if결과에 상관없이 실행
	}
}
 