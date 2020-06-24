//8081WX23
//G.B.


public class Puzzle {
	
	public static String changeKey(String letter, String key) {
		
		String newKey = "";
		
		for(int i = 0; i < key.length(); i++) {
			
			if(!Character.toString(key.charAt(i)).contentEquals(letter))
				newKey += key.charAt(i);
			
		}
		
		if(newKey.equals(key))
			return letter;
		
		return newKey;
		
	}

	
}
