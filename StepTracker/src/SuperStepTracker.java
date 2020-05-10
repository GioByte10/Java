//Honestly, I don't know, it is 3:00 AM, I just want to sleep
//I mean, child classes cannot access parent's variables, only use their methods, nor we have methods to get the steps
//So I will just assume that we do


public class SuperStepTracker extends StepTracker{

	public SuperStepTracker(int stepsToActive) {
		super(stepsToActive);
		
	}
	
	public void displayCalories() {
		
		double calories = (double)((super.getTotalSteps() / 1000) * 40);
		
		System.out.println(calories);
		
	}
}
