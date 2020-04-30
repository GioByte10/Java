import java.time.Instant;

public class Timer {
	
	public static void main(String[] args) throws InterruptedException {
		
		int hour = Integer.parseInt(args[0]);
		int minute = Integer.parseInt(args[1]);
		int second = Integer.parseInt(args[2]);
		
		System.out.println(hour + " " + minute + " " + second);
		
		int end = (int) ((hour * 3600) + (minute * 60) + second + (Instant.now().toEpochMilli() / 1000));
		int aux;
		
		String time = "";
		
		while(Instant.now().toEpochMilli() / 1000 < end) {
			
			aux = (int) (end - Instant.now().toEpochMilli() / 1000);
			
			hour = aux / 3600;
			aux %= 3600;
			
			minute = aux / 60;
			aux %= 60;
			
			second = aux;
			
			if(hour < 10)
				time += "0";
			time += hour + ":";
			
			if(minute < 10)
				time += "0";
			time += minute + ":";
			
			if(second < 10)
				time += "0";
			
			time += second + "";
			
			System.out.println(time);
			time = "";
			Thread.sleep(1000);
			
		}
		
		System.out.println("It is time to wake up from this dream");
	}
}
