package Class;

public class KoreanExample {
	public static void main(String[] args) {
		Korean K1 = new Korean("¹ÚÀÚ¹Ù", "010288-3968203");
		System.out.println("K1.name: " + K1.name);
		System.out.println("K1.ssn: " + K1.ssn);
		
		
		Korean K2 = new Korean("±èÆÄÀÌ½ã", "153623-3968203");
		System.out.println("K2.name: " + K2.name);
		System.out.println("K2.ssn: " + K2.ssn);
	}
}
