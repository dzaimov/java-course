package hm3;

public abstract class Stock {
	int price;
	boolean available;
	
	public Stock(){
		this.price = 0;
		this.available = false;
	}
	public Stock(int price, boolean available){
		this.price = price;
		this.available = available;
	}
	
	public void Add(String Product){
		Stock[] a = new Stock[10];
		
		}
	public boolean isItAvailable(){
		
		return available;
	}
}
