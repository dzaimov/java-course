import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class hm3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		String[] card = new String[5];
		for (int j = 0; j < card.length; j++) {
		System.out.println("Enter card " + (j+1) + ": ");
		card[j] = input.nextLine();
//		if(card[j]=="2" || card[j]!="3" || card[j]!="4" || card[j]!="5" || card[j]!="6" || card[j]!="7" || card[j]!="8" || card[j]!="9" || card[j]!="10" || card[j]!="J" || card[j]!="Q" || card[j]!="K" || card[j]!="A"){
//			System.out.println("Error card symbol! Please enter new card:");
//			card[j] = input.nextLine();
//		}		
		}
		input.close();
		TreeMap<String, Integer> wordsCount = new TreeMap<String, Integer>();
		
		for (String word1 : card) {
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
			if(count == 2){
			System.out.printf("%s -> Chift\n", word1, count);
			}
			if(count == 3){
				System.out.printf("%s -> Set\n", word1, count);
			}
			if(count == 4){
				System.out.printf("%s -> Kare\n", word1);
			}
		}
	}

}
