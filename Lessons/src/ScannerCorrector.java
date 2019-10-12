
public class ScannerCorrector {
	
	public static String [] list = {};
	
	public static void main(String[] args) {
		
		String corrected = "";
		
		for(int i = 0; i < list.length; i++) {
			
			for(int j = 0; j < list[i].length(); j++) {
				
				if(list[i].charAt(j) != ' ') 
					corrected += list[i].charAt(j);
					
					
				
				
			}
			
			list[i] = corrected;
			corrected = "";
			
		}
		
	}

}
