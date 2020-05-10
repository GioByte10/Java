
public class Main {
	
	public static void main(String[] args) {
		
		StepTracker c = new StepTracker(10000);
		System.out.println("" + c.activeDays());
		System.out.println("" + c.averageSteps());
	    c.addDailySteps(9000);
	    c.addDailySteps(5000);
		System.out.println("" + c.activeDays());
		System.out.println("" + c.averageSteps());
		c.addDailySteps(13000);
		c.addDailySteps(23000);
		System.out.println("" + c.activeDays());
		c.addDailySteps(1111);
		System.out.println("" + c.averageSteps());
		
	}
}
