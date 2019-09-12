import java.util.Scanner;
import java.lang.Math;
public class Program {
	
	public static void main(String []args) {
		
		Scanner scan = new Scanner(System.in);
		
		double North = 0, South = 0, East = 0, West = 0, lon = 0, lat = 0;
		int count = 1;
		
		while(count != 0) {
			count = scan.nextInt();
		
		System.out.println("Please enter the latitude:");
		lat = scan.nextDouble();
		System.out.println("Please enter the longitude:");
		lon = scan.nextDouble();
		
		if((lat < -90 || lat > 90) || (lon < -180 || lon > 180)) {
			System.out.println("Incorrect Latitude or Longitude");
		}else {
			
			if (lat < 0) {
				if (lat * -1 > South) {
					
					South = lat * -1;
					
				}
			}else {
				
                 if (lat > North) {
					
					North = lat;
					
				}
				
			}
			
			if (lon < 0) {
				if (lon * -1 > West) {
					
					West = lon * -1;
					
				}
			}else {
				
                 if (lon> East) {
					
					East = lon;
					
				}
				
			}
			
			
		}
		
		System.out.println("Would you like to enter another location?");
		
		count = scan.nextInt();
		
		}
		
		System.out.println("Farthest North:" + North);
		System.out.println("Farthest South:" + South);
		System.out.println("Farthest East:" + East);
		System.out.println("Farthest West:" + West);
		
		
		
		
		scan.close();
		//Lesson_11_Activity_Two
		
	}

}