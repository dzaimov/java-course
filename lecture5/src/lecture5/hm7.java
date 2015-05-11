package lecture5;

import java.util.Arrays;
import java.util.Scanner;

public class hm7 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		int[] array={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		Arrays.sort(array);
		System.out.println("Enter number to search: ");
		int a = input.nextInt();
		int index = Arrays.binarySearch(array, a);
		System.out.print("index[" + index + "]");
		input.close();
	}
}
