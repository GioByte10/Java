import java.io.IOException;

public class Main {

    public static void main(String str[]) throws IOException {
        Fraction fraction1 = new Fraction(8, 10);
        System.out.println("Fraction 1: " + fraction1);
        
        Fraction fraction2 = new Fraction(12, 8);
        System.out.println("Fraction 2: " + fraction2);
        
        Fraction fraction3 = new Fraction(4, 5);
        System.out.println("Fraction 3: " + fraction3);
        System.out.println();
        
        System.out.println("Compare fraction 1 to fraction 2: " + fraction1.compareTo(fraction2));
        System.out.println("Compare fraction 2 to fraction 1: " + fraction2.compareTo(fraction1));
        System.out.println();
        
        System.out.println("Compare fraction 1 to fraction 3: " + fraction1.compareTo(fraction3));
        System.out.println("Compare fraction 3 to fraction 1: " + fraction3.compareTo(fraction1));
        System.out.println();
        
        System.out.println("Compare fraction 2 to fraction 3: " + fraction2.compareTo(fraction3));
        System.out.println("Compare fraction 3 to fraction 2: " + fraction3.compareTo(fraction2));

    }
}
