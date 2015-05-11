package lecture5;


public class hm3 {
	public static void main(String[] args) {
		int[] array = new int[10];
		int size = array.length;
		for(int i = 0; i < size; i++){
			array[i] = i * 10;
		}
		for(int b: array){
			System.out.println(b);
		}
	}
}
