import java.util.Scanner;

class Math{
	
	public static void main(String[] args) {
		
		double x, y;
				
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers");
		x = scan.nextDouble();
		y = scan.nextDouble();
		scan.close();
		
		System.out.println(x + " + " + y + " = " + (1.0 * (x + y)));
		System.out.println(x + " - " + y + " = " + (1.0 * (x - y)));
		System.out.println(x + " * " + y + " = " + (1.0 * (x * y)));
		System.out.print(x + " / " + y + " = " + (1.0 * (x / y)));
				
		
	}
}
