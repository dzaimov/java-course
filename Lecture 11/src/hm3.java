import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class hm3 {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		Stack<Character>myStack = new Stack<Character>();
		Stack<Character>myStack1 = new Stack<Character>();
		Scanner input=new Scanner(System.in,"UTF-8");
		System.out.println("Enter sentance:");
		String math = input.nextLine();
        input.close();
		char[] result = math.toCharArray();		
		int flag = 0;
		for(int i = 0;i < result.length; i++){
			
			if(flag == 0){
				if(!Character.isDigit(result[i])){
				System.out.println("Error");
				System.exit(0);
			}
				String a = Character.toString(result[i]);
				queue.offer(a);				
				flag++;
				continue;
			}
			if(flag == 1){
				if(Character.isDigit(result[i])){
					System.out.println("Error");
					System.exit(1);
				}
				myStack.push(result[i]);
				flag--;
				continue;
			}			
		}
		while(!myStack.isEmpty()){
			myStack1.push(myStack.pop());
		}
		while(!myStack1.isEmpty()){			
		     char ch = myStack1.pop();
		     if(ch == '+'){
		    	 int a = Integer.parseInt(queue.poll());
		    	 int b = Integer.parseInt(queue.poll());
		    	 queue.offer(Integer.toString(a + b));
		     }
		     else if(ch == '-'){		    	 
		    	 int a = Integer.parseInt(queue.poll());		    	 
		    	 int b = Integer.parseInt(queue.poll());		    	 
		    	 queue.offer(Integer.toString(a - b));
		     }
		}
        System.out.println("Result: " + queue.poll());
	}

}

