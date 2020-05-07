import java.util.Scanner;

public class NumericSystems {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int option = 0;
		
		System.out.println("Numeric System Converter");
		System.out.println("1.- Decimal to Binary");
		System.out.println("2.- Binary to Decimal");
		System.out.println("-1 to exit");
		
		while(option != -1) {
			
			option = scan.nextInt();
			
			if(option == 1){
				System.out.println("Decimal to Binary: ");
				scan.nextLine();
				System.out.println(toBinary(scan.nextLine()));
				
			}else if(option == 2) {
				System.out.println("Binary to Decimal: ");
				scan.nextLine();
				System.out.println(toDecimal(scan.nextLine()));
				
			}else if(option != -1)
				System.out.println("That is not an option");
			
			
		}
		
	}
	
	static String toBinary(String dec) {
		
		int[] Bits = new int[31];
		Bits[0] = 1;
		int num = Integer.valueOf(dec);
		String bin = "";
		
		for(int i = 1; i < Bits.length; i++){
			
			Bits[i] = Bits[i - 1] * 2;
			
		}
		
		for(int i = 30; i >= 0; i--) {
			
			if(Bits[i] <= num) {
				num -= Bits[i];
			    bin += '1';
			}else
				bin += '0';
			
		}
		bin = bin.substring(bin.indexOf('1'));
		return bin;
	}
	
	static String toDecimal(String bin){
		
		int dec = 0;
		String num = "";
		
		
		for(int i = bin.length() -1; i >= 0; i--) {
			
			if(bin.charAt(i) != '?')
				num += bin.charAt(i);
			if(bin.charAt(i) != '1' && bin.charAt(i) != '0')
				return "The format is invalid";
			
		}
		
		bin = num;
		//System.out.println(bin);
		
		for(int i = 0; i < bin.length(); i++) {
			
			if(bin.charAt(i) == '1')
				dec += Math.pow(2, i);
			
		}
		num = String.valueOf(dec);
		return num;
	}
}
