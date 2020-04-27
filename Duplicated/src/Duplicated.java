import java.util.Scanner;

public class Duplicated {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String word;
		
		
		System.out.println("Enter a string to check if it has a duplicated charater");
		word = scan.nextLine();
		
		System.out.println(checkDuplicated(word));
		
		scan.close();
		
		
	}
	
	public static boolean checkDuplicated(String word) {
		
		boolean[] characters = new boolean[128];
		
		for(int i = 0; i < word.length(); i++) {
			
			if((char) (word.charAt(i)) != ' ') {
			
				if(!characters[(int) (word.charAt(i))]) 
					characters[(int) (word.charAt(i))] = true;
			
				else {
					System.out.println(word.charAt(i) + " has been duplicated");
					return true;	
				}
			}
		}
		
		return false;
	}
	
}
