
public class hm4 {

	public static void main(String[] args) {
		int a = 2;
		System.out.println(a + " is " + evenOrOdd(a));
		int b = 5;
		System.out.println(b + " is " + evenOrOdd(b));

	}

	public static String evenOrOdd(int number){
		if(number % 2 == 0){
			return "Even";
		}
		else{
			return "Odd";
		}
	}
}
