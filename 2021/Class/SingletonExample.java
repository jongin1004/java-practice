package Class;

public class SingletonExample {
	public static void main(String[] args) {
		
//		Singleton obj1 = new Singleton(); 에러 -> 생성자를 외부에서 호출 할 수 없도록 private 접근 제한차를 붙여줬기 때문이다.
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		} else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
		
	}
}
