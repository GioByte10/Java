import java.util.Scanner;

public class ArrayMerger {
	
	public static void main (String []args) {
		
		Scanner scan = new Scanner(System.in);
		int length = 0, i = 0, j = 0, l = 0;
		boolean repeated = false;
		
		while(length < 10) {
			
			System.out.println("Enter an array length (must be 10 or greater):");
		    length = scan.nextInt();
		
		}
		
		int[] firstArray = new int[length];
		System.out.print("First Array:");
		
		for(i = 0; i < length; i++) {
		 
			firstArray[i] = (int) (Math.random() * 100)	+ 1;
			System.out.print(" " + firstArray[i]);
			
		}
		
		System.out.println();
		
        int[] secondArray = new int[length];
        System.out.print("Second Array:");
        
		for(i = 0; i < length; i++) {
		 
			secondArray[i] = (int) (Math.random() * 100)	+ 1;
			System.out.print(" " + secondArray[i]);
			
		}
		System.out.println();
		
		int[] mixedArray = new int [2 * length];
		
		for(i = 0; i < 2 * length; i++) {
			
			mixedArray[i] = 0;
		
		}
		
		for(i = 0; i < length; i++) {
			
			repeated = false;
			
			for(j = 0; j < 2 * length; j++) {
				
				if(firstArray[i] == mixedArray[j]) {
					
					repeated = true;
				}
				
				
			}
			
			if(!repeated) {
				mixedArray[l] = firstArray[i];
				l++;
			}
			
			repeated = false;
			
			
            for(j = 0; j < 2 * length; j++) {
				
				if(secondArray[i] == mixedArray[j]) {
					
					repeated = true;
				}
				
				
				
			}
			
			if(!repeated) {
				mixedArray[l] = secondArray[i];
				l++;
				
			}			
			
		}
		
		System.out.print("Merged Array: ");
		
		for(i = 0; mixedArray[i] != 0; i++) {
			
			System.out.print(mixedArray[i] + " ");
			
		}
		
		
	}

}
