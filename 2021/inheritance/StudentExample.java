package inheritance;

public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student("ÃÖÁ¾ÀÎ", "112356-3498282", 1);
		
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentNo : " + student.studentNo);
	}
}

