
public class Card {
	
	private String color;
	private String description;
	
	public Card(String color, String description) {
		
		this.color = color;
		this.description = description;
		
	}
	
	public String toString() {
		
		return color + " " + description + '\n';
		
	}
}
