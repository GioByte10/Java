
class Population {
	
	int populationSize, mating, i, j, k, generations;
	double mutationRate;
	String target;
	String matingPool[], populationArray[];
	int fitness[];
	
	public Population(int num, double percentage, String phrase) {
		
		populationSize = num;
		mutationRate = percentage;
		target = phrase;
		
	}
	
	void generateMatingPool(boolean first) {
		
       for(i = 0; i < fitness.length; i++) {
			
			mating += fitness[i];
			
		  }
       
       if (first)
          matingPool = new String[mating];
       
       for (i = 0; i < fitness.length; i++)
       
          for(j = 0; j < fitness[i]; j++) {
    	   
    	      matingPool[k] = populationArray[i];
    	      k++;
    	      
          }
       
       k = 0;
	}
	
	void nextGeneration() {
		
		
		
		for(i = 0; i < populationArray.length; i++) {
		
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
	
	

}
