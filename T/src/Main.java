import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		final File f = new File(Main.class.getProtectionDomain().getCodeSource().getLocation().getPath());	
		
		Scanner myReader = new Scanner(f);
		
		
		
		myReader.close();
	}
}
