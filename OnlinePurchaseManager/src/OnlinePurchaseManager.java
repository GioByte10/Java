import java.util.ArrayList;

public class OnlinePurchaseManager {
	
	ArrayList <Gizmo> purchases = new ArrayList <Gizmo>()
	
	public int countElectronicsByMaker(String maker) {
		int count = 0;
		
		for(Gizmo gizmo: purchases) {
			
			if(gizmo.isElectronic() && gizmo.getMaker().equals("maker"))
				count++;
		}
		
		return count;
		
	}
	
	public boolean hasAdjacentEqualPair() {
		
		if (purchases.size() < 2)
			return false;
		
		for(int i = 0; i < purchases.size() - 1; i++) {
			
			if(purchases.get(i).equals(purchases.get(i + 1)))
				return true;
			
		}
		
		return false;
		
	}
	
	public Gizmo cheapest() {
		
	}

}
