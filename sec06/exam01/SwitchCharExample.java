package sec06.exam01;

public class SwitchCharExample {
	public static void main(String[] args) {
		char grade = 'B';
		
		//영어 대소문자에 관계없이 똑같은 알파벳이라면 동일하게 처리하도록 만든 switch문이다. 
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
			
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;			
		}
	}
}
