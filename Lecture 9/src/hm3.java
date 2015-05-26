import java.util.Scanner;


public class hm3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter text: ");
		String text = input.nextLine();
		System.out.println("Enter word: ");
		String word = input.nextLine();
		input.close();
		String[] str = text.split(" ");
		int count = 0;
		 for(int i=0; i<str.length; i++){
      	   if(str[i].equalsIgnoreCase(word))
      	         count++;
      	}
		System.out.println(count);
	}
}
	
