public class Fraction implements Comparable
{
	private int numerator;
	private int denominator;

	public Fraction(){
		
		numerator = 1;
		denominator = 1;
		
		simplify();
		
	}
  
	public Fraction(int n, int d){
		
		this();
		
		if(n > 0)
			numerator = n;
	
		if(d > 0)
			denominator = d;
		
		simplify();
  }
  
	public String toString(){
		
    return numerator + "/" + denominator;
    
	}
  
	public String mixedNumber(){

		if(numerator < denominator) 
			return toString();
 
		if (numerator % denominator == 0)
			return "" + numerator/denominator;
 
    return numerator/denominator + " " + numerator%denominator + "/" + denominator;
  }
  

	public void add(int n, int d){
	  
		if(n > 0 && d > 0){
			numerator = numerator * d + n * denominator;
			denominator *= d;
		}
		simplify();
	}

	public int compareTo(Object o) {
	
		Fraction fraction = (Fraction) o;
		
		int num, otherNum;
		
		num = numerator * fraction.denominator;
		otherNum = fraction.numerator * denominator;
	
		if(num < otherNum)
			return -1;
	
		else if(num > otherNum)
			return 1;
	
		else
			return 0;
	
	}
	
	public static int gcd(int a, int b) {
		
		int r;
		
		while(b != 0) {
			
			r = a % b;
			a = b;
			b = r;
			
		}
		
		return a;
	}
	
	public void simplify() {
		
		int divisor = gcd(numerator, denominator);
		numerator /= divisor;
		denominator /= divisor;
		
	}

}