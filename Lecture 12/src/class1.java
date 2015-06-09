import java.util.Scanner;


public class class1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		boolean flag = true;
	    int temp;
		int numbers[] = new int[10];
		for (int j = 0; j < numbers.length; j++) {
		System.out.println("Enter number[" + (j) +"]: ");
		numbers[j] = input.nextInt();
		}
		while(flag){
			flag= false;
			for(int i=0;  i < numbers.length -1;  i++ ){
				if (numbers[ i ] < numbers[i+1]){
                      temp = numbers[ i ];                
                      numbers[ i ] = numbers[ i+1 ];
                      numbers[ i+1 ] = temp;
                      flag = true;               
                } 
			}
		}
		System.out.println("Enter number to search: ");
		int num = input.nextInt();
		for(int i = 0; i < numbers.length-1; i++){
			if(num == numbers[i]){
				System.out.println(numbers[i+1]);
			}
			else{
				System.out.println("Not found!");
				break;
			}
		}
		input.close();
	}

}
