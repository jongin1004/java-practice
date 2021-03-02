package sec06.exam01;

public class CheckValueBeforeCasting {
	public static void main(String[] args) {
		long i = 128;
		
		if( (i<Integer.MIN_VALUE) || (i>Integer.MAX_VALUE) ) {
			System.out.println("byte타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해주세요.");
		} else {
			int b = (int) i;
			System.out.println(b);
		}
	}
}
