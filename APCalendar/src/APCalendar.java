
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
	
}
