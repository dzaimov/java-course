import java.util.Scanner;

public class prog5 {

	private static Scanner input;

	public static void main(String[] args) {
   	
		input = new Scanner(System.in, "UTF-8");
		 	System.out.println("Please enter first integer:");
	        int first = input.nextInt();
	        System.out.println("Please enter second integer:");
	        int second = input.nextInt();
	        System.out.println("Please enter third integer:");
	        int third = input.nextInt();
	        System.out.println("Please enter fourth integer:");
	        int fourth = input.nextInt();
	        System.out.println("The amount is " + (first + second + third + fourth));

	 }
}
