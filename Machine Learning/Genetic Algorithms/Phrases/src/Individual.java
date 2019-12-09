
public class Individual {
	
	public String str;
	public int fitness;
	
	public Individual (String str, int fitness) {
		
		this.str = str;
		this.fitness = fitness;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public int getFitness() {
		return fitness;
	}

	public void setFitness(int fitness) {
		this.fitness = fitness;
	}

	@Override
	public String toString() {
		return "Individual [str=" + str + ", fitness=" + fitness + "]";
	}
	
	

}
