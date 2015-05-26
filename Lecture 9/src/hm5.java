import java.util.Scanner;


public class hm5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter : ");
		String math = input.nextLine();
		input.close();
		int count = math.length() - math.replaceAll("\\(", "").length();
		int count1 = math.length() - math.replaceAll("\\)", "").length();
		if((count + count1) % 2 == 0){
			System.out.println("Correct");
		}
		else{
			System.out.println("Incorrect");
		}

	}

}
