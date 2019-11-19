import java.util.Scanner;
public class MethodsSamplerPlatter {
	
	
	
	public static String duplicate(String str){
		
		
		
		String newString = "";
		int i, j;
		
		if(str.length() % 2 == 1) {
			
			for(i = 0; i < str.length(); i++) {
				
				for(j = 0; j < str.length(); j++) {
					
					newString += str.charAt(i);
					
				}
				
				j = 0;
				
			}
			
		}else {
			
			for(i = 0; i < str.length(); i++) {
				
				for(j = 0; j < str.length() * 2; j++) {
					
					newString += str.charAt(i);
					
				}
				
			}
			
		}
		
		return newString;
		
	}
	
	public static boolean isEdhesivePalindrome(String str) {
		
		String newString = "";
		int i;
		boolean palindrome = true;
		
		if(!(str.length() > 3 && str.length() < 15)) 
			return false;
			
			str = str.toLowerCase();
			
			for(i = 0; i < str.length(); i++) {
				
				if(str.charAt(i) == '4')
					newString += "a";
				else if (str.charAt(i) == '3')
					newString += "e";
				else if (str.charAt(i) == '0')
					newString += "o";
				else
					newString += str.charAt(i);
				
				
			}
			
			for(i = 0; i < newString.length(); i++) {
				
				if(newString.charAt(i) != newString.charAt(newString.length() - 1 - i))
				   palindrome = false;
			}
			
			return palindrome;
			
			
		
			
			
			
		
		
	}
	
	public static double numberScramble(double num) {
		
		if(num < 0)
			return 0;
		
		num += 5;
		num /= 2;
		num = Math.sqrt(num);
		return num;
		
	}
	
	public static void main(String []args) {
		
		Scanner scan = new Scanner(System.in);
		String word;
		double num;
		
		System.out.println("Welcome to the Methods Sampler Platter. Please enter a String to duplicate.");
		word = scan.nextLine();
		System.out.println("The duplicated String is: " + duplicate(word));
		System.out.println("Next, please enter a String to check for Edhesive Palindromes.");
		word = scan.nextLine();
		
		
		if(isEdhesivePalindrome(word)) {
			System.out.println("Nice, you found an Edhesive Palindrome!");
		}else {
			System.out.println("Too bad, that isn't an Edhesive Palindrome.");
		}
		System.out.println("Almost done! Please enter a number to scramble.");
		num = scan.nextDouble();
		System.out.println("The scrambled number is: " + numberScramble(num));
				
		
		scan.close();
		
	}

}
