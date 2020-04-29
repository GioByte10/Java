import java.util.Scanner;

public class LettersToANumber {
	
	static int thou;
	static int hun;
	static int ten;
	static int u;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int number;
		
		System.out.println("Enter a number from 1 to 1000 to get the number of letters from 1 to that number (inclusive)");
		number = scan.nextInt();
		
		if(number > 1000) {
			System.out.println("Number set to highest, 1000");
			number = 1000;
		}
		
		System.out.println("The total of letters is: " + getNumberOfLetters(number));
		scan.close();
		
	}
	
	public static void getPositions(int currentNumber) {
		
		u = currentNumber % 10;
		currentNumber /= 10;
		
		ten = currentNumber % 10;
		currentNumber /= 10;
		
		hun = currentNumber % 10;
		currentNumber /= 10;
		
		thou = currentNumber % 10;
		currentNumber /= 10;	
		
	}
	
	public static int getNumberOfLetters(int number) {
																// I initialize these as Strings instead of ints to be able to print
																// what I am adding
		int totalOfLetters = 0;
		String allNumbers = "";
		
		String[] units = new String[10];   
		units[0] = "";
		units[1] = "one";
		units[2] = "two";
		units[3] = "three";
		units[4] = "four";
		units[5] = "five";
		units[6] = "six";
		units[7] = "seven";
		units[8] = "eight";
		units[9] = "nine";
		
		String[] teens = new String[10];   
		teens[0] = "";
		teens[1] = "eleven";
		teens[2] = "twelve";
		teens[3] = "thirteen";
		teens[4] = "fourteen";
		teens[5] = "fifteen";
		teens[6] = "sixteen";
		teens[7] = "seventeen";
		teens[8] = "eighteen";
		teens[9] = "nineteen";
		
		String[] tens = new String[10];   
		tens[0] = "";
		tens[1] = "ten";
		tens[2] = "twenty";
		tens[3] = "thirty";
		tens[4] = "fourty";
		tens[5] = "fifty";
		tens[6] = "sixty";
		tens[7] = "seventy";
		tens[8] = "eighty";
		tens[9] = "ninety";
		
		String[] hundreds = new String[10];
		hundreds[0] = "";
		
		for(int i = 1; i < 10; i++) {
			hundreds[i] = units[i] + "hundred";
		}
		
		String[] thousand = new String[2];
		thousand[0] = "";
		thousand[1] = "onethousand";
		
		for(int i = 1; i <= number; i++) {
			
			getPositions(i);
			allNumbers += thousand[thou] + hundreds[hun];
			
			if(ten > 0 || u > 0) {
				
				if(hun > 0)
					allNumbers += "and";
				
				if(ten == 1 && u > 0) 
					allNumbers += teens[u];
				
				else if(ten == 1)
					allNumbers += tens[ten];
				
				else
					allNumbers += tens[ten] + units[u];
				
			}
			
			totalOfLetters += allNumbers.length();
			
			System.out.println(i + " " + allNumbers + "     Length = " + allNumbers.length());
			allNumbers = "";
			
		}
		
		System.out.print("\n");
		return totalOfLetters;	
	}

}
