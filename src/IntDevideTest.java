import java.util.Scanner;

public class IntDevideTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int divident, divisor, quotient, reminder;
		
		System.out.println("Enter the divident");
		divident = scan.nextInt();
		
		System.out.println("Enter the divisor");
		divisor = scan.nextInt();
		
		quotient = divident / divisor;
		reminder = divident % divisor;
		
		System.out.println(divident + " / " + divisor + " is " + quotient);
		System.out.println(divident + " % " + divisor + " is " + reminder);
		
		scan.close();
	}

}
