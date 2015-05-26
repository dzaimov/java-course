import java.util.Scanner;


public class hm2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter word: ");
		String word = input.next();
		System.out.println("Enter text: ");
		String text = input.next();
		input.close();
		System.out.println(text.replaceAll(word, word.toUpperCase()));

	}

}
