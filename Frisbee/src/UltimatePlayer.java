
public class UltimatePlayer extends Person{
	
	private static int jerseyNumber;
	private String position;
	
	public UltimatePlayer(String firstName, String lastName, String position) {
		
		super(firstName, lastName);
		
		if(position.equals("handler") || position.equals("cutter"))
			this.position = position;
		else
			this.position = "handler";
		
		jerseyNumber++;
		
	}
	
	public String getPosition() {
		return position;
	}
	
	public String toString() {
		return super.toString() + "\n   Jersey #: " + jerseyNumber + "\n   Position: " + position;
	}
	
}
