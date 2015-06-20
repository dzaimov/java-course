import java.util.LinkedList;
import java.util.Scanner;


public class Fourth {

	public static void main(String[] args) {
		LinkedList<String[]> items = new LinkedList<String[]>();
        Scanner input1=new Scanner(System.in,"UTF-8");
        System.out.println("Enter K:");
        int k=input1.nextInt();
        String[] item = new String[k];
        String[] input = {"4", "3","9"};
		if(k > input.length){
			System.out.println("K>N");
			System.exit(0);
		 }
        rep(items, input, item, 0);


        for (String[]java:items) {
        	for(int i=0;i<java.length;i++)
            System.out.print(java[i]);
        	System.out.println();
        }
        
        input1.close();
    }

    private static void rep(LinkedList<String[]> reps, String[] input, String[] item, int count){
        if (count < item.length){
            for (int i = 0; i < input.length; i++) {
                item[count] = new String(input[i]);
                rep(reps, input, item, count+1);
            }
        }else{
            reps.add(item.clone());
        }
    }


}
