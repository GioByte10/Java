import java.util.ArrayList;
import java.util.Scanner;

public class CreateRandomPassword {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int lowercase, uppercase, numbers, symbols;
		
		System.out.println("Welcome to the random password generator");
		
		System.out.println("Enter the number of lowercase: ");
		lowercase = scan.nextInt();	
		
		System.out.println("Enter the number of uppercase: ");
		uppercase = scan.nextInt();		
		
		System.out.println("Enter the number of numbers: ");
		numbers = scan.nextInt();		
		
		System.out.println("Enter the number of symbols: ");
		symbols = scan.nextInt();		
		
		generatePassword(generateCharacters(lowercase, uppercase, numbers, symbols));
			
	}
	
	static ArrayList<String> generateCharacters(int lowercase, int uppercase, int numbers, int symbols){
		
		ArrayList<String> characters = new ArrayList<String>();
		char c;
		int rand;
		
		//                                                             This method uses ASCII Table to get the characters
		//                                                             I attach the ASCII Table image in the project folder
		
		for(int i = 0; i < lowercase; i++) {
			
			c = (char) ((int) (Math.random() * 26) + 97);         // lowercase letters: [97, 122]
			characters.add(Character.toString(c));				
		}
		
		for(int i = 0; i < uppercase; i++) {
			
			c = (char) ((int) (Math.random() * 26) + 65);         // uppercase letters: [65, 90]
			characters.add(Character.toString(c));		
		}
		
		for(int i = 0; i < numbers; i++) {
			
			c = (char) ((int) (Math.random() * 10) + 48);         // numbers: [48, 57]
			characters.add(Character.toString(c));		
		}
		
		for(int i = 0; i < symbols; i++) {
			
			rand = ((int) (Math.random() * 32) + 33);         // symbols: [33, 47], [58, 64], [91, 96], [123, 126]
			
			if(rand > 47)
				rand += 10;
			
			if(rand > 64)
				rand += 26;
			
			if(rand > 96)
				rand += 26;
			
			c = (char) rand;
			
			characters.add(Character.toString(c));		
		}
		
		return characters;
		
	}
	
	static void generatePassword(ArrayList<String> characters) {
		
		String password = "";
		int rand;
		
		while(characters.size() > 0) {
			
			rand = (int) (Math.random() * characters.size());
			password += characters.get(rand);
			characters.remove(rand);
			
		}
		
		System.out.println("Generated Password: ");
		System.out.println(password);
		
	}	
}
