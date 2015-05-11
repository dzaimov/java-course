package lecture5;

import java.util.Scanner;

public class hm4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter number to search: ");
		int n = input.nextInt();
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int size = array.length;
		int flag = 0;
		for(int i = 0; i < size; i++){
			if(array[i] == n){
				System.out.println("Match index[" + i + "]");
				flag = 1;
				break;
			}
		}
		if(flag == 0){
			System.out.println("No match!");
		}
		input.close();
	}

}
