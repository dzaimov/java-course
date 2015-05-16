package hm3;

public class Dessert extends Stock {
	String form;
	int quantity;
	
	public Dessert(){
		super();
		this.form = "";
		this.quantity = 0;
	}
	public Dessert(int price, boolean available, String form, int quantity){
		super(price, available);
		this.form = form;
		this.quantity = quantity;
	}
}
