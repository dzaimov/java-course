import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class hm2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter text: ");
		String word = input.nextLine();
		input.close();
		String[] words =  word.split(" ");
		
		TreeMap<String, Integer> wordsCount = new TreeMap<String, Integer>();
				
		for (String word1 : words) {
			Integer count = wordsCount.get(word1);
			if (count == null) {
				count = 0; 
			}
			wordsCount.put(word1, count + 1);
		}
		
		Set<String> wordKeys = wordsCount.keySet();
		
		System.out.println();
		
		for (String word1 : wordKeys) {
			int count = wordsCount.get(word1);
			if(count  == 1){
			System.out.printf("%s\n", word1);
			}
		}
	}

}
