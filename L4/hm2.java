import java.util.Scanner;


public class hm2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter N: ");
		int n = input.nextInt();
		for(int i = 1; i < n; i++){
			if((i % 3 != 0) && (i % 7 != 0)){
				System.out.println(i);
			}
		}
		input.close();
	}
}
