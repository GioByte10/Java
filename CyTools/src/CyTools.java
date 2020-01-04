
public class CyTools {
	
	
	public static void reverseArray(int x[]) {
		
		int aux;
		
		for(int i = 0; i < x.length / 2; i++) {
			
			aux = x[i];
			x[i] = x[x.length -1 - i];
			x[x.length - 1 - i] = aux;
			
		}
	}
	
	public static void reverseArray(double x[]) {
		
		double aux;
		
		for(int i = 0; i < x.length / 2; i++) {
			
			aux = x[i];
			x[i] = x[x.length -1 - i];
			x[x.length - 1 - i] = aux;
			
		}
	}
	
	public static void reverseArray(char x[]) {
		
		char aux;
		
		for(int i = 0; i < x.length / 2; i++) {
			
			aux = x[i];
			x[i] = x[x.length -1 - i];
			x[x.length - 1 - i] = aux;
			
		}
	}
	
	public static void reverseArray(String x[]) {
		
		String aux;
		
		for(int i = 0; i < x.length / 2; i++) {
			
			aux = x[i];
			x[i] = x[x.length -1 - i];
			x[x.length - 1 - i] = aux;
			
		}
	}
	
	public static void reverseArray(boolean x[]) {
		
		boolean aux;
		
		for(int i = 0; i < x.length / 2; i++) {
			
			aux = x[i];
			x[i] = x[x.length -1 - i];
			x[x.length - 1 - i] = aux;
			
		}
	}
	
//////////////////////////////////////////////////////////////////////////	   
	
	public static void orderMinToMax(int x[]) {
		
		int aux;
		
		for(int i = 0; i < x.length; i++) {
			
			for(int j = 0; j < x.length - 1; j++) {
				
				if(x[j] > x[j + 1]) {
					aux = x[j];
					x[j] = x[j + 1];
					x[j + 1] = aux;
				}
			}
		}
	}
	
	public static void orderMinToMax(double x[]) {
		
		double aux;
		
		for(int i = 0; i < x.length; i++) {
			
			for(int j = 0; j < x.length - 1; j++) {
				
				if(x[j] > x[j + 1]) {
					aux = x[j];
					x[j] = x[j + 1];
					x[j + 1] = aux;
				}
			}
		}
	}
	
    public static void orderMinToMax(char x[]) {
		
		char aux;
		
		for(int i = 0; i < x.length; i++) {
			
			for(int j = 0; j < x.length - 1; j++) {
				
				if(x[j] > x[j + 1]){
					aux = x[j];
					x[j] = x[j + 1];
					x[j + 1] = aux;
				}
			}
		}
	}
    
    public static void orderMinToMax(String x[]) {
    	
        String aux;
		
		for(int i = 0; i < x.length; i++) {
			
			for(int j = 0; j < x.length - 1; j++) {
				
				if(x[j].length() > x[j + 1].length()){
					aux = x[j];
					x[j] = x[j + 1];
					x[j + 1] = aux;
				}
			}
        }
    }
	
////////////////////////////////////////////////////////////////
    
    public static void orderMaxToMin(int x[]) {
    	
        int aux;
		
		for(int i = 0; i < x.length; i++) {
			
			for(int j = 0; j < x.length - 1; j++) {
				
				if(x[j] < x[j + 1]){
					aux = x[j];
					x[j] = x[j + 1];
					x[j + 1] = aux;
				}
			}
        }
    }
    
    public static void orderMaxToMin(double x[]) {
    	
        double aux;
		
		for(int i = 0; i < x.length; i++) {
			
			for(int j = 0; j < x.length - 1; j++) {
				
				if(x[j] < x[j + 1]){
					aux = x[j];
					x[j] = x[j + 1];
					x[j + 1] = aux;
				}
			}
        }
    }
    
    public static void orderMaxToMin(char x[]) {
    	
        char aux;
		
		for(int i = 0; i < x.length; i++) {
			
			for(int j = 0; j < x.length - 1; j++) {
				
				if(x[j] < x[j + 1]){
					aux = x[j];
					x[j] = x[j + 1];
					x[j + 1] = aux;
				}
			}
        }
    }
    
    public static void orderMaxToMin(String x[]) {
    	
        String aux;
		
		for(int i = 0; i < x.length; i++) {
			
			for(int j = 0; j < x.length - 1; j++) {
				
				if(x[j].length() < x[j + 1].length()){
					aux = x[j];
					x[j] = x[j + 1];
					x[j + 1] = aux;
				}
			}
        }
    }
        
    
////////////////////////////////////////////////////////////////////
    
    public static boolean isInArray(int x[], int y) {
    	
    	boolean c = false;
    	
    	for(int i = 0; i < x.length; i++) {
    		
    		if(x[i] == y)
    			c = true;
    	}
    	return c;
    }
    
    public static boolean isInArray(double x[], double y) {
    	
    	boolean c = false;
    	
    	for(int i = 0; i < x.length; i++) {
    		
    		if(x[i] == y)
    			c = true;
    	}
    	return c;
    }
    
    public static boolean isInArray(char x[], char y) {
    	
    	boolean c = false;
    	
    	for(int i = 0; i < x.length; i++) {
    		
    		if(x[i] == y)
    			c = true;
    	}
    	return c;
    }
    
    public static boolean isInArray(String x[], String y) {
    	
    	boolean c = false;
    	
    	for(int i = 0; i < x.length; i++) {
    		
    		if(x[i] == y)
    			c = true;
    	}
    	return c;
    }
    
    public static boolean isInArray(boolean x[], boolean y) {
    	
    	boolean c = false;
    	
    	for(int i = 0; i < x.length; i++) {
    		
    		if(x[i] == y)
    			c = true;
    	}
    	return c;
    }
    
    
//            ***   ***   ***   ***   ***
    
    public static int isInArray(int x[], int y, boolean numberOfTimes) {
    	
    	int c = 0;
    	
    	for(int i = 0; i < x.length; i++) {
    		
    		if(x[i] == y)
    			c++;
    	}
    	return c;
    }
    
    public static int isInArray(double x[], double y, boolean numberOfTimes) {
    	
    	int c = 0;
    	
    	for(int i = 0; i < x.length; i++) {
    		
    		if(x[i] == y)
    			c++;
    	}
    	return c;
    }
    
    public static int isInArray(char x[], char y, boolean numberOfTimes) {
    	
    	int c = 0;
    	
    	for(int i = 0; i < x.length; i++) {
    		
    		if(x[i] == y)
    			c++;
    	}
    	return c;
    }
    
    public static int isInArray(String x[], String y, boolean numberOfTimes) {
    	
    	int c = 0;
    	
    	for(int i = 0; i < x.length; i++) {
    		
    		if(x[i] == y)
    			c++;
    	}
    	return c;
    }
    
    public static int isInArray(boolean x[], boolean y, boolean numberOfTimes) {
    	
    	int c = 0;
    	
    	for(int i = 0; i < x.length; i++) {
    		
    		if(x[i] == y)
    			c++;
    	}
    	return c;
    }
    
}
