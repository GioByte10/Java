import java.util.ArrayList;
import java.util.Iterator;

public class Inventory {
	
	private int number;
	private ArrayList <Widget> widgets = new ArrayList <Widget>();
	
	
	public Inventory(int number) {
		
		this.number = number;
		
		for(int i = 0; i < number; i++) {
			widgets.add(new Widget(i));
		}
		
	}
	
	public ArrayList <Widget> extractWidgets(Widget w, String comparison){	
	    Iterator<Widget> numOfW = widgets.iterator();
		
		ArrayList <Widget> extracted = new ArrayList <Widget>();
		int sym = 0;
		
		if(comparison.equals(">"))
			sym = 1;
		else if(comparison.equals("<"))
			sym = -1;
		else if(comparison.equals("="))
			sym = 0;
		
		while(numOfW.hasNext()) {
			Widget other = numOfW.next();
			if(sym == w.compareTo(other)) {
				
				extracted.add(other);
				System.out.println(comparison + "  " + other.toString());
				numOfW.remove();
			}
			
		}
		
		return extracted;
		
	}

}
