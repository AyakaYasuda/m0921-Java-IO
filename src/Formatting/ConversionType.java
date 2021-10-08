package Formatting;

public class ConversionType {

	public static void main(String[] args) {
		
		// for integers
		System.out.printf("%d%n", 10);
		
		// for float and double
		System.out.printf("%f%n", 10.1);
		System.out.printf("%f%n", 10.12345678);
		
		// for character
		System.out.printf("%c%n", 'a');
		System.out.printf("%C%n", 'a');
		
		// for boolean
		System.out.printf("%b%n", 5 < 4);
		System.out.printf("%B%n", 5 < 4);
//		System.out.printf("%b%n", null);
		System.out.printf("%b%n", "cat");
		
		// scientific notation
		System.out.printf("%e%n", 10.123);
		
		// decimal or scientific format
		System.out.printf("%g%n", 10000.0);
		System.out.printf("%g%n", 1000000.0);
		
		// octal
		System.out.printf("%o%n", 10);
		// hexadecimal
		System.out.printf("%x%n", 10);
		// hash code
		System.out.printf("%h%n", "hello");
		// hexadecimal floating point
		System.out.printf("%a%n", 10.12);
		
		System.out.printf("%n");
		System.out.printf("\n");
		System.out.printf("%%"); // %

	}

}
