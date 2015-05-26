import java.util.Scanner;


public class hm1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter first number: ");
		int a = input.nextInt();
		System.out.println("Enter second number: ");
		int b = input.nextInt();
		System.out.println("Enter third number: ");
		int c = input.nextInt();
		input.close();
		int d = maxNumber(a,b);
		int f = maxNumber(c,d);
		System.out.println("Max: " + f);
	}
	
	public static int maxNumber(int first, int second){
		if(first > second){
			return first;
		}
		else{
			return second;
		}
	}
}
