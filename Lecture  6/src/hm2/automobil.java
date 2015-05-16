package hm2;

public class automobil extends car {
	int consumption;
	
	public automobil(){
		super();
		this.consumption = 0;
	}
	public automobil(int price, int consumption){
		super(price);
		this.consumption = consumption;
	}
	
	public void sayConsumption(){
		System.out.print(this.consumption + "L/100");
		System.out.println();
	}
	
	
}
