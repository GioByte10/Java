import java.util.Scanner;

public class Program{  
 
public static void main(String[] args) {  
 
    
 Scanner scan = new Scanner(System.in);
 
 int i, sort = 0;
 double sum = 0, MAX = 0, MIN = 0;
 boolean one = true;
 
 System.out.println("How long do you want the array?");
 int length = scan.nextInt();
 
 if(length > 0) {
 
 double array[] = new double[length];
 
 for(i = 0; i < length; i++) {
  
  System.out.println("Enter a number");
  array[i] = scan.nextDouble();
  sum += array[i];
  if(one) {
	  MAX = array[i];
	  one = false;
  }
  if(array[i] > MAX)
      MAX = array[i];
  
 }
 
 MIN = MAX;
 
 for(i = 0; i < length; i++) {
  
  if(array[i] < MIN)
   MIN = array[i];
  
 }
 
 System.out.print("Your array is {");
 
    for(i = 0; i < length; i++) { 
  
  System.out.print(array[i]);
  
  if(i + 1 < length) {
   
   System.out.print(", ");
   
  }
 }
    
    System.out.println("}");
    
    System.out.println(MAX);
    
    System.out.println("The average is " + sum/length);
    System.out.println("The range is " + (MAX - MIN));
    
    sort = 1;
    
    for(i = 1; i < length; i++) {
     
     if(array[i - 1] > array[i])
      sort = 0; 
    }
    
    if(sort == 1)
     System.out.println("The array is sorted in increasing order");
    
    else {
    
     sort = -1;
     
for(i = 1; i < length; i++) {
     
     if(array[i - 1] <= array[i])
      sort = 0; 
    }

    if(sort == -1)
     System.out.println("The array is sorted in decreasing order");

    else {
     System.out.println("The array is unsorted");
    }
    }
 
 }else {
  
  System.out.println("Not a valid length!");
  
 }
 
 scan.close();
}  
}
  