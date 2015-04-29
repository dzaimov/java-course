import java.util.Scanner;

public class prog6 {

	private static Scanner input;

	public static void main(String[] args) {
   	
		input = new Scanner(System.in, "UTF-8");
		 	System.out.println("Please enter raduis:");
	        double radius = input.nextDouble();
	        System.out.println("Perimeter is " + (2 * 3.14 * radius));
	        System.out.println("Area is " + ( 3.14 * (radius * radius)));
	}
}