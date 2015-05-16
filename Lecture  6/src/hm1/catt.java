package hm1;


public class catt{
	public static void main(String[] args) {
		
			
		cat[] a = new cat[10];
		a[0] = new cat("Petko", 10);
		a[1] = new cat("Jivko", 7);
		a[2] = new cat("Raicho", 18);
		a[3] = new cat("Ivancho", 14);
		a[4] = new cat("Mitko", 20);
		a[5] = new cat("Pencho", 3);
		a[6] = new cat("Gencho", 8);
		a[7] = new cat("Asencho", 4);
		a[8] = new cat("Mladencho", 17);
		a[9] = new cat("Gamencho", 2);
		for(int i = 0; i < 10; i++){
			a[i].Say();
		}

	}

}
