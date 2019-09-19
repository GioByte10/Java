import java.util.Scanner;

class Average {
  public static void main(String[] args) {
    
	  Scanner scan = new Scanner(System.in);
	  
	  int test[] = new int[5];
	  
	  test[0] = 0;
	  test[1] = 1;
	  test[2] = 2;
	  test[3] = 3;
	  test[4] = 4;
	  
      for (int k = 0; k < test.length; k++) {
		  
		  System.out.print(test[k] + " ");
		  
	  }
	  
	  
	  int ins = scan.nextInt();
	  int ins2 = ins;
	  
	  for (int i = ins + 1; i < test.length; i++) {
		  
		  test[i - 1] = test[i];
		  
	  }
	  
	  
	  
	  for (int j = 0; j < test.length; j++) {
		  
		  System.out.print(test[j] + " ");
		  
	  }
	  
	  
	  scan.close();
	  
	//Lesson_11_Activity_Two
	  
  }
}