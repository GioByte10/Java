import java.util.Scanner;

class Average {
  public static void main(String[] args) {
    
	  Scanner scan = new Scanner(System.in);
	  
	  System.out.println("Enter a String");
	  String s = scan.nextLine();
	  
	  
	  int x = s.length();
	  int c = 0, i = 0;
	  
	  while(c < x) {
		  
		  
		  while(i < c) {
			  System.out.print("\t");
			  i++;
		  }
		  
		  System.out.println(s.charAt(c));
		  i = 0;
		  
		  c++;
	  }
	  
	  
	  scan.close();
	  
	//Lesson_11_Activity_Two
	  
  }
}