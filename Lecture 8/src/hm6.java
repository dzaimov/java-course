import java.util.Scanner;


public class hm6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter number: ");
		int a = input.nextInt();
		System.out.println(Facturiel(a));
		input.close();

	}

	public static int Facturiel(int number){
		if(number == 0){
			return 1;
		}
		else{
			return number *Facturiel(number-1);
		}
	}
}
		
