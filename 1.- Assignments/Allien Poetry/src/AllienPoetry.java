import java.util.ArrayList;

public class AllienPoetry {
	
	public static void main(String []args) {
		
		ArrayList <PoemLine> stanza = new ArrayList <PoemLine>();
		
		stanza.add(new PoemLine("Roses are red"));
		stanza.add(new PoemLine("Violets are blue"));
		stanza.add(new PoemLine("I love Computer Science"));
		stanza.add(new PoemLine("And so do you"));
		
		PoemStanza poemStanza = new PoemStanza(stanza);
		
		System.out.println(poemStanza.convertToAlienStanza());
		
		
		
	}

}
