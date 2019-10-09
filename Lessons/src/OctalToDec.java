import java.util.Scanner;

public class OctalToDec {
	
	public static void main(String []args) {
		
		Scanner scan = new Scanner(System.in);
		int check, copy, dec = 0;
		
		System.out.println("Enter a number in base 8:");
		int octal = scan.nextInt();
		copy = octal;
		
		if (!(octal == 1111111111)) {
		
		for(int i = 1; copy > 1; i++) {
			
			copy /= 10;
			//System.out.println(i);
			
		}
		
		for(int j = 1; octal > 1; j++) {
			
			check = (int) (octal % Math.pow(10, j));
			
		    check /= Math.pow(10, j - 1);
			
			if(check > 7) {
				System.out.println("ERROR: Incorrect Octal Format");
				break;
			}
			
			dec +=  check * Math.pow(8, j - 1);
			
			octal -= check * Math.pow(10, j - 1);
			
			
		}
		
			
		System.out.println(dec);
		
		}else
			System.out.println("ERROR: Incorrect Octal Format");
			
		//else
		//	System.out.println("ERROR: Incorrect Octal Format");
		
	}

}
