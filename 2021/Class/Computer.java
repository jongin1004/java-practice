package Class;

public class Computer {
	//�Ű� ������ ���� �� ��� -> �迭 Ÿ������ �����ϸ� �ȴ�. 	
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];			
		}
		return sum;
	}
	
	//...�� ����ϸ� �޼ҵ� ȣ�� �� �Ѱ��� ���� ���� ���� �ڵ����� �迭�� �����ǰ� �Ű������� ���ȴ�. 
	int sum2(int ... values) {
		int sum=0;
		for(int i = 0; i<values.length; i++) {
			sum += values[i];		
		}
		return sum;
	}
}
