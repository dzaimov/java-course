import java.util.Scanner;


public class class9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Please enter 5 numbers: ");
		System.out.print("First: ");
		int a = input.nextInt();
		System.out.print("Second: ");
		int b = input.nextInt();
		System.out.print("Third: ");
		int c = input.nextInt();
		System.out.print("Fourth: ");
		int d = input.nextInt();
		System.out.print("Fifth: ");
		int e = input.nextInt();
		if(a > b && a > c && a > d && a > e){
			System.out.println("Biggest is " + a);
		}
		if(b > a && b > c && b > d && b > e){
			System.out.println("Biggest is " + b);
		}
		if(c > a && c > b && c > d && c > e){
			System.out.println("Biggest is " + c);
		}
		if(d > a && d > b && d > c && d > e){
			System.out.println("Biggest is " + d);
		}
		if(e > a && e > b && e > c && e > d){
			System.out.println("Biggest is " + e);
		}
		input.close();
	}	
}