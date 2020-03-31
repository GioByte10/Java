
public class Widget implements Comparable{
	
	private int ID;
	private int price;
	
	public Widget(int id) {
		
		ID = id;
		price = (int) (Math.random() * 100) + 1;
		
	}

	public int compareTo(Object o) {
		
		Widget other = (Widget) o;
		
		if(getPrice() > other.getPrice()) {
			return 1;
		}
		
		if(getPrice() < other.getPrice()) {
			return -1;
		}
		
		if(getPrice() == other.getPrice()) {
			return 0;
		}
		
		return 2;
		
		
		
	}
	
	public int getPrice() {
		return price;
	}
	
	public String toString() {
		return "ID = " + ID + '\t' + "Price = " + price + '\n';
	}
 
}
