
public class InsertInToArray {
	
	
	public static void insertValue(int array[], int number, int index){
		
		for(int i = array.length; i > index; i--){
			
			array[i] = array[i - 1];
			
		}
		
		array[index] = number;
		
	}
	
	
	public static void main(String []args) {
		
		
		
	}

}
