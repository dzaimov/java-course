package lecture5;

import java.util.Scanner;

public class class3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter N: ");
		int n = input.nextInt();
		int[] array = new int[n];
		for(int i = 0; i<array.length; i++){
			System.out.println("Enter element[" + (i+1) + "]: ");
			array[i] = input.nextInt();
		}
		int[] array1 = new int[array.length];
		for(int i = 0; i<array.length; i++){
			array1[i] = array[i];
		}
		for(int b: array1){
			System.out.println(b);
		}
		input.close();
	}
}
