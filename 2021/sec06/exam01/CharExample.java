package sec06.exam01;

public class CharExample {
	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		
		char c4 = '가';
		char c5 = 44032;	//유니코드 10진수로 저장
		char c6 = '\uac00'; //유니코드 16진수로 저장
		
		int uniCode = c1; //유니코드 얻기
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println
		(uniCode);
		
		char c = ' '; // char 타입의 변수를 단순히 초기화 목적으로 할 경우에는 ' '사이에 빈 공간을 줘야한다. 안주면 error 
	}
}

