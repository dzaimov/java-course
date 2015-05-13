import java.util.Scanner;


public class hm4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter N: ");
		int n = input.nextInt();
		System.out.println("Enter K: ");
		int k = input.nextInt();
		if((k > 1) && (k > n)){
			System.out.println("Error");
		}
		else{
		int facN = 1;
		int facK = 1;
		for(int i = 1; i <= n; i++){
			facN *= i;
		}
		for(int i = 1; i <= k; i++){
			facK *= i;
		}
		System.out.println("N!/K! = " + facN / facK);
		input.close();
		}
	}
}
