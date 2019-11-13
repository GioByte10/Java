
public class StringsToUpper {
	
	public static void upper(String words[]) {
		
		for(int i = 0; i < words.length; i++) {
			
			words[i] = words[i].toUpperCase();
			
		}
		
	}
	
	public static void main(String []args) {
		
		
		String words[] = new String[2];
		
		words[0] = "Hi";
		words[1] = "Hello";
		
		upper(words);
		
		
		
	}

}
