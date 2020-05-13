package checkDigit;

public class CheckDigit {
	
	public static boolean isValid(int numWithCheckDigit) {
		
		int num = (int) (numWithCheckDigit / 10);
		int check = getCheck(num);
		int toCheck = num * 10 + check;
		
		if(numWithCheckDigit == toCheck)
			return true;
		
		return false;
		
	}

	private static int getCheck(int num) {
		// TODO Auto-generated method stub
		return 0;
	}

}
