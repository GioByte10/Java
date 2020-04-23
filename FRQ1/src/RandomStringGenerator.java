
public class RandomStringGenerator{
	
	
	public RandomStringGenerator(String[] words, int times) {
		
		RandomStringChooser string = new RandomStringChooser(words);
		
		for(int i = 0; i < times; i++) {
			System.out.print(string.getNext() + " ");
		}
		
		System.out.println("\n");
		
		
	}
	
	public RandomStringGenerator(String word, int times) {
		
		RandomLetterChooser string = new RandomLetterChooser(word);
		
		for(int i = 0; i < times; i++) {
			System.out.print(string.getNext());
		}
		
		System.out.println("\n");
		
	}
	

}
