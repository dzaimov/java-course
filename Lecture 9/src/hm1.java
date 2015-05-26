import java.util.Scanner;


public class hm1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter word: ");
		String word = input.next();
		input.close();
		for(int i = word.length()-1;i >= 0; i--){
			System.out.print(word.charAt(i));
		}

	}

}
