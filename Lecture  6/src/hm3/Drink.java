package hm3;

public class Drink extends Stock {
	String type;
	int expiryDate;
	
	public Drink(){
		super();
		this.type = "";
		this.expiryDate = 0;
	}
	public Drink(int price, boolean available, String type, int expiryDate){
		super(price, available);
		this.type = type;
		this.expiryDate = expiryDate;
	}
}
