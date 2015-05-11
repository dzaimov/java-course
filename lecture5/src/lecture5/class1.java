package lecture5;

import java.util.Scanner;

public class class1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter N: ");
		int n = input.nextInt();
		int[] array = new int[n];
		for(int i = 0; i<array.length; i++){
			System.out.println("Enter element[" + (i+1) + "]: ");
			array[i] = input.nextInt();
		}
		if(n % 2 == 0){
			int b = 0;
			int a = array.length - 1;
			for(int j = 0; j < array.length  ; j++, a--){
				if(array[j] == array[a]){
					b++;
					}
			}
			if(b == (array.length / 2)){
				System.out.println("Symetric");
			}else{
				System.out.println("No Symetric");
			}
			
		}else{
			int b = 0;
			int a = array.length - 1;
			for(int j = 0; j < array.length - 1 ; j++, a--){
				if(array[j] == array[a]){
					b++;
					}
			}
			if(b == (array.length /2)){
				System.out.println("Symetric");
			}else{
				System.out.println("No Symetric");
			}
		}
		input.close();
	}
}
