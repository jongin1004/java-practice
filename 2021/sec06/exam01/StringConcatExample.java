package sec06.exam01;

public class StringConcatExample {
	public static void main(String[] args) {
		String str1 =  "JDK" + 6.0;
		String str2 = str1 + " Ư¡";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0; //+������� ���ʿ��� ���� ���������� ������ �Ǳ� ������  JDK + 3�� ���� ���Ǿ�  JDK3 �״��� 3.0�� ���Ǿ� JDK33.0
		String str4 = 3 + 3.0 + "JDK"; //3 + 3.0�� ���� ���Ǳ� ������ 6.0, �״��� JDK�� ���Ǿ� 6.0JDK
		System.out.println(str3);
		System.out.println(str4);
	}
}
