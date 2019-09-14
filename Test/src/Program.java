import java.util.Scanner;
import java.lang.Math;
public class Program {
	
	public static void main(String []args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type the message to be shortened");
		String message = scan.nextLine();
		String correct = "";
		String fin = "";
		
		int len = message.length();
		char x;
		int c = 0, letters = 0, vowels = 0;
		
		if(len > 10) {
			
			message = message.toLowerCase();
			
while (c < len) {
				
				x = message.charAt(c);
				
				if(c > 0 && message.charAt(c - 1) == x && !(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u')) {
					
					c++;
					letters ++;
					
				}else {
					
					correct += x;
					c++;
					
				}
				
			}
			
			
			
			System.out.println(correct);
			c = 0;
			
		
			
			
			len = correct.length();
			
while (c < len) {
				
				x = correct.charAt(c);
				
				if(c > 0 && (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') && correct.charAt(c - 1) != ' ') {
					
					c++;
					vowels++;
					
				}else {
					
					fin += x;
					c++;
					
				}
				
			}
			


System.out.println("Shortened message: " + fin);	
System.out.println("Repeated letters removed: " + letters);	
System.out.println("Vowels removed: " + vowels);	
System.out.println("Total characters saved " + (message.length() - fin.length()));	

			
			
			
		}else {
			
			System.out.println("This doesn't need shortening!");
			
		}
		
		
		
		scan.close();
		//Lesson_11_Activity_Two
		
	}

}