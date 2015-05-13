import java.util.Scanner;


public class hm5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter N: ");
		int n = input.nextInt();
		System.out.println("Enter K: ");
		int k = input.nextInt();
		int facN = 1;
		int facK = 1;
		int facNK = 1;
		for(int i = 1; i <= n; i++){
			facN *= i;
		}
		for(int i = 1; i <= k; i++){
			facK *= i;
		}
		for(int i = 1; i < (n - k); i++){
			facNK *= i;
		}
		System.out.println("N!*K!/(N-K)! = " + ((facN * facK) / (facNK)));
		input.close();
	}
}