import java.util.ArrayList;
import java.util.Arrays;

public class RandomStringChooser {
	
	private ArrayList<String> strings;
	
	public RandomStringChooser(String[] strings) {
		
		this.strings = new ArrayList<String>(Arrays.asList(strings));
		
	}
	
	public String getNext() {
		
		if(strings.size() > 0){
			int random = (int) (Math.random() * strings.size());
			String toReturn = strings.get(random);
			strings.remove(random);
			return toReturn;
		}else {
			
			return "NONE";			
		}
		
	}

}
