import java.util.Scanner;

class Math{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name;
		int num, error = 0;
		
		System.out.println("Welcome. What is your name?");
		name = scan.nextLine();
		
		System.out.println("Hello " + name + ". Try your best to crack the code!");
		
		System.out.println("PHASE 1");
		System.out.println("Enter a number:");
		num = scan.nextInt();
		
		if(num == 3) {
			
			System.out.println("Correct!");
			
			System.out.println("PHASE 2");
			System.out.println("Enter a number:");
			num = scan.nextInt();
			
			if(num == 1 || (num >= 33 && num <= 100)) {
				
				System.out.println("Correct!");
			
				System.out.println("PHASE 3");
				System.out.println("Enter a number:");
				num = scan.nextInt();
				
				if(num % 3 == 0 || num % 7 == 0) {
					
					System.out.println("Correct! ");
					System.out.println("You have cracked the code! ");
					
				}else {
					System.out.println("Sorry, that was incorrect!\nBetter luck next time!");
				}
				
			}else {
				System.out.println("Sorry, that was incorrect!\nBetter luck next time!");
			}
				
		}else {
			
			System.out.println("Sorry, that was incorrect!\nBetter luck next time!");
			
		}
		
		scan.close();
		
	}
}
