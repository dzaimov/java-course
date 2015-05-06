import java.util.Scanner;


public class class6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Please enter points: ");
		int p = input.nextInt();
		switch(p){
			case 1:
			case 2:
			case 3:
				System.out.println("Points: " + p*5);
				break;
			case 4:
			case 5:
			case 6:
				System.out.println("Points: " + p*10);
				break;
			case 7:
			case 8:
			case 9:
				System.out.println("Points: " + p*50);
				break;
		}
		input.close();
	}
}
