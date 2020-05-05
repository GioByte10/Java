import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AccessTextFile {
	
	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<String> countries = new ArrayList<String>();
		int option = 0;
			
		File file = new File("test.txt");
		FileWriter myWriter = new FileWriter("test.txt");
		if (file.createNewFile()) 
			System.out.println("File created: " + file.getName());
			
		else 
			System.out.println("File already exists.");
		
		System.out.print("\n");
     
		printFile(file, countries);
		
		System.out.println("Press -1 to write; -2 to delete; -3 to end");
		
		while(option != - 3) {
			option = scan.nextInt();
		
			if(option == -1) {
				System.out.println("Enter a country to add");
			}
			
		}
	    
	    
	}
	
	static void printFile(File file, ArrayList<String> countries) throws FileNotFoundException{
		
		Scanner myReader = new Scanner(file);
	    int i = 0;
		
		while (myReader.hasNextLine()) {
			
			String country = myReader.nextLine();
	        countries.add(country);
	        System.out.println((i + 1) +  ".- " + countries.get(i));
	        i++;
	   
	      }
		
		myReader.close();
	}
}