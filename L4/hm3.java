import java.util.Scanner;


public class hm3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		int flag = 1;
		int min = 0;
		int max = 0;
		for(int i = 0; i < 5; i++){
		System.out.println("Enter number: ");
		int a = input.nextInt();
		 if(flag == 1){
         	min = a;
         	max = a;
         	flag=0;
         }
		 else{
         	if(a > max){ 
         	max = a;
         	}
         	if(a < min){
         	min = a;
         	}
		 }
		}
		System.out.println("max is:"+max);
		System.out.println("min is:"+min);
		input.close();
	}
}


