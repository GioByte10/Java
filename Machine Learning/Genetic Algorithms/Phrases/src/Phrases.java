import java.util.Scanner;

public class Phrases {
	
	public static void main(String []args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		double mutationP = 0.01;
		int i = 0;
		boolean first = true;
		
		System.out.println("Machine Learning presents Genetic Algorithms:\n   Phrase by Natural Selection");
		System.out.println("Enter a population:");
		int maxPopulation = scan.nextInt();
		
		System.out.println("Enter a target (phrase):");
		scan.nextLine();
		String phrase = scan.nextLine();
		
		Population population = new Population(maxPopulation, mutationP, phrase);
		population.populationArray = new String[maxPopulation];
		DNA dna1 = new DNA(population);
		population.fitness = new int[maxPopulation];
		
		dna1.generateDNA();
		
		for(int h = 0; h < 5; h++) {
		
		population.fitness = dna1.generateFitness();
		
		for(i = 0; i < population.populationArray.length; i++) {
			
			System.out.println(population.populationArray[i] + " " + population.fitness[i]);
			
			}
			
			System.out.println();
			System.out.println();
		
		population.generateMatingPool(first);
		first = false;
		population.nextGeneration();
		
		
		
		
		for(i = 0; i < population.matingPool.length; i++) {
			
			//System.out.println(population.matingPool[i]);
			
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		}
		
		
		
		scan.close();		
		
		
		
	}
	
	

}
