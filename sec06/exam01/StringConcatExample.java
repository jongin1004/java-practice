package sec06.exam01;

public class StringConcatExample {
	public static void main(String[] args) {
		String str1 =  "JDK" + 6.0;
		String str2 = str1 + " 특징";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0; //+연산식은 왼쪽에서 부터 오른쪽으로 연산이 되기 때문에  JDK + 3이 먼저 계산되어  JDK3 그다음 3.0과 계산되어 JDK33.0
		String str4 = 3 + 3.0 + "JDK"; //3 + 3.0이 먼저 계산되기 때문에 6.0, 그다음 JDK랑 계산되어 6.0JDK
		System.out.println(str3);
		System.out.println(str4);
	}
}
