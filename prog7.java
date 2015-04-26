import java.util.Scanner;

public class prog7 {

	private static Scanner input;

	public static void main(String[] args) {
   	
		input = new Scanner(System.in, "UTF-8");
		 	System.out.println("Please enter number:");
		 	int n = input.nextInt();
		 	boolean fiveYes = (n % 5 == 0);
		 	boolean sevenYes = (n % 7 == 0);
		 	System.out.println("Divided on 5 " + fiveYes);
		 	System.out.println("Divided on 7 " + sevenYes);
	}
}

