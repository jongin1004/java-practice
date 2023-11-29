package sec06.exam01;

public class dd {	
	public static void main(String[] args) {
		int[] results = new int[6];	
		
		for(int i = 0; i<6; i++) {
			results[i] = (int) (Math.random()*45)+1;			
		}
		
		for(int result : results) {
			System.out.println(result);
		}
	}
}
