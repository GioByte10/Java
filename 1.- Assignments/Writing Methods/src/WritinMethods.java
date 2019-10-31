import java.util.Scanner;

public class WritinMethods {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		String temp = "";
		
		/*System.out.println("What is your name?");
		Greetings(scan.nextLine());
		
		System.out.println("Enter your name");
		temp = scan.nextLine();
		System.out.println("Enter your last name");
		System.out.println(FullName(temp, scan.nextLine()));
		
		System.out.println("Enter a String with a space");
		RemoveSpace(scan.nextLine());
		
		System.out.println("Enter a String to get its length");
		GetLength(scan.nextLine());
		
		System.out.println("Enter your name");
		temp = scan.nextLine();
		System.out.println("Enter your last name");
		ReverseName(temp, scan.nextLine());
		
		System.out.println("Write a message");
		FiveTimes(scan.nextLine());
		
		System.out.println("Write a message");
		temp = scan.nextLine();
		System.out.println("How many times to repeat it?");
		NTimes(temp, scan.nextInt());
		
		scan.nextLine();
		
		System.out.println("Input a String");
		temp = scan.nextLine();
		System.out.println("Input another String");
		Longer(temp, scan.nextLine());
		
		System.out.println("Input a String");
		temp = scan.nextLine();
		System.out.println("Input another a String");	
		Palindrome(temp, scan.nextLine());
		*/
		
		System.out.println("Input a String");	
		System.out.println(NumberOfSpaces(scan.nextLine()) + " \n");
		
		System.out.println("Input a String");
		temp = scan.nextLine();
		System.out.println("Input a character");
		System.out.println(Appears(temp, scan.next().charAt(0)) + "\n");
		
		System.out.println("Input a String");
		temp = scan.nextLine();
		System.out.println("Input a character");
		System.out.println(IndexOfCharacter(temp, scan.next().charAt(0)) + " \n");
		
		
	}
	
	
	public static void Greetings(String name) {
		
		System.out.println("Greetings " + name + "\n");
	}
	
	public static String FullName(String first, String last) {
		
		return first + " " + last + "\n";
	}
	
	public static void RemoveSpace(String space) {
		
		String noSpace = "";
		
		for(int i = 0; i < space.length(); i++) {
			
			if(space.charAt(i) != ' ') 	
			noSpace += space.charAt(i); 
		}
		
		System.out.println(noSpace + "\n");
	}
	
	public static void GetLength(String x) {
		
		System.out.println(x.length() + "\n");
	}
	
	public static void ReverseName(String name, String last) {
		
		System.out.println(last + ", " + name + "\n");		
	}
	
	public static void FiveTimes(String mes) {
		
		System.out.println(mes);
		System.out.println(mes);
		System.out.println(mes);
		System.out.println(mes);
		System.out.println(mes + "\n");
	}
	
    public static void NTimes(String mes, int n) {
		
		for(;n > 0; n--) {
			
			System.out.println(mes);
		}
		System.out.println();
	}
    
    public static void Longer(String x, String y){
    	
    	if(x.length() > y.length()) 
    		System.out.println(x + "is longer");
    	
    	else if(x.length() < y.length())    		
    		System.out.println(y + "is longer");
    	
    	else
    		System.out.println("They are both the same length");
    	
    	
    	System.out.println();
    	
    }
    
    public static void Palindrome(String x, String y) {
    	
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
    
    public static int NumberOfSpaces(String sen) {
    	
    	int n = 0;
    	
    	for(int i = 0; i < sen.length(); i++) {
    		
    		if(sen.charAt(i) == ' ')
    			n++;
    		
    	}
    	
    	return n;
    }
    
    public static int Appears(String x, char chara) {
    	
    	int n = 0;
    	
    	for(int i = 0; i < x.length(); i++) {
    		
    		if(x.charAt(i) == chara)
    			n++;
    		
    	}
    	
    	return n;
    	
    }
	
}
