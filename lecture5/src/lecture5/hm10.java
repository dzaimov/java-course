package lecture5;

import java.util.Scanner;

public class hm10 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in,"UTF-8");
		System.out.println("Enter rows/cows: ");
		int n = input.nextInt();
		int[][] array = new int[n][n];
        int k = 1, c1 = 0, c2 = n-1, r1 = 0, r2 = n-1;
        while(k <= n*n)
             {
                 for(int i = c1; i <= c2; i++)
                 {
                     array[r1][i] = k++;
                 }

                 for(int j = r1+1; j <= r2; j++)
                 {
                     array[j][c2] = k++;
                 }

                 for(int i = c2-1; i >= c1; i--)
                 {
                     array[r2][i] = k++;
                 }

                 for(int j = r2-1;j >= r1+1; j--)
                 {
                     array[j][c1] = k++;
                 }

              c1++;
              r1++;
              c2--;
              r2--;
             }
         for(int i = 0;i < n; i++)
             {
                 for(int j = 0; j < n; j++)
                     {
                         System.out.print(array[i][j] + " ");
                     }
              System.out.println();
             }
         input.close();
     }
 
}

