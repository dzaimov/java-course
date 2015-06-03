import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class class1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter string: ");
		String str = input.nextLine();
		input.close();
		Stack<Character> myStack = new Stack<Character>();
		Queue<Character> queue = new LinkedList<Character>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)){
				myStack.push(ch);			
			}
			else{
				queue.offer(ch);
			}
		
		}
		System.out.println();
		System.out.print("Up: ");
		while(!myStack.isEmpty()){
			char current = myStack.pop();		
			System.out.print(current);
		}
		System.out.println();
		System.out.print("Low: ");
		while (queue.size() > 0) {		
			char text= queue.poll();		
			System.out.print(text);	
		} 


	}
}


