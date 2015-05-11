package lecture5;

public class hm8 {
	public static void main(String[] args) {
		int[] array = {4, 7, 3, 98, 65,  1, 14, 19};
		int j;
		boolean flag = true;
		int a;

		while ( flag )
		{
            flag= false;
            for(j=0;  j < array.length -1;  j++ )
            {
                   if ( array[ j ] < array[j+1] )
                   {
                           a = array[j];
                           array[j] = array[j+1];
                           array[j+1] = a;
                           flag = true;
                  } 
            } 
		} 
		for(int b: array){
			System.out.println(b);
		}
	}
}
