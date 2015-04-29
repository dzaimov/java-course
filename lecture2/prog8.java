import java.util.Scanner;

public class prog8 {

	private static Scanner input;

	public static void main(String[] args) {
   	
		input = new Scanner(System.in, "UTF-8");
		 	System.out.println("Please enter number:");
		 	int n = input.nextInt();
		 	boolean even = (n % 2 == 0);
		 	boolean odd = (n % 2 == 1);
		 	System.out.println("Even " + even);
		 	System.out.println("Odd " + odd);
	}
}

