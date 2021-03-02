package sec06.exam01;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) { //v1는 main 메소드 블럭안에서 정의 된 것임으로 if문 안에서도 사용가능하다. 
			int v2 = v1 - 10;			
		}
//		int v3 = v1 + v2 + 5; //v2 는 if문 안에서 정의된 변수임으로 if문 밖에서는 사용 불가능
		System.out.println(v1);				
		
	}
}
