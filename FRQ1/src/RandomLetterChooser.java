
public class RandomLetterChooser extends RandomStringChooser{
	
	private String[] str;
	
	public RandomLetterChooser(String str) {
		
		super(getSingleLetters(str));
		
		
	}
	
	public static String[] getSingleLetters(String str) {
		
		String[] characters = new String[str.length()];
		
		for(int i = 0; i < str.length(); i++) {
			characters[i] = Character.toString(str.charAt(i));
		}
		
		return characters;
		
	}

}
