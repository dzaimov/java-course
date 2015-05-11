package lecture5;

public class hm6 {
	public static void main(String[] args) {
		int[][] array = new int[5][6];
		for(int n = 30; n >= 1; n--){
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				array[i][j] = n;
				n--;
			}
		}
		}
		for(int i = array.length-1 ; i >= 0; i--){
			for(int j = array[i].length-1; j >= 0; j--){
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
