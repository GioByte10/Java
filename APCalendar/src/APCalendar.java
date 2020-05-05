
public class APCalendar {
	
	private static boolean isYearLeap(int year) {
		
		if(year % 4 == 0)
			return true;
		else
			return false;
	}
	
	public static int numberOfLeapYears(int year1, int year2) {
		
		int count = 0;
		
		for(int i = year1; i <= year2; i++) {
			if(isYearLeap(i))
				count++;
		}
		return count;
	}
	
	public static int dayOfWeek(int month, int day, int year) {
		
		int dayW = firstDayOfYear(year) + dayOfYear(month, dayW, year);
		dayW %= 7;
		dayW--;
		
		return dayW;	
		
	}

	private static int dayOfYear(int month, int day, int year) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int firstDayOfYear(int year) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
