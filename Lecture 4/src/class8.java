import java.util.Scanner;


public class class8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("ax2 + bx + c");
		System.out.println("Please enter a: ");
		int a = input.nextInt();
		System.out.println("Please enter b: ");
		int b = input.nextInt();
		System.out.println("Please enter c: ");
		int c = input.nextInt();
		if((b * b) - (4 * a * c) > 0){
			System.out.println("x1 = " + (-b + Math.sqrt(b * b - 4 * a * c))/2*a);
			System.out.println("x2 = " + (-b - Math.sqrt(b * b - 4 * a * c))/2*a);
		}
		else if((b * b) - (4 * a * c) == 0){
			System.out.println("x1 = x2 = " + (-b/2*a));
		}
		else{
			
			System.out.println("D<0");
		}
		input.close();
	}
}
