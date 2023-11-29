package sec06.exam01;
import java.util.Calendar;
import java.util.calendar;

public class EnumWeekExample {
	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		
		switch(week) {
			case 1:
				today = Week.SUNDAY;
				break;
				
			case 2:
				today = Week.MONDAY;
				break;
				
			case 3:
				today = Week.TUESDAY;
				break;
				
			case 4:
				today = Week.WEDNESDAY;
				break;
				
			case 5:
				today = Week.THURSDAY;
				break;
				
			case 6:
				today = Week.FRIDAY;
				break;
				
			default :
				today = Week.SATURDAY;
		}
		System.out.println("���� ���� : " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("�Ͽ��Ͽ��� �౸�� �մϴ�.");
		} else {
			System.out.println("������ �ڹٰ��θ� �մϴ�.");
		}
		
		System.out.println(Week.values());
	}
}
