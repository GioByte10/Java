import java.util.Scanner;

public class PasswordChecker {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int option = 0, TotalAccounts = 0, i = 0, UserNameNum = 0;
		String[] Username = new String[25];
		String[] password = new String[25];
		String PassCheck = "", UserName;
		boolean repeated = false, loggedIn = false, exist = false;
		
		System.out.println("(-4) To See all the accounts\n(-3) To create an account (you can create as many accounts as you want)");
		System.out.println("(-1) To Log In\n(-2) To Log Out\n(-5) To Exit");
		System.out.println("It seems there are no accounts. You will have to create one.");
		
		while(option != -3) {
			
			option = scan.nextInt();
			
			if(option == -1)
				System.out.println("There are no accounts to Log In");
			
			else if(option == -2)
				System.out.println("You are not Logged In");
			
			else if(option == -4)
				System.out.println("There are no accounts");
			
			else if(option == -5)
				break;
			
			else if(option != -3) 
				System.out.println("That is not a valid command");	
			
		}
		
		while(option != -5) {
			
			if(option == -3) {
				
				scan.nextLine();
				       
			   System.out.println("Sign Up");
		       
			   do {
		       
		       System.out.print("Username:");
		       Username[TotalAccounts] = scan.nextLine();
		       repeated = false;
		       
		       for(i = 0; i < TotalAccounts; i++) {
		    	   
		    	   if(Username[TotalAccounts].equals(Username[i])){
		    		   repeated = true;
		    		   System.out.println("That Username has already been taken\n");
		    	   }
		    	   
		       }
			   }while(repeated);
		       
		       do {
		       
		       System.out.print("Password:");
		       password[TotalAccounts] = scan.nextLine();
		       
		       System.out.print("Confirm Password:");
		       PassCheck = scan.nextLine();
		       
		       }while(!password[TotalAccounts].equals(PassCheck));
		       
		       PassCheck = "";
		       
		       System.out.println("Congratulations! Your account has been created, You can LogIn now");
		       TotalAccounts++;		       
		       
			}else if(option == -4) {
				
				for(i = 0; i < TotalAccounts; i++) {
					
					System.out.println("Username " + (i + 1) + ": " + Username[i]);
					
				}			
				
			}else if(option == -2) {
				if(loggedIn) {
					
					System.out.println("You have Logged Out");
					loggedIn = false;
					
				}else {
					
					System.out.println("You are not Logged In");
					
				}
			}else if(option == -1) {
				
				scan.nextLine();
				
				if(!loggedIn) {
					
					PassCheck = "";
					
					do {
					
					System.out.print("Username:");
					UserName = scan.nextLine();
					exist = false;
					
					for(i = 0; i <= TotalAccounts; i++) {
						
						if(UserName.equals(Username[i])) {
							exist = true;	
							UserNameNum = i;
						}		
					}
					
					if(!exist) 
						System.out.println("Invalid Username");
					
					}while(!exist);
					
					while(!PassCheck.equals(password[UserNameNum])) {
						
						System.out.print("Password:");
						PassCheck = scan.nextLine();
						
						if(!PassCheck.equals(password[UserNameNum]))
							System.out.println("The Password is incorrect");
						
					}
					
					System.out.println("You Logged In, Greeting Mr. " + Username[UserNameNum] + ".\n");
					loggedIn = true;	
								
				}else {
					System.out.println("You are already Logged In");
				}	
			}
			
			option = scan.nextInt();
		}	
	}
}
