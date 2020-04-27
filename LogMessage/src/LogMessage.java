
public class LogMessage {
	
	private String machineId;
	private String description;
	
	public LogMessage(String message) {
		
		int i = 0;
		
		while(message.charAt(i) != ':') {
			i++;
		}
		
		machineId = message.substring(0, i);
		description = message.substring(i + 1);
		
	}
	
	public boolean containsWord(String keyword) {
		
		String word = "";
		
		for(int i = 0; i < description.length(); i++) {
			
			if(i + 1 == description.length() && description.charAt(i) != ' ') {
				word += description.charAt(i);
				if(word.equals(keyword))
					return true;
				
				word = "";
			}
			
			else if(description.charAt(i) != ' ')
				word += description.charAt(i);
			
			else {
				if(word.equals(keyword))
					return true;
				
				word = "";
				
			}
			
				
			
		}
		
		return false;
		
	}
	
	public String getMachineId() {
		return machineId;
	}
	
	public String getDescription() {
		return description;
	}


}
