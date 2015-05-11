package lecture5;

import java.util.Scanner;

public class class2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter N: ");
		int n = input.nextInt();
		int[] array = new int[n];
		for(int i = 0; i<array.length; i++){
			System.out.println("Enter element[" + (i+1) + "]: ");
			array[i] = input.nextInt();
		}
		int j = (array.length -1);
		int p = 0;
		for(int i = 0; i < (array.length / 2); i++, j--){
			p = array[i];
			array[i] = array[j];
			array[j] = p;
		}
		for(int b: array){
			System.out.println(b);
		}
		input.close();
	}
}
