import java.util.TreeSet;


public class Second {

	public static void main(String[] args) {
		int one[] = {4};
		int two[] = {3};
		int n = 20;
		TreeSet<Integer> result = new TreeSet<Integer>();
		
		for (int i = 0; i < two.length; i++) {
			for (int j = 1; j <= n; j++) {
				if(j % one[i] == 0){
					if(j % two[i] != 0){
						result.add(j);
					}
				}
			}
		}
		
		for (int a  : result) {
	         System.out.print(a+ " ");
	      }
	}

}
