import java.util.ArrayList;

public class WaxOnWaxOff {
	
	public static void main(String args[]) {
		
		ArrayList<String> questions = new ArrayList<>(); 
		
		Student person1 = new Student("Giovanni", "Bernal", 11, "abcde", true);
		Question question1 = new Question("Why do I do this?", "Idk", "I'm tired", "For the AP", "Help", "For the AP");
		Quiz quiz1 = new Quiz("Quiz 1", 100, true, questions);
		
		System.out.println(person1);
		System.out.println(question1);
		System.out.println(quiz1);
	}

}
