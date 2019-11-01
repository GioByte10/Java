import java.util.Scanner;

public class WritinMethods {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		String temp = "", temp2 = "";
		int temp3;
		
		System.out.println("What is your name?");
		greetings(scan.nextLine());
		
		System.out.println("Enter your name");
		temp = scan.nextLine();
		System.out.println("Enter your last name");
		System.out.println(fullName(temp, scan.nextLine()));
		
		System.out.println("Enter a String with a space");
		removeSpace(scan.nextLine());
		
		System.out.println("Enter a String to get its length");
		getLength(scan.nextLine());
		
		System.out.println("Enter your name");
		temp = scan.nextLine();
		System.out.println("Enter your last name");
		reverseName(temp, scan.nextLine());
		
		System.out.println("Write a message");
		fiveTimes(scan.nextLine());
		
		System.out.println("Write a message");
		temp = scan.nextLine();
		System.out.println("How many times to repeat it?");
		nTimes(temp, scan.nextInt());
		
		scan.nextLine();
		
		System.out.println("Input a String");
		temp = scan.nextLine();
		System.out.println("Input another String");
		longer(temp, scan.nextLine());
		
		System.out.println("Input a String");
		temp = scan.nextLine();
		System.out.println("Input another a String");	
		palindrome(temp, scan.nextLine());
		
		
		System.out.println("Input a String");	
		System.out.println(numberOfSpaces(scan.nextLine()) + " \n");
		
		System.out.println("Input a String");
		temp = scan.nextLine();
		System.out.println("Input a character");
		System.out.println(appears(temp, scan.next().charAt(0)) + "\n");
		
		scan.nextLine();
		
		System.out.println("Input a String");
		temp = scan.nextLine();
		System.out.println("Input a character");
		temp2 = scan.nextLine();
		if(indexOfCharacter(temp, temp2.charAt(0)) == -1)
		System.out.println("False");
		else
		System.out.println((indexOfCharacter(temp, temp2.charAt(0)) + 1) + " \n");
		
		boolean bool = true;
		System.out.println("Enter a String");
		System.out.println(lowerUpper(scan.nextLine(), bool));
		
		System.out.println("Enter a String");
		temp = scan.nextLine();
		System.out.println("Enter a range:\nStart");
		temp3 = scan.nextInt();
		System.out.println("End:");
		System.out.println(subString(temp, temp3, scan.nextInt())); 
		
		System.out.println(randomLetter());
		
		
		
		
		
		
		
	}
	
	
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
