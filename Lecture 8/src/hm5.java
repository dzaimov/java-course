
public class hm5 {
	public static void main(String[] args) {
		Numbers();
	}
	
	public static void Numbers(){
		int j=0;
		for(int i = 1; i <= 999; i++){
			if(i < 100){
				i = i + 10;
			System.out.println(i);
			}
			else if(i % 101 == 0){
				System.out.println(i);
			}
			else if(i > 100){
				i = i + 9;
				j++;
				if(j<10){
				System.out.println(i);
				}
			}
			if(j == 10){
				j=0;
			}
		}
	}
}
