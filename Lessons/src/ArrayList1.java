import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList <String> Main = new ArrayList <String>();
		String word = "";
				
		word = scan.nextLine();
		
		
		while(!word.contentEquals("STOP")) {
			
			Main.add(word);
			
		
			
			word = scan.nextLine();
		
			
			
		}
		
		
		System.out.println(Main);
		
		for(String b: Main){
		if(b.contains("a")){
		    
		    System.out.println(b);
			
		}
		
		}
		

}
}