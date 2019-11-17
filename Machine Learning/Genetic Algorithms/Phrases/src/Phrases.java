import java.util.Scanner;

public class Phrases {
	
	public static void main(String []args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		double mutationP = 0.01;
		
		System.out.println("Machine Learning presents Genetic Algorithms:\n   Phrase by Natural Selection");
		System.out.println("Enter a population:");
		int maxPopulation = scan.nextInt();
		
		String[] populationArray = new String[maxPopulation];
		int[] fitness = new int[maxPopulation];
		
		System.out.println("Enter a target (phrase):");
		scan.nextLine();
		String phrase = scan.nextLine();
		
		Population population = new Population(maxPopulation, mutationP, phrase);
		DNA dna1 = new DNA(population, populationArray);
		
		dna1.generateDNA();
		fitness = dna1.generateFitness();
		
		for(int i = 0; i < populationArray.length; i++) {
		
		System.out.println(populationArray[i] + " " + fitness[i]);
		
		}
		
		
		
		
		
		
		scan.close();		
		
		
		
	}
	
	

}
