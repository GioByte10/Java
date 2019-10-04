import java.util.Scanner;

public class Hardest_Spelling {
	
	 public static String [] list = {};
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String longest = "";
		
		for(int i = 0; i < list.length; i++) {
			
			if(list[i].length() > longest.length()) {
				
				longest = list[i];
				
			}
			
		}
		
		System.out.println(longest);
		
	}

}
