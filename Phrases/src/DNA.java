
 class DNA {
	 
	 int size, targetL;
	 String[] populationArr = new String[size];
	 
	 //Individual[] populationArr = new Individual[size];
	 
	 String target;	 
	 boolean possible = false, first = true;
	
	public DNA (Population population) {
		
	   size = population.populationSize;
	   populationArr = population.populationArray;
	   targetL = population.target.length();
	   target = population.target;		
		
	}
	
	static char newChar() {
		
		char c = (char) ((int)(Math.random() * 73) + 50);
		
		   if(c >= 50 && c <= 59)
			   c -= 2;
		
		   if(c == 61)
			   c = 44;
		   
		   if(c == 60)
			   c = 33;
	       
	       if(c == 62)
	    	   c = 46;
	       
	       if(c == 64)
	    	   c = 32;
	       
	       return c;
		
	}
	
	void generateDNA() {
		
		for(int i = 0; i < size; i++) {
			populationArr[i] = "";
			
			for(int j = 0; j < targetL; j++) {
				
		       
		       populationArr[i] += newChar();
		       
		
			}
		}	
	}
	
	int[] generateFitness() {
		
		int[] fitness = new int[size];
		
		for(int i = 0; i < populationArr.length; i++) {
			for(int j = 0; j < populationArr[i].length(); j++) {
		
               if(populationArr[i].charAt(j) == target.charAt(j)) {
            	   fitness[i]++;
            	   if(first)
            		   possible = true;
               }
               
			}
			
			fitness[i] *= 100;
			fitness[i] /= target.length();
			
		}
		
		if(first)
			first = false;
		
		return fitness;
	}
}
