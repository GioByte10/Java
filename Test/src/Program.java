import java.util.Scanner;

public class Program{  
	
	private String[] words = {"abcde", "fghij", "klmno", "pqrst", "uvwxy"};

	public static void mystery(int n)
	
	
	
	{
	for (int k = n; k < words.length; k += n)
	{
	
	Serial.println(words[k] = words[k-1].substring(0,n));
	}
		
	}

	
	public static void main(String []args) {
		
		mystery(2);
		
	}
 

}  

  