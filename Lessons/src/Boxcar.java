/*
 * AP CS MOOC
 * Term 2 - Assignment 2, Part 1: Boxcar
 * A class which represents a single car on a freight train.
 */

public class Boxcar
{
    // Variables that will be initialized in the Boxcar constructors.
    private String cargo = "";
    private int numUnits;
    private boolean repair;

    // Default constructor that sets the boxcar to "gizmos", 5, and false.
    public Boxcar()
    {
        cargo = "gizmos";
        numUnits = 5;
        repair = false;
    }


    // This constructor sets the cargo variable to the parameter c, but only if
    // c is "gizmos", "gadgets", "widgets", or "wadgets". The constructor ignores
    // the case of of the value in c. If c holds any value other than
    // "gizmos", "gadgets", "widgets", or "wadgets", the constructor sets cargo
    // to "gizmos". The numUnits variable is set to the parameter u. If u is less than
    // 0 or higher than the maximum capacity of 10 units, numUnits is set to 0. The repair
    // variable is set to the parameter r. If repair is true, numUnits is set to 0
    // no matter what value is stored in the u parameter.
    public Boxcar(String c, int u, boolean r)
    {
    	
       setCargo(c);
       
       if(u > 0 && u <= 10)
    	   numUnits = u;
       else
    	   numUnits = 0;
       
       if(r) {
    	   repair = true;
    	   numUnits = 0;
       }else
    	   repair = false;
    	   
    }

    // The toString method returns a String with the Boxcar in the format:
    // 5 gizmos    in service
    // 10 widgets    in service
    // 0 gadgets    in repair
    //
    // Notice there is one space in between the number of units and the cargo
    // and a tab between the value for cargo and "in repair"/"in service"
    public String toString()
    {
    	
    	String r = "";
    	if(repair)
    		r = "in repair";
    	else
    		r = "in service";
        
        return numUnits + " " + cargo + '\t' + r;
    }

    // This method adds 1 to the number of units in the BoxCar. The maximum
    // capacity of a boxcar is 10 units. If increasing the number of units
    // would go beyond the maximum, keep numUnits at the max capacity.
    // If the repair variable is true, then numUnits may only be set to 0.
    public void loadCargo() {
        if(!repair && numUnits < 10)
        	numUnits++;
    }

    // The getCargo method returns the cargo of the boxcar.
    public String getCargo()
    {
        return cargo;
    }


    public void setCargo(String c)
    {
    	
    	c = c.toLowerCase();
    	
    	if(c.equals("gizmos") || c.equals("gadgets") || c.equals("widgets") || c.equals("wadgets"))
     	   cargo = c;
        else
     	   cargo = "gizmos";
        
    }

   
    public boolean isFull()
    {
        if(numUnits == 10)
            return true;
        else
        	return false;
    }

    
    public void callForRepair()
    {
       repair = true;
       numUnits = 0;
    }
    
    
    public int getNumUnits() {
    	return numUnits;    	
    }

    
}
