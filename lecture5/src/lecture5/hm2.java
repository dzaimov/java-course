package lecture5;

import java.util.Scanner;

public class hm2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter N: ");
		int n = input.nextInt();
		int[] array = new int[n+1];
		int size = array.length;
		array[1] = 1;
		for(int i = 2; i < size; i++){
			array[i] = array[i-1] + array[i-2];
		}
		for(int i = 1; i < size; i++){
			System.out.println(array[i]);
		}
		input.close();
	}
}
