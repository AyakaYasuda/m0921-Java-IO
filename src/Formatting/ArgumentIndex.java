package Formatting;

public class ArgumentIndex {

	public static void main(String[] args) {
		
		System.out.printf("%s%s%s%n", "1", "2", "3");
		System.out.printf("%1s%1s%1s%n", "1", "2", "3");
		System.out.printf("%3s%3s%3s%n", "a", "b", "c");
		System.out.printf("%2s %s %s%n", "a", "b", "c");
		System.out.printf("%s %3s %s%n", "a", "b", "c");
		
		System.out.printf("%2$s %3$s %s%n", "a", "b", "c");
		System.out.printf("%1$s %1$s %n", "a");
		
		System.out.printf("%s %<s %<s %n", "a", "b", "c");
		System.out.printf("%s %<s %s %n", "a", "b", "c");
//		System.out.printf("<%s %<s %s %n", "a", "b", "c"); // error
	}

}
