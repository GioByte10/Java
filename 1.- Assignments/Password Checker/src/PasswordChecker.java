import java.util.Scanner;

public class PasswordChecker {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int option = 0;
		
		System.out.println("(-3) To create an account (you can create as many accounts as you want)");
		System.out.println("(-1) To Log In\n(-2) To Log Out");
		System.out.println("It seems there are no accounts. You will have to create one.");
		
		while(option != -3) {
			
			if(option == -1)
				System.out.println("There are no accounts to Log In");
			
			if(option == -2)
				System.out.println("You are not Logged In");
			
		}
		
	}

}
