
public class Fraction {
	
	private int n;
	private int d;
	
	public Fraction() {
		this(1, 1);		
	}
	
	public Fraction(int n, int d) {
		if(n > 0)
			this.n = n;
		else
			this.n = 1;
		if(d > 0)
			this.d = d;
		else 
			this.d = 1;
	}
	
	public String mixedNumber() {
		if(n%d == 0)
			return n/d +"";
		else if((int) n/d == 0)
			return n + "/" + d;
		else {
		int temp = (int) n/d;
		return temp + " " + n%d + "/" + d; 
		}
	}
	
	public void add(int n, int d) {
		if(n > 0 && d > 0) {
			this.n = (this.n * d) + (n * this.d);
			this.d = this.d * d;
		}
	}
	
	public String toString() {
		return n + "/" + d;
	}
	
}
