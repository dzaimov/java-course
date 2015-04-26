import java.util.Scanner;

public class prog3 {
	 private static Scanner input;

	public static void main(String[] args) {
		 input = new Scanner(System.in, "UTF-8");
		 System.out.println("Please enter first name:");
		 String name = input.nextLine();
		 System.out.println("Please enter last name:");
		 String lastName = input.nextLine();
		 System.out.println("Please enter age(0-120):");
		 byte age = input.nextByte();
		 input.nextLine();
		 System.out.println("Please enter sex(m/f):");
		 String sex = input.nextLine();
		 System.out.println("Please enter egn:");
		 long egn = input.nextLong();
		 System.out.println("Please enter telephone number:");
		 long telephoneNumber = input.nextLong();//Nomera ne moje da zapochva s 0, za tova sum slojil dopulnitelna 0-otpred ili trqbva da smenq tipa na String
		 System.out.println("Name:" + name);
		 System.out.println("Last name:" + lastName);
		 System.out.println("Age:" + age);
		 System.out.println("Sex:" + sex);
		 System.out.println("EGN:" + egn);
		 System.out.println("Telephone number:0" + telephoneNumber);
	 }
}
