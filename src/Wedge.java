import java.util.Scanner;

public class Wedge {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num;
		
		System.out.println("Enter the initial number of @'s");
		num = scan.nextInt();
		System.out.println("You enterd: " + num);
		
		for(int i = 0; i < num; i++) {
			for(int j = num; j > i; j--) {
				System.out.print("@");
			}
			System.out.println();
		}
		
	}

}
