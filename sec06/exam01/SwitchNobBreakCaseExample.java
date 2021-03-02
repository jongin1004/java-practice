package sec06.exam01;

public class SwitchNobBreakCaseExample {
	public static void main(String[] args) {
		//switch문의 case에 break를 달면 현재 case에 있는 실행문을 실행시킨뒤에 switch문을 빠져나가게 되지만, break가 없는 경우에는 
		//그 아래에 있는 case도 전부 실행이 된다. (변수의 값과 상관없이)
		int time = (int)(Math.random()*4) + 8;
		System.out.println("현재시간 : " + time);
		
		switch(time) {
		case 8:
			System.out.println("출근합니다");
			
		case 9:
			System.out.println("회의를 합니다.");
			
		case 10:
			System.out.println("업무를 봅니다.");
		
		default:
			System.out.println("외근을 나갑니다.");
		}
	}
}
