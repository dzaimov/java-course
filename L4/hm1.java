import java.util.Scanner;


public class hm1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter N: ");
		int n = input.nextInt();
		for(int i = 1; i <= n; i++){
				System.out.println(i);
		}
		input.close();

	}

}
