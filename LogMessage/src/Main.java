
public class Main {
	
	public static void main(String[] args) {
		
		LogMessage log = new LogMessage("SERVER:jdhbd 1this chcsj");
		LogMessage log2 = new LogMessage("SERVER:jdhbd this chcsj");
		LogMessage log3 = new LogMessage("SERVER:jdhbdhis chcsj");
		LogMessage log4 = new LogMessage("SERVER:this chcsj");
		
		SystemLog sys = new SystemLog();
		sys.addMessage(log);
		sys.addMessage(log2);
		sys.addMessage(log3);
		sys.addMessage(log4);
		
		sys.displayMessage();
		
		System.out.println(sys.removeMessages("this"));
		
		sys.displayMessage();
		
	}
}
