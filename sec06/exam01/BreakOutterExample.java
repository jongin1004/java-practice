package sec06.exam01;

public class BreakOutterExample {
	public static void main(String[] args) {
		//중첩된 반복문일 경우에 break를 사용하게되면 가까운 반복문만 종료하고 바깥에 있는 반복문은 종료하지 않는다.
		//그래서 반복문에 Lavel을 붙혀서, break Lavel을 해주게되면 바깥쪽 반복문까지 종료되는 것 이다. 
		Outter:for(char upper ='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				
				if(lower=='g') {
					break Outter;
				}
			}
		}
		System.out.println("시스템 종료");
	}
}
