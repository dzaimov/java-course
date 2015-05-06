import java.util.Scanner;


public class class5 {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in, "UTF-8");
			System.out.println("Please enter first side of the triangle: ");
			int f = input.nextInt();
			System.out.println("Please enter second side of the triangle: ");
			int s = input.nextInt();
			System.out.println("Please enter third side of the triangle: ");
			int t = input.nextInt();
			if((f + s) < t){
				System.out.println("Can not form a triangle");
			}
			else if((f + t) < s){
				System.out.println("Can not form a triangle");
			}
			else if((s + t) < f){
				System.out.println("Can not form a triangle");
			}
			else{
				System.out.println("Can form a triangle");
			}
			input.close();
	}

}
