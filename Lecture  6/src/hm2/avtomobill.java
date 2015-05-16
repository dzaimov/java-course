package hm2;

public class avtomobill {

	public static void main(String[] args) {
		car[] a = new car[10];
		
		a[0] = new automobil(5000, 4);
		a[1] = new automobil(6000, 6);
		a[2] = new automobil(3000, 14);
		a[3] = new automobil(8000, 8);
		a[4] = new automobil(9000, 10);
		a[5] = new suv(11000, true);
		a[6] = new suv(18000, true);
		a[7] = new suv(15000, false);
		a[8] = new suv(12000, true);
		a[9] = new suv(19000, true);
		
		int swap;
		for (int c = 0; c < 10; c++) {
		      for (int d = 0; d < 10 - c - 1; d++) {
		        if (a[d].price > a[d+1].price) 
		        {
		          swap = a[d].price;
		          a[d].price = a[d+1].price;
		          a[d+1].price = swap;
		        }
		      }
		    }
		
		for(int i = 0; i < 5; i++){
				a[i].sayPrice();
				a[i].sayConsumption();
		}
		for(int j = 5; j < 10; j++){
				a[j].sayPrice();
				a[j].sayAllroad();
		}
	}

}
