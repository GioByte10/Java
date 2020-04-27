import java.awt.List;
import java.util.ArrayList;

public class SystemLog {
	
	private ArrayList<LogMessage> messageList;
	
	public SystemLog() {
		
		messageList = new ArrayList<LogMessage>();
		
	}
	
	public ArrayList<LogMessage> removeMessages(String keyword){
		
		ArrayList<LogMessage> removed = new ArrayList<LogMessage>();
		
		for(LogMessage message: messageList) {
			if(message.containsWord(keyword)) 
				removed.add(message);
		}	
		
		for(LogMessage message: removed) {
			messageList.remove(message);
		}
		
		return removed;
	}
	
	public void addMessage(LogMessage message) {
		
		messageList.add(message);
		
	}
	
	public void displayMessage() {
		
		for(LogMessage message: messageList) {
			
			System.out.println(message.getMachineId() + ":" + message.getDescription());
			
		}
		
	}

}
