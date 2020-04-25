
public class UnoCards {
	
	public static void main(String[] args) {
		
		Deck deck = new Deck();
				
		System.out.println("Welcome to UNO game\n");
		deck.displayCards();
		deck.shuffle();
		deck.displayCards();
		
	}
}