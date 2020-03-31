
class Items {
	
	private int numberOfItems;
	private int salesTax;
	private int subtotal;
	private String[] items;
	private int[] quantity;
	private double[] prices;
	
	
	public Items(int numberOfItems) {	
		
		this.numberOfItems = numberOfItems;
		items = new String[numberOfItems];
		prices = new double[numberOfItems];
		quantity = new int[numberOfItems];
		
	}


	public int getNumberOfItems() {
		return numberOfItems;
	}


	public int getSalesTax() {
		return salesTax;
	}


	public void setSalesTax(int salesTax) {
		this.salesTax = salesTax;
	}


	public int getSubtotal() {
		return subtotal;
	}


	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}


	public String getName(int index) {
		return items[index];
	}


	public void setName(String items, int index) {
		this.items[index] = items;
	}


	public int getQuantity(int index) {
		return quantity[index];
	}


	public void setQuantity(int quantity, int index) {
		this.quantity[index] = quantity;
	}


	public double getPrices(int index) {
		return prices[index];
	}


	public void setPrices(double prices, int index) {
		this.prices[index] = prices;
	}
	
	
	
	

}
