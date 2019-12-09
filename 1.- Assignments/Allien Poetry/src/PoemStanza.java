import java.util.ArrayList;
import java.util.List;

public class PoemStanza {
	
	private List<PoemLine> stanzaLines;
	
	
	public PoemStanza(List<PoemLine> line) {
		
		stanzaLines = line;		
		
	}
	
	
	public List<String> convertToAlienStanza(){
		
		List<String> alienStanza = new ArrayList<String>();
		
		for(int i = stanzaLines.size() - 1; i >= 0; i--) {
			
			alienStanza.add(stanzaLines.get(i).convertToAllienLine());
			
		}
		
		
		return alienStanza;
		
	}

}
