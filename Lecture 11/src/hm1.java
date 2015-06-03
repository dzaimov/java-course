import java.util.Stack;


public class hm1 {

	public static void main(String[] args) {
		String text = "I am from planet Earth";
		String[] array = text.split(" ");
		Stack<String> myStack = new Stack<String>();
		for (int i = 0; i < array.length; i++) {
			myStack.push(array[i]);
		}
		while(!myStack.isEmpty()){
			String current = myStack.pop();		
			System.out.print(current + " ");
		}

	}

}
