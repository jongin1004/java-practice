package sec06.exam01;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) { //v1�� main �޼ҵ� ���ȿ��� ���� �� �������� if�� �ȿ����� ��밡���ϴ�. 
			int v2 = v1 - 10;			
		}
//		int v3 = v1 + v2 + 5; //v2 �� if�� �ȿ��� ���ǵ� ���������� if�� �ۿ����� ��� �Ұ���
		System.out.println(v1);				
		
	}
}
