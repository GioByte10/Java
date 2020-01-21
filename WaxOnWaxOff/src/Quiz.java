import java.util.ArrayList;

class Quiz {
	
	private String quizName;
	private int totalPoints;
	private boolean active;
	private static ArrayList<String> questions = new ArrayList<>(); 
	
	public Quiz(String quizName, int totalPoints, boolean active, ArrayList questions) {
		
		this.quizName = quizName;
		this.totalPoints = totalPoints;
		this.active = active;
		this.questions = questions;
		
	}
	
	public static void addQuestion(String question) {
		
		questions.add(question);
		
	}

	public static ArrayList<String> getQuestions() {
		return questions;
	}	
	
}
