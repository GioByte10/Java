import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numberOfWidgets = scan.nextInt();
		
		Inventory inventory = new Inventory(numberOfWidgets);
		
		ArrayList <Widget> widgets = new ArrayList <Widget>();
		
		Widget test = new Widget(numberOfWidgets + 1);
		
		System.out.println("Sample Widget = " + test.getPrice());
		
		widgets = inventory.extractWidgets(test, "=");
		widgets = inventory.extractWidgets(test, ">");
		widgets = inventory.extractWidgets(test, "<");
		
	}

}
