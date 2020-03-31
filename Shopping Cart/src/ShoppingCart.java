import java.util.Scanner;

public class ShoppingCart {
	
	public static void main (String[] args) {
		
		double subtotal = 0, total = 0;
		int totalElements = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many different items do you wish to buy?");
		Items list1 = new Items(scan.nextInt());
		
		scan.nextLine();
		
		for(int i = 0; i < list1.getNumberOfItems(); i++) {
			
			System.out.println("What is the name of item #" + (i + 1) + "?");
			list1.setName(scan.nextLine(), i);
			
			System.out.println("What is the price of item #" + (i + 1) + "?");
			list1.setPrices(scan.nextDouble(), i);
			
			System.out.println("How many " + list1.getName(i) + " do you want to buy?");
			list1.setQuantity(scan.nextInt(), i);
			scan.nextLine();
			
		}
		
		System.out.println("###############################################\r\n" + 
				"		Shopping Cart Information\r\n" + 
				"###############################################");
		
		for(int i = 0; i < list1.getNumberOfItems(); i ++) {
		
		   System.out.println(list1.getQuantity(i) + " --" + list1.getName(i) + "............... $"
		   + list1.getPrices(i) + " = $" + list1.getPrices(i) * list1.getQuantity(i));
		
		   subtotal += Math.round((list1.getPrices(i) * list1.getQuantity(i)) * 100.0) /100.0;
		
		   totalElements += list1.getQuantity(i);
		   
		}
		
		total = Math.round((subtotal + subtotal * 0.0975) *100.0) / 100.0;
		
		System.out.println("###############################################");
		System.out.println("Subtotal: $" + subtotal);
		System.out.println("Sales Tax @ 9.75%: $" + Math.round((subtotal * 0.0975) * 100.0) / 100.0);
		System.out.println("Total Cost: $" + total);
		System.out.println("Average Cost for All Items: $" + Math.round((subtotal / totalElements) * 100.0) / 100.0);
		System.out.println("Thanks for Shopping with Us!  Please come again!");
		
		
		
		/*3  -- Elmer's Glue............... $1.50 = $4.50
		10 -- #2 Pencils................. $0.15 = $1.50
		4  -- Floppy Disks............... $1.25 = $5.00
		###############################################
		Subtotal: $11.00
		Sales Tax @ 9.75%: $1.07
		Total Cost: $12.07
		Average Cost for All Items: $0.65

		Thanks for Shopping with Us!  Please come again!*/
		
		
		
		scan.close();
		
	}

}
