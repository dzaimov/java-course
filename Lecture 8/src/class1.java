
public class class1 {

	public static void main(String[] args) {
		int [] numbers = {1, 2, 3, 4, 5, 6};
		Numbers(numbers);
		System.out.println();
		String  str = "Obratno";
		Str(str);
	}

	public static void Numbers(int[] numbers){
		for(int i = numbers.length-1;i > 0; i--){
			System.out.print(numbers[i] + " ");
		}
	}
	
	public static void Str(String str){
		System.out.println(str);
	}
}
