import java.util.Scanner;


public class hm7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter number: ");
		int a = input.nextInt();
		StringBuilder Perm = new StringBuilder();
		input.close();
		for(int i = 1; i <= a; i++){			
			Perm.append(i);
		}
		Permutation("", Perm.toString());

	}
	
	public static void Permutation(String str, String str1) {
		if(str1.length() == 0){			
			System.out.println(str);
		}
		else {
			for(int i = 0; i < str1.length(); i++){			
				Permutation(str + str1.charAt(i),
				str1.substring(0, i) + str1.substring(i + 1));
			}
		}
	}
}
