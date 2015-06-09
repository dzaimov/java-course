import java.util.Arrays;
import java.util.Scanner;


public class hm3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in,"UTF-8");
		System.out.println("Enter sentance:");
		String sentence = input.nextLine();
		input.close();
		String [] arr = sentence.split(" ");
		Arrays.sort(arr, (String o1, String o2) -> o1.compareToIgnoreCase(o2));
		for (String arr1 : arr) {
		    System.out.println(arr1);
		}

	}

}
