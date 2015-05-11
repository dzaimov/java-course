package lecture5;

import java.util.Scanner;

public class hm5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter a: ");
		int a = input.nextInt();
		System.out.println("Enter b: ");
		int b = input.nextInt();
		int[] array = new int[b];
		if(b > a){
			for(int i = 0; i < b; i++){
				array[i] = i;
				}
			for(; a < b; a++){
				if(array[a] % 3 ==0){
					System.out.println(array[a]);
				}
			}
		}
		else{
			System.out.println("Error!");
		}
		input.close();
	}
}
