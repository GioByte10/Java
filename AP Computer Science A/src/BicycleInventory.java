import java.util.ArrayList;

//8081WX23
//G.B.


public class BicycleInventory {
	
	private ArrayList<Bicycle> bicycleList;
	
	
	public Bicycle[] getChoices(int n, String type, boolean assembled) {
		
		Bicycle[] bikes = new Bicycle[n];
		int i = 0;
		
		for(Bicycle bike: bicycleList) {
			
			if(bike.getType().equals(type) && bike.isAssembled() == assembled && i < bikes.length) {
				bikes[i] = bike;
				i++;
			}
			
		}
		
		for(int j = i + 1; j < bikes.length; j++) {
			bikes[j] = null;
		}
		
		return bikes;
		
	}
	
	public Bicycle chooseOne(int n, String type, boolean assembled) {
		
		Bicycle[] toPick = getChoices(n, type, assembled);
		
		int rand = (int) (Math.random() * toPick.length);
		
		return toPick[rand];
		
	}
	
	public Bicycle[] getBicyclesByWheelSize(int size) {
		
		
		
	}
	

}
