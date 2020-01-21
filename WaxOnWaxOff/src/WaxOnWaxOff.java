import java.util.ArrayList;

public class WaxOnWaxOff {
	
	public static void main(String args[]) {
		
		ArrayList<String> questions = new ArrayList<>(); 
		
		Student person1 = new Student("Giovanni", "Bernal", 11, "abcde", true);
		Question question1 = new Question("Why do I do this?", "Idk", "I'm tired", "For the AP", "Help", "For the AP");
		Quiz quiz1 = new Quiz("Quiz 1", 100, true, questions);
		quiz1.addQuestion("U good Michael");
		
		System.out.println(quiz1.getQuestions());
		
		
	}

}
