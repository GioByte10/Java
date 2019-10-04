import java.util.Scanner;

public class BackwardString {
	
	 public static String [] list = {};
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//String[] list= {"every", "nearing", "checking", "food", "stand", "value"};
		
		String[] back = new String [list.length];
		
		for(int y = 0; y < back.length; y++) {
			
			back[y] = "";
			
		}
		
		int k = 0;
		
		
		for(int i = 0; i < list.length; i++) {
			
			for(k = list[i].length() - 1; k >= 0; k--) {
				
				back[i] += list[i].charAt(k);
				
				
				
			}
			
			System.out.println(back[i]);
			
		}

	}
}
