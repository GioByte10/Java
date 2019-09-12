import java.util.Scanner;
public class Unix_Epoch {
	
	public static void main(String []args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Seconds Since Unix Epoch:");
		int Tseconds = scan.nextInt();
		
		int year = 1970, month, day, hour, min, sec;
		
		year += Tseconds / 31104000;
		Tseconds %= 31104000;
		month = Tseconds / 2592000;
		Tseconds %= 2592000;
		day = Tseconds / 86400;
		Tseconds %= 86400;
		hour = Tseconds / 3600;
		Tseconds %= 3600;
		min = Tseconds / 60;
		Tseconds %= 60;
		sec = Tseconds;
		
		System.out.print("Year: " + year + "\nMonth: " + month + "\nDay: " + day + "\nHour: " + hour
				+ "\nMin: " +  min + "\nSec: " + sec);
		
		
		
			/*999999999

			Year: 2002
			Month: 1
			Day: 24
			Hour: 1
			Min: 46
			Sec: 39*/
		
		scan.close();
		
	}

}
