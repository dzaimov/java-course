import java.util.Scanner;


public class hm7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter number: ");
		int a = input.nextInt();
		input.close();
		
		Permutation(a);

	}
	
	public static int  Permutation(int k) {
		int[] array = new int[k];
		int i = 0;
		int temp = 0;
		if(k == 0){
			return Permutation(k + 1);
		}
		else{
			array[i] = temp;
			array[i] = array[k];
			array[k]= temp;
			Permutation(k-1);
			array[k] = temp;
			array[k] = array[i];
			array[i]= temp;
			Permutation(k);
			return Permutation(k-1);
		}
	}
}
