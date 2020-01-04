
public class Test {

	public static void main(String[] args) {
		
		int[] test = new int[6];
		char[] test2 = new char[5];
		
		test[0] = 3;
		test[1] = 0;
		test[2] = 8;
		test[3] = 0;
		test[4] = 0;
		test[5] = 9;
		
		CyTools.reverseArray(test);
		
		for(int i = 0; i < test.length; i++) {
			
			System.out.println(test[i]);
			
		}
		


}
}
