package sec06.exam01;

public class BreakOutterExample {
	public static void main(String[] args) {
		//��ø�� �ݺ����� ��쿡 break�� ����ϰԵǸ� ����� �ݺ����� �����ϰ� �ٱ��� �ִ� �ݺ����� �������� �ʴ´�.
		//�׷��� �ݺ����� Lavel�� ������, break Lavel�� ���ְԵǸ� �ٱ��� �ݺ������� ����Ǵ� �� �̴�. 
		Outter:for(char upper ='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				
				if(lower=='g') {
					break Outter;
				}
			}
		}
		System.out.println("�ý��� ����");
	}
}
