public class Third {
	public static void permute(int[] input2, int startindex) {

	    if (input2.length == startindex) {
	    	 for (int i = 0; i < input2.length; i++) {
	 	        System.out.print(input2[i] + " ");
	 	    }
	 	    System.out.println();
	    } else {
	        for (int i = startindex; i < input2.length; i++) {
	            int[] input = input2.clone();
	            int temp = input[i];
	            input[i] = input[startindex];
	            input[startindex] = temp;
	            permute(input, startindex + 1);
	        }
	    }
	}
	public static void main(String[] args) {
	    int[] input = {3, 12, 8};
	    permute(input, 0);
	}

}

