import java.util.Scanner;


public class class2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Please enter first number: ");
		int a = input.nextInt();
		System.out.println("Please enter second number: ");
		int b = input.nextInt();
		if(b == 0){
			System.out.println("Cannot divide by zero");
		}
		else
			if((a / b) > 0){
				System.out.println("+");
			}
			else{
				System.out.println("-");
			}
	input.close();
	}
}