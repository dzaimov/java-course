import java.util.Scanner;


public class class1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Please enter number: ");
		int a = input.nextInt();
		switch(a){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			if((a % 2) == 0){
			System.out.println("Even!");
			}
			else{
				System.out.println("Odd!");
			}
			break;
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
			if((a % 3) == 0){
				System.out.println("Number is divided by 3 without remainder");
				}
				else{
					System.out.println("Number is not divided by 3 without remainder");
				}
				break;
		}
		input.close();	
	}
}
