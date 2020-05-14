public class FrogSimulation
{
/** Distance, in inches, from the starting position to the goal. */
private int goalDistance;
/** Maximum number of hops allowed to reach the goal. */
private int maxHops;
/** Constructs a FrogSimulation where dist is the distance, in inches, from the starting
* position to the goal, and numHops is the maximum number of hops allowed to reach the goal.
* Precondition: dist > 0; numHops > 0
*/
public FrogSimulation(int dist, int numHops)
{
goalDistance = dist;
maxHops = numHops;
}
/** Returns an integer representing the distance, in inches, to be moved when the frog hops.
*/
private int hopDistance()
{ /* implementation not shown */ }
/** Simulates a frog attempting to reach the goal as described in part (a).
* Returns true if the frog successfully reached or passed the goal during the simulation;
* false otherwise.
*/
public boolean simulate(){
	
	int position = 0;
	
	for(int i = 0; i < maxHops; i++) {
		
		position += hopDistance();
		
		if(position < 0)
			return false;
		
	}
	
	if(position >= goalDistance)
		return true;
	
	return false;
	
}

public double runSimulations(int num){
	
	int countTrue = 0;
	double proportion;
	
	for(int i = 0; i < num; i++) {
		
		if(simulate())
			countTrue++;
		
	}
	
	proportion = (double) (countTrue * 1.0 / num);
	
}
}