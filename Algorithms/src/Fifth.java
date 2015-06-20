import java.util.Scanner;


public class Fifth {

	public static void main(String[] args){
        String[] arr = {"3","6","7"};
        Scanner input=new Scanner(System.in,"UTF-8");
        System.out.println("Enter k:");
        int len=input.nextInt();
        
        if(len>=arr.length){
        	System.out.println("K>N");
        	input.close();
        	System.exit(0);
        }
        combinations2(arr, len, 0, new String[len]);
        input.close();
    }

    static void combinations2(String[] arr, int len, int startPosition, String[] result){
        if (len == 0){
        	for(int i=0;i<result.length;i++){
        		System.out.print(result[i]);
        	}
        	System.out.println();
            return;
        }       
        for (int i = startPosition; i <= arr.length-len; i++){
            result[result.length - len] = arr[i];
            combinations2(arr, len-1, i+1, result);
        }
    }

}
