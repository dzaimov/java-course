import java.util.Scanner;


public class class3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Please enter first number: ");
		int first = input.nextInt();
		System.out.println("Please enter second number: ");
		int second = input.nextInt();
		System.out.println("Please enter third number: ");
		int third = input.nextInt();
		if(first > second){
			if(first > third){
				System.out.println("First is biggest!");
			}
			else{
				System.out.println("Second is biggest!");
			}
		}
		else{
			if(second > third){
				System.out.println("Second is biggest!");
			}
			else{
				System.out.println("Third is biggest!");
			}
		}
		input.close();
	}
}
