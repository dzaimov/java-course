package hm2;

public class car {
	int price;
	
	public car(){
		this.price = 0;
	}
	public car(int price){
		this.price = price;
		setPrice(price);
	}
	
	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price = price;
	}
	
	public void sayPrice(){
		System.out.print("Price: " + this.price + " ");
	}
	
	public void sayConsumption(){
		
	}
	
	public void sayAllroad(){
		
	}
}
