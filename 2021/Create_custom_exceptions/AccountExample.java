package Create_custom_exceptions;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		//�����ϱ�
		account.deposit(10000);
		System.out.println("���ݾ� : " + account.getBalance());
		//����ϱ�
		try {
			account.withdraw(30000);
		} catch(BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			
			//printStackTrace�� ���ؼ� Account Ŭ���� 18��° �ٿ��� ���ʷ� ���ܰ� �߻�
			//AccountExample 11��° �޼ҵ� ȣ�� ��ġ�� ���ܰ� ���Ѱ� ������ �� �� �ִ�.
			e.printStackTrace();
		}
	}
}
