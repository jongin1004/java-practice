package api_object.finalize;

public class FinalizeExample {
	public static void main(String[] args) {
		Counter counter = null;
		
		for(int i = 1; i<=50; i++) {
			counter = new Counter(i);
			
			counter = null;
			
			//for문이 실행될 때 마다 가급적 빨리 쓰레기 수집기를 실행해달라
			System.gc();			
		}
	}
}
