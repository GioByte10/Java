import java.util.Scanner;

public class T{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int number, thou, cen, dec, u;
		
		System.out.println("Enter a number to get the number of letters from 1 to that number (inclusive)");
		number = scan.nextInt();
		
		u = number % 10;
		number /= 10;
		
		dec = number % 10;
		number /= 10;
		
		cen = number % 10;
		number /= 10;
		
		thou = number % 10;
		number /= 10;
		
		System.out.println("" + thou + cen + dec + u);
		
	}
	
}