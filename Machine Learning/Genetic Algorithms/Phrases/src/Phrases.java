import java.util.Scanner;

public class Phrases {
	
	public static void main(String []args) throws InterruptedException {
		
		Scanner scan = new Scanner(System.in);
		
		
		double mutationP = 0.01;
		int i = 0;
		
		
		System.out.println("Machine Learning presents Genetic Algorithms:\n   Phrase by Natural Selection     Mutation Rate = " + mutationP * 100 + "%\n");
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
		
		while(true){
		
		population.fitness = dna1.generateFitness();
		if(!dna1.possible) {
			System.out.println("Not enough variation");
			break;
		}
		
		
			
		
		population.generateMatingPool();
		population.nextGeneration();
		if(population.checkPhrase())
			break;
		
        for(i = 0; i < population.populationArray.length; i++) {
			
			System.out.println(population.populationArray[i] + " " + population.fitness[i]);
			
			
			}
		
		}
		
		System.out.println("It took " + population.generations + " Generations");
		
		scan.close();		
		
	}
}
