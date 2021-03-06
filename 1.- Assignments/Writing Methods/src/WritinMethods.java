public class WritinMethods {


	public static void greetings(String name) {
		
		System.out.println("Greetings " + name + "\n");
	}
	
	public static String fullName(String first, String last) {
		
		return first + " " + last + "\n";
	}
	
	public static void removeSpace(String space) {
		
		String noSpace = "";
		
		for(int i = 0; i < space.length(); i++) {
			
			if(space.charAt(i) != ' ') 	
			noSpace += space.charAt(i); 
		}
		
		System.out.println(noSpace + "\n");
	}
	
	public static void getLength(String x) {
		
		System.out.println(x.length() + "\n");
	}
	
	public static void reverseName(String name, String last) {
		
		System.out.println(last + ", " + name + "\n");		
	}
	
	public static void fiveTimes(String mes) {
		
		System.out.println(mes);
		System.out.println(mes);
		System.out.println(mes);
		System.out.println(mes);
		System.out.println(mes + "\n");
	}
	
    public static void nTimes(String mes, int n) {
		
		for(;n > 0; n--) {
			
			System.out.println(mes);
		}
		System.out.println();
	}
    
    public static void longer(String x, String y){
    	
    	if(x.length() > y.length()) 
    		System.out.println(x + "is longer");
    	
    	else if(x.length() < y.length())    		
    		System.out.println(y + "is longer");
    	
    	else
    		System.out.println("They are both the same length");
    	
    	
    	System.out.println();
    	
    }
    
    public static void palindrome(String x, String y) {
    	
    	boolean right = true;
    	
    	if(x.length() == y.length()) {
    	
    	for(int i = 0; i < x.length(); i++) {
    		
    		if(x.charAt(i) != y.charAt(y.length() - i - 1))
    			right = false;
    		
    	}
    	
    	if(right)
    		System.out.println("They are palindrome\n");
    	else
    		System.out.println("They are not palindrome\n");
    	
    }else {
    	System.out.println("They are not palindrome\n");
    }
    }
    
    public static int numberOfSpaces(String sen) {
    	
    	int n = 0;
    	
    	for(int i = 0; i < sen.length(); i++) {
    		
    		if(sen.charAt(i) == ' ')
    			n++;
    		
    	}
    	
    	return n;
    }
    
    public static int appears(String x, char chara) {
    	
    	int n = 0;
    	
    	for(int i = 0; i < x.length(); i++) {
    		
    		if(x.charAt(i) == chara)
    			n++;
    		
    	}
    	
    	return n;
    	
    }
    
    public static int indexOfCharacter(String x, char chara) {
    	
    	int n = -1;
    	
    	for(int i = 0; i < x.length(); i++) {
    		
    		if(x.charAt(i) == chara) {
    			n = i;
    			break;
    		}
        
    	}
    	
    	return n;
    }
    
    public static String lowerUpper(String word, boolean cond) {
    	
    	if (cond)
    		word = word.toUpperCase();
    	else 
    		word = word.toLowerCase();
    	
    	return word;
    		    		
    }
    public static String subString(String x, int n, int m) {
    	
    	if(m <= x.length())
    		return x.substring(n, m);
    	else
    		return "Not valid";
    		
    
    }
    
    public static char randomLetter() {
    	
    	char c = (char) ((Math.random() * 25) + 65);
    	return c;
    }
	
}
