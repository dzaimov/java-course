import java.util.Scanner;


public class hm4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in,"UTF-8");
		int numbers[] = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Enter: ");
			numbers[i] = input.nextInt();
		}		
		input.close();
		int even[] = new int[10];
		int odd[] = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 == 0){
				even[i] = numbers[i];
			}
			else{
				odd[i] = numbers[i];
			}
		}
		BubbleSortD(even);
		BubbleSortA(odd);
		
		System.out.println("Even:");
		for (int i = 0; i < even.length; i++) {
			if(even[i] != 0){
			System.out.println(even[i]);
			}
		}

		System.out.println("Odd:");
		for (int i = 0; i < odd.length; i++) {
			if(odd[i] != 0){
			System.out.println(odd[i]);
			}
		}
	}
	
	public static void BubbleSortA(int[] num){
	     boolean flag = true;
	     int temp;

	     while (flag){
	            flag= false;
	            for(int j=0;  j < num.length -1;  j++ ){
	                   if ( num[ j ] < num[j+1] )
	                   {
	                           temp = num[ j ];
	                           num[ j ] = num[ j+1 ];
	                           num[ j+1 ] = temp;
	                           flag = true;  
	                  } 
	            } 
	      } 
	}
	public static void BubbleSortD(int[] num){
	     boolean flag = true;
	     int temp;

	     while (flag){
	            flag= false;
	            for(int j=0;  j < num.length -1;  j++ ){
	                   if ( num[ j ] > num[j+1] )
	                   {
	                           temp = num[ j ];
	                           num[ j ] = num[ j+1 ];
	                           num[ j+1 ] = temp;
	                           flag = true;  
	                  } 
	            } 
	      } 
	}
}
