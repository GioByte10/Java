import java.util.Scanner;

public class DividedRandomness {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] count = new int[5];
		double[] probabilities = new double[5];
		double total = 0;
		String[] elements = new String[5];
		int picked, probLeft = 100;
		
		
		for(int i = 0; i < probabilities.length; i++) {
			
			System.out.println("Please enter a probability in % for element " + (i + 1) + " (probability left: " + probLeft + "%):");
			probabilities[i] = scan.nextDouble();
			total += probabilities[i];
			
			probLeft -= probabilities[i];
			
			elements[i] = "Element " + (i + 1);
			
		}
		
		System.out.print("\n");
		
		for(int i = 0; i < probabilities.length; i++) {
			
			probabilities[i] /= total;
			
		}
		
		for(int i = 0; i < 100; i++) {
		
			picked = getRandom(probabilities);
			System.out.println("The picked is " + elements[picked]);
			
			count[picked] ++;
			
		}
		
		System.out.print("\n");
		System.out.println("Out of 100 cases: ");
		
		for(int i = 0; i < probabilities.length; i++) {
			
			System.out.println("Element " + (i + 1) + " was chosen " + count[i]);
			
		}	
		scan.close();
	}
	
	static int getRandom(double[] probabilities) {
		
		int index = 0;
		double rand = Math.random();
		
		while(rand > 0) {
			rand -= probabilities[index];
			index++;
		}
		
		index--;
		return index;
	}
}
