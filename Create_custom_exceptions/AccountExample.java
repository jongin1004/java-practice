package Create_custom_exceptions;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		//예금하기
		account.deposit(10000);
		System.out.println("예금액 : " + account.getBalance());
		//출금하기
		try {
			account.withdraw(30000);
		} catch(BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			
			//printStackTrace를 통해서 Account 클래스 18번째 줄에서 최초로 예외가 발생
			//AccountExample 11번째 메소드 호출 위치로 예외가 떠넘겨 졌음을 알 수 있다.
			e.printStackTrace();
		}
	}
}
