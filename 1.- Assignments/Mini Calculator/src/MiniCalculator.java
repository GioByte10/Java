import java.util.Scanner;
import java.math;

public class MiniCalculator {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double Num1, Num2, Result = 0;
		int Operation = -1;
		
		System.out.println("Calculator\n");
		System.out.println("1. Add\n2. Substract\n3. Multiply\n4. Divide\n5. Power\n0. Exit");
		Operation = scan.nextInt();
		
		while(Operation != 0){
			
            if(Operation == 5 || Operation == 4 || Operation == 3 || Operation == 2 || Operation == 1 || Operation == 0) {
            	
            	System.out.println("What is the first value?");
            	Num1 = scan.nextDouble();
            	
            	System.out.println("What is the second value?");
            	Num2 = scan.nextDouble();
            	
            	System.out.print(Num1);
            	
                if(Operation == 1) {
                	Result = Num1 + Num2;
                System.out.print(" + "); 
                
                }else if(Operation == 2){
                	Result = Num1 - Num2;
                System.out.print(" - ");
                
                }else if(Operation == 3){
                	Result = Num1 * Num2;
                System.out.print(" * ");
                	
                }else if(Operation == 4) {
                	Result = Num1 / Num2;
                System.out.print(" / ");
                
                }else if(Operation == 5) {
                	Result = Math.pow(Num1, Num2);
                System.out.print(" ^ ");
                }
                
            System.out.println(Num2 + " = " + Result + "\n");
          
            			
            }else {
            	System.out.println("That is not a valid option");
            }
		    
            System.out.println("1. Add\n2. Substract\n3. Multiply\n4. Divide\n5. Power\n0. Exit");
            
		    Operation = scan.nextInt();
		
		}
	}
}
