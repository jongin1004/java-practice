package Class;

public class ComputerExample {
	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int[] values1 = {1, 2, 3}; //�޼ҵ� ������� �迭�� ���� �����ϴ� �� 
		int result1 = myCom.sum1(values1);
		System.out.println("result1 = " + result1);
		
		int result2 = myCom.sum2(new int[] {1,2,3,4,5}); // �޼ҵ带 ȣ���Ҷ� �Ű�������  �迭�� �ٷ� �־��ִ� ��
		System.out.println("result2 = " + result2);
		
		int result3 = myCom.sum2(1,2,3); // ...�� �̿��ؼ� �ٷ� ���� �Ѱ��ִ� ��� 
		System.out.println("result3 = " + result3);
		
		int result4 = myCom.sum2(1,2,3,4,5);
		System.out.println("result4 = " + result4);
		
	}
}
