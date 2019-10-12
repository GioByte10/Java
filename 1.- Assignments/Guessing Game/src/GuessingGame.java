import java.util.Scanner;
import java.math;

public class GuessingGame {

	public static void main(String[] args) {
		
		String rangeOrNot = "", keepPlaying = ""; 
		int MaxValue = 0, NumToGuess = 0, count = 0, LastNumber = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the Guessing Game!");
		System.out.println("To win, you have to either guess the number from 1 to whatever or a range you can select");	
		
		do {
			
			keepPlaying = ""; 
			
			while(!(rangeOrNot.toLowerCase().contentEquals("yes") || rangeOrNot.toLowerCase().contentEquals("no"))) {
				
			System.out.println("Do you want to chose a range? (Yes/No)");
			rangeOrNot = scan.nextLine();
			
			System.out.println(rangeOrNot.toLowerCase());
			
			if(rangeOrNot.toLowerCase().equals("yes")) {
				
				System.out.println("Enter the Max Value of the range (No more than 2147483647)");	
				MaxValue = scan.nextInt();
				NumToGuess = (int) (Math.random() * MaxValue + 1);		
				
			}else if (rangeOrNot.toLowerCase().equals("no")) {
				
				NumToGuess = (int) (Math.random() * 2147483647 + 1);		
				
			}
			}
			
			System.out.println(NumToGuess);
			System.out.println("Guess the Number!  (-1 to exit)");
			
			while(LastNumber != NumToGuess) {
				
				LastNumber = scan.nextInt();
				
				if(LastNumber == -1)
					break;
				
			   if(LastNumber > NumToGuess) 
				   System.out.println("Enter a smaller number");
			   
			   else if(LastNumber < NumToGuess) 
				   System.out.println("Enter a bigger number");
			   
			   count++;
			   
			}
			
			if(LastNumber != -1) {
			scan.nextLine();
			rangeOrNot = "";
			LastNumber = 0;
			
			System.out.println("Congratulations! You Guessed the number!, It only took you " + count + " attemps");
			System.out.println("Do you want to keep playing? (yes/no)");
			
			count = 0;			
			keepPlaying = scan.nextLine();	
			}
						
		}while(keepPlaying.toLowerCase().contentEquals("yes"));
				
		scan.close();		
	}
}
