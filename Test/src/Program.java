public class Program{
	

	public static int recur(int x)
	{
	  if(x > 10)
	        return 2*recur(x/2);
	 
	  if(x < 10)
	        return recur(x + 2) / 2;

	  return 10;
	}
	
	public static void main (String []args) {
		
		System.out.println(recur(12));
		
		
	}
	
}