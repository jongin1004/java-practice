package api_object;

public class SmartPhoneExample {
	public static void main(String[] args) {
		//Object의 toString() 메소드는 객체의 문자 정보를 리턴한다. -> 객체를 문자열로 표현한 값 -> "클래스명@16진수해시코드"
		//별로 값어치 없는 값이기 때문에 재정의하여 간결하고 유익한 정보를 리턴하도록 한다.
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
	}
}
