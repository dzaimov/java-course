import java.util.Scanner;


public class hm2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter name: ");
		String name = input.next();
		System.out.println(Greeting(name));
		input.close();
	}
	
	public static String Greeting(String name){
		return String.format("Greeting %s!", name);
	}
}
