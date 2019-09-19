import java.util.Scanner;
public class Math {
	
  public static void main(String[] params) {
	  
	  Scanner scan = new Scanner(System.in);
	  
	  int in = scan.nextInt();
	  
	  if(in < 0 || in > 100) {
		  
		  System.out.println("error");
		  
	  }else {
	  
    for  (int i = in; i <= 100; i++) {
    	
    	System.out.print(i + " ");
    	
   
        if ((i + 1 - in) % 20 == 0) {
        	
        	System.out.println("");
        	
        }
      
      
    }
	  }
    
  }
}

