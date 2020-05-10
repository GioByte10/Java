import java.util.ArrayList;

public class StepTracker {
	
	private int stepsToActive;
	ArrayList<Integer> dailySteps = new ArrayList<Integer>(); 
	
	public StepTracker(int stepsToActive) {
		
		this.stepsToActive = stepsToActive;
		
	}
	
	public void addDailySteps(int steps) {
		dailySteps.add(steps);
	}
	
	public int activeDays() {
		int activeD = 0;
		
		for(int steps: dailySteps) {
			if(steps >= stepsToActive)
				activeD++;
		}
		return activeD;
	}
	
	public double averageSteps() {
		double average = 0;
		double totalSteps = 0;
		
		for(int steps: dailySteps) {
			totalSteps += steps;
		}
		if(dailySteps.size() > 0)
			average = totalSteps / dailySteps.size();
	   	return average;
	}

	public int getTotalSteps() {
		// TODO Auto-generated method stub
		return 0;
	}
}
