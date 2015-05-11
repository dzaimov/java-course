package lecture5;

import java.util.Scanner;

public class class4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		int[][] array = new int[4][4];
		for(int i = 0; i<array.length; i++){
			for(int u = 0; u<array[i].length; u++){
			System.out.println("Enter element[" + (i+1) + "][" + (u+1) + "]: ");
			array[i][u] = input.nextInt();
			}
		}
		for(int i = 0; i<array.length; i++){
			for(int u = 0; u<array[i].length; u++){
			if(array[i][u] % 2 == 0){
			}
			else{
				array[i][u] *= 2;
			}
			}
		}
		for(int i = 0; i<array.length; i++){
			for(int u = 0; u<array[i].length; u++){
				System.out.println(array[i][u]);
			}
			}
			
		input.close();
	}	
}
