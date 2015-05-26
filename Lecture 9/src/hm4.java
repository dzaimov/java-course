
public class hm4 {

	public static void main(String[] args) {
		String text = "This is an apple.This is an orange.I love apples and oranges.";
		String[] str = text.split("\\.");
		for(int i=0; i<str.length; i++){
			if(str[i].contains("apple")){
		System.out.print(str[i] + ". ");
			}
		}
	}

}
