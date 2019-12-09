import java.util.ArrayList;

public class PoemLine {
	
	private String englishLine;
	
	public PoemLine(String line) {
		
		englishLine = line;
		
	}
	
	public String getEnglishLine() {
		return englishLine;
	}
	
	public String convertToAllienLine() {
		
		String allienLine = "";
		int start = 0;
		ArrayList <String> words = new ArrayList <String>();
		
		for(int i = 0; i < englishLine.length(); i++) {
			
			if(englishLine.charAt(i) == ' ') {
				
				words.add(englishLine.substring(start, i));
				start = i + 1;
				
			}else if (i == englishLine.length() - 1)
				words.add(englishLine.substring(start, i + 1));
			
		}
		
		for(int i = words.size() - 1; i >= 0; i--) {
			
			allienLine += words.get(i);
			allienLine += ' ';
			
			
		}
		
		allienLine = allienLine.substring(0, allienLine.length() - 1);
		
		return allienLine;
		
	}

}
