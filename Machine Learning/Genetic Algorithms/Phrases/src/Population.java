
class Population {
	
	int populationSize, i, j, generations;
	double mutationRate;
	String target;
	String matingPool[], populationArray[];
	int fitness[];
	
	public Population(int num, double percentage, String phrase) {
		
		populationSize = num;
		mutationRate = percentage;
		target = phrase;
		
	}
	
	void generateMatingPool() {
		
		int k = 0, mating = 0;
		
	
       for(i = 0; i < fitness.length; i++) {
			
			mating += fitness[i];
			
		  }
       
       
          matingPool = new String[mating];
		
       
       for (i = 0; i < fitness.length; i++)
       
          for(j = 0; j < fitness[i]; j++) {
    	   
    	      matingPool[k] = populationArray[i];
    	      k++;
    	      
          }
	}
	
	void nextGeneration() {
		
		
		
		for(int i = 0; i < populationSize; i++) {
		
		int a = (int)(Math.random() * matingPool.length);
		int b = (int)(Math.random() * matingPool.length);
		String parentA = matingPool[a];
		String parentB = matingPool[b];
		String child = crossOver(parentA, parentB);
		child = mutate(child);
		populationArray[i] = child;
		
		
		
		}
		
	}
	
	String crossOver(String parentA, String parentB) {
		
		String child = "";
		
		int point = (int)(Math.random() * parentA.length());
		
		for(i = 0; i < parentA.length(); i++) {
			
			if(i <= point)
				child += parentA.charAt(i);
			else
				child += parentB.charAt(i);
			
			
		}
		
		return child;
		
	}
	
	String mutate(String child) {
		
			String word = "";
		
		for(i = 0; i < child.length(); i++) {
			
			if(Math.random() <= mutationRate)
				word += DNA.newChar();
			else
				word+= child.charAt(i);
				
			
		}
		
		return word;
		
	}
	
	boolean checkPhrase() {
		
		boolean gotIt = false;
		
		for(i = 0; i < populationSize; i++) {
			
			if(populationArray[i].equals(target)) {
				
				gotIt = true;
				System.out.println("Here it is: " + populationArray[i] + "  " + i);
				break;
				
			}
			
		}
		
		return gotIt;
		
	}
	
	

}
