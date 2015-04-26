import java.util.Scanner;

public class prog1 {
	 private static Scanner input;

	public static void main(String[] args) {
   	
		 input = new Scanner(System.in, "UTF-8");
		 	System.out.println("Please enter a length:");
	        double length = input.nextDouble();
	        System.out.println("Please enter a width:");
	        double width = input.nextDouble();
	        System.out.println("Area of the rectangle is " + (length * width));

	 }
}
