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
		int option = 0, index = 0;
		String country = "";
			
		File file = new File("test.txt");
		FileWriter myWriter = new FileWriter("test.txt");
     
		printFile(file, countries);
		
		System.out.println("Press -1 to write; -2 to delete; -3 to end");
		
		while(option != - 3){
			option = scan.nextInt();
		
			if(option == -1){
				
				System.out.println("Enter a country to add: ");
				scan.nextLine();
				country = scan.nextLine();
				countries.add(country);
				System.out.println("" + countries.size());
				writeFile(myWriter, file, countries);
				printFile(file, countries);
			}
			
			if(option == -2) {
				
				System.out.println("Enter an index to remove");
				index = scan.nextInt();
				if(index < countries.size()) {
					countries.remove(index);
					
				}
				else
					System.out.println("404 Error, Country not found");
				printFile(file, countries);
			}
		}
	    myWriter.close();
	    scan.close();
	}
	
	static void printFile(File file, ArrayList<String> countries) throws FileNotFoundException{
		
		Scanner myReader = new Scanner(file);
	    int i = 0;
	    System.out.println("k");
		
		while(myReader.hasNextLine()){
			
			String country = myReader.nextLine();
			System.out.println(country);
			if(countries.size() == 0)
				countries.add(country);
	        System.out.println((i + 1) +  ".- " + countries.get(i));
	        i++;
	   
	      }
		myReader.close();
	}
	
	static void writeFile(FileWriter wFile, File file, ArrayList<String> countries) throws IOException {
		
		//file.createNewFile();
		String text = "";
		
		for(int i = 0; i < countries.size(); i++) {
			
			text += countries.get(i);
			
		}
		wFile.write(text);
		
	}
}