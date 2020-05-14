import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		int countTrue = 100;
		int num = 400;
		double proportion;
		
		proportion = (double) (countTrue * 1.0 / num);
		System.out.println(proportion);
	}
}
