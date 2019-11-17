
 class DNA {
	 
	 int size, targetL;
	 String[] populationArr = new String[size];
	 String target;	 	 
	
	public DNA (Population population, String array[]) {
		
	   size = population.populationSize;
	   populationArr = array;
	   targetL = population.target.length();
	   target = population.target;		
		
	}
	
	void generateDNA() {
		
		for(int i = 0; i < size; i++) {
			populationArr[i] = "";
			
			for(int j = 0; j < targetL; j++) {
				char c = (char) ((int)(Math.random() * 60) + 63);
		       
		       if(c == 63)
		    	   c = 46;
		       
		       if(c == 64)
		    	   c = 32;
		       
		       populationArr[i] += c;
		
			}
		}	
	}
	
	int[] generateFitness() {
		
		int[] fitness = new int[size];
		
		for(int i = 0; i < populationArr.length; i++) {
			for(int j = 0; j < populationArr[i].length(); j++) {
		
               if(populationArr[i].charAt(j) == target.charAt(j))
            	   fitness[i]++;
			}
		}
		
		return fitness;
	}
}
