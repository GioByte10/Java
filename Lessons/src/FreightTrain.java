
import java.util.ArrayList;

public class FreightTrain
{
    private ArrayList<Boxcar> train = new ArrayList<Boxcar>();

    // Default constructor that sets train to an ArrayList holding one
    // boxcar containing 5 gizmos, that is not in repair.
    public FreightTrain()
    {
       train.add(new Boxcar("gizmos", 5, false));
    }

    // A constructor that sets train to an ArrayList of size n, holding
    // n boxcars, that are all hold 5 gizmos and are not in repair. If n <= 0,
    // then the train should be set to size one, with a single boxcar containing
    // 5 gizmos and not in repair.
    public FreightTrain(int n)
    {
    	if(n > 0) {
           for(int i = 0; i < n; i++) {
        	train.add(new Boxcar("gizmos", 5, false));
           }
        	
    	}else
     	   train.add(new Boxcar("gizmos", 5, false));
    }

    // This method returns a String representation of the
    // Boxcar objects in the ArrayList, one per line. For example,
    // here is the String returned when toString is called on a
    // FreightTrain with 5 boxcars:
    //
    // 3 gadgets    in service
    // 2 wadgets    in service
    // 0 gizmos    in repair
    // 7 gadgets    in service
    // 0 gadgets    in repair
    //
    // Note: there is one space between the number of units and
    // the cargo type, and a tab between the cargo type and
    // "in repair"/"in service".
    public String toString()
    {
    	String all = "";
        for(int i = 0; i < train.size(); i++) {
        	all +=  train.get(i);
        	all+= '\n';
        }
        return all;
    }

    // This method sets the cargo type of all the boxcars in the entire train.
    public void setCargo(String c)
    {
        for(int i = 0; i < train.size(); i++) {
        	train.get(i).setCargo(c);
        }
    }

    // This method sets the boxcars to the pattern "gizmos", "gadgets", "widgets",
    // "wadgets", "gizmos", "gadgets", "widgets", "wadgets", ...
    // until the end of the train.
    public void setMultiCargo()
    {
    	int i = 0;
    	
    	
    	while(true) {
    		if(i < train.size()) {
    			train.get(i).setCargo("gizmos");
    			i++;
    		}else
    			break;
    		
    		if(i < train.size()) {
    			train.get(i).setCargo("gadgets");
    			i++;
    		}
    		else 
    			break;
    		
    		if(i < train.size()) {
    			train.get(i).setCargo("widgets");
    			i++;
    		}
    		else
    			break;
    		
    			if(i < train.size()) {
    			train.get(i).setCargo("wadgets");
    			i++;
    		}else
    			break;
    			
    	}
        
    }

    // This method fills every boxcar in the train to max capacity of 10.
    // Each individual boxcar can only hold cargo if its
    // repair variable is false.
    public void fillTrain()
    {
        for(int i = 0; i < train.size(); i++) {
        	for(int j = 0; j < 10; j++)
        	train.get(i).loadCargo();
        }
    }

    // This method sets the Boxcar at location i’s repair variable to true.
    public void callForRepair(int i)
    {
        train.get(i).callForRepair();
    }
}
