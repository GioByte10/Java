
public class Vehicle {
	
	private int loc;
	
	public Vehicle(int location) {
		if(location >= -20 && location <= 20)
		    loc = location;
		else
			loc = 0;
	}
	
	public Vehicle() {
		this(0);
	}
	
	
	public void forward() {
		if(loc != 20)
		loc++;
	}
	
	public void backward() {
		if(loc != -20)
		   loc--;
	}
	
	public int getLocation() {
		return loc;
	}
	
	public String toString() {
		String pos = "";
		
		for(int i = 0; i <= loc +20; i++) {
			pos += ' ';
		}
		
		pos+= '@';
		return pos;
	}

}
