import java.util.Scanner;

public class PasswordChecker {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static int option = 0, totalAccounts = 0, i = 0, userNameNum = 0;
	public static String [] username = new String[25];
	public static String[] password = new String[25];
	public static String passCheck = "", userName;
	public static boolean repeated = false, loggedIn = false, exist = false;
	
	

	
	public static void main(String[] args) {
			
		
		System.out.println("(4) To See all the accounts\n(3) To create an account (you can create as many accounts as you want)");
		System.out.println("(1) To Log In\n(2) To Log Out\n(5) To Exit");
		System.out.println("It seems there are no accounts. You will have to create one.");
		
		while(option != 3) { 
			
			option = scan.nextInt();
			
			if(option == 1)
				System.out.println("There are no accounts to Log In");
			
			else if(option == 2)
				System.out.println("You are not Logged In");
			
			else if(option == 4)
				System.out.println("There are no accounts");
			
			else if(option == 5)
				break;
			
			else if(option != 3) 
				System.out.println("That is not a valid command");	
			
		}
		
		while(option != 5) {
			
			if(option == 3)
			    createAccount();
		       
			else if(option == 4) 
				showAccounts();
				
			else if(option == 2) 
				logOut();
				
			else if(option == 1) 
				logIn();
				
		
			
			do {
				option = scan.nextInt();
				if(!(option == 1 || option == 2 || option == 3 || option == 4 || option == 5))
				  System.out.println("That is not a valid command");	
				
			}while(!(option == 1 || option == 2 || option == 3 || option == 4 || option == 5));
			
		}	
	}
	
	
	
	
///////////////////////////////////////////////////////METHODS//////////////////////////////////////////////////////////////
	
	
	
	
	
	public static void createAccount() {
		
		scan.nextLine();
	       
		   System.out.println("Sign Up");
	       
		   do {
	       
	       System.out.print("Username:");
	       username[totalAccounts] = scan.nextLine();
	       repeated = false;
	       
	       for(i = 0; i < totalAccounts; i++) {
	    	   
	    	   if(username[totalAccounts].equals(username[i])){
	    		   repeated = true;
	    		   System.out.println("That Username has already been taken\n");
	    	   }
	    	   
	       }
		   }while(repeated);
	       
	       do {
	       
	       System.out.print("Password:");
	       password[totalAccounts] = scan.nextLine();
	       
	       System.out.print("Confirm Password:");
	       passCheck = scan.nextLine();
	       
	       }while(!password[totalAccounts].equals(passCheck));
	       
	       passCheck = "";
	       
	       System.out.println("Congratulations! Your account has been created, You can LogIn now");
	       totalAccounts++;	
		
	}
	
	public static void showAccounts(){
		
		for(i = 0; i < totalAccounts; i++) {
			
			System.out.println("Username " + (i + 1) + ": " + username[i]);
			
		}	
		
	}
	
	public static void logOut(){
		
		if(loggedIn) {
			
			System.out.println("You have Logged Out");
			loggedIn = false;
			
		}else {
			
			System.out.println("You are not Logged In");
			
		}
		
	}
	
	public static void logIn() {
		
		scan.nextLine();
		
		if(!loggedIn) {
			
			passCheck = "";
			
			do {
			
			System.out.print("Username:");
			userName = scan.nextLine();
			exist = false;
			
			for(i = 0; i <= totalAccounts; i++) {
				
				if(userName.equals(username[i])) {
					exist = true;	
					userNameNum = i;
				}		
			}
			
			if(!exist) 
				System.out.println("Invalid Username");
			
			}while(!exist);
			
			while(!passCheck.equals(password[userNameNum])) {
				
				System.out.print("Password:");
				passCheck = scan.nextLine();
				
				if(!passCheck.equals(password[userNameNum]))
					System.out.println("The Password is incorrect");
				
			}
			
			System.out.println("You Logged In, Greeting Mr. " + username[userNameNum] + ".\n");
			loggedIn = true;	
						
		}else {
			System.out.println("You are already Logged In");
		}	
		
	}
}
