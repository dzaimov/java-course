package lecture5;

import java.util.Scanner;

public class hm9 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		System.out.println("Enter rows/cows: ");
		int n = input.nextInt();
		int[][] array = new int[n][n];
		int k = 1;
		while(k <= n*n){
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
				array[i][j] = k++;
				}
			}
		}
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.print(array[j][i] + " ");
			}
			System.out.println();
		}
        input.close();
     }
 
}

