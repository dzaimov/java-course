import java.util.Random;


public class hm3 {

	public static void main(String[] args) {
		Random rand = new Random();
		for(int i = 0; i < 20; i++){
		int a = rand.nextInt(100);
		int b = rand.nextInt(1000);
		int c = rand.nextInt(10000);
		System.out.println(Multiplication(a, b, c));
		}
				

	}

	public static int Multiplication(int first, int second, int third){
		return (first*second*third);
	}
}
