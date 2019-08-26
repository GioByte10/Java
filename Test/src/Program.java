import java.util.Scanner;

public class Program {
	
	public static void Function(int x) {
		System.out.println("The square of \n" + x + " is " + x*x);
	}
	
	public static void askName() {
		
		Scanner scan = new Scanner(System.in);
		String name, adjective;
		
		System.out.println("Hi there. What is your name?");
		name = scan.nextLine();
		System.out.println("What adjective describes you?");
        adjective = scan.nextLine();
		System.out.print("My name is " + name + ". I am " + adjective);
		
	}
	
	public static void main(String[] args) {
		
		
		Scanner scanw = new Scanner(System.in);		
		System.out.println("Enter a number");
		int num = scanw.nextInt();
		
		Function(num);
		
		askName();

   
	}


}