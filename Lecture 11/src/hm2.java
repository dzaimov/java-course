import java.util.LinkedList;
import java.util.Queue;


public class hm2 {

	public static void main(String[] args) {
		String text = "My spaceship is ready for travelling to Mars";
		String[] array = text.split(" ");
		
		Queue<String> queue = new LinkedList<String>();
		for (int i = 0; i < array.length; i++) {
			if(array[i].length() > 3){
			queue.offer(array[i]);
			}
		}
		
		while (queue.size() > 0) {		
			String text1 = queue.poll();		
			System.out.print(text1 + " ");	
		}

	}

}
