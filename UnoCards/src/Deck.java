import java.util.ArrayList;

public class Deck {
	
	private ArrayList<Card> cards = new ArrayList<Card>();
	private String[] descriptions = {"Skip", "Reverse", "Draw Two", "Wild"};
	private String[] colors = {"Red", "Yellow", "Green", "Blue"};
	
	public Deck() {
		
		for(int i = 0; i < 4; i++) {
			
			for(int j = 0; j < 14; j++) {
				
				if(j < 10)
					cards.add(new Card(colors[i], Integer.toString(j)));
				
				else if(j == 13)
					cards.add(new Card("Any Color", descriptions[j - 10]));
				
				else
					cards.add(new Card(colors[i], descriptions[j - 10]));
				
			}
		}
		
		descriptions[3] = "Draw Four";
		
		for(int i = 0; i < 4; i++) {
			
			for(int j = 1; j < 14; j++) {
				
				if(j < 10)
					cards.add(new Card(colors[i], Integer.toString(j)));
				
				else if(j == 13)
					cards.add(new Card("Any Color", descriptions[j - 10]));
				
				else
					cards.add(new Card(colors[i], descriptions[j - 10]));
				
			}
		}	
	}
	
	public void shuffle() {
		
		ArrayList<Card> toRemove = new ArrayList<Card>();
		ArrayList<Card> shuffled = new ArrayList<Card>();
		toRemove = cards;
		int len = cards.size();
				
		for(int i = 0; i < len; i++) {
		
			int rand = (int) (Math.random() * cards.size());
			shuffled.add(toRemove.get(rand));
			toRemove.remove(rand);
			
		}
		
		cards = shuffled;		
	}
	
	public void displayCards() {
		
		for(int i = 0; i < cards.size(); i++) {
			
			System.out.println((i + 1) + ".- " + cards.get(i).toString());
			
		}
	}
}
