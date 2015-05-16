package hm3;

public class Fruit extends Stock {
	int quality;
	String color;
	
	public Fruit(){
		super();
		this.quality = 0;
		this.color = "";
	}
	public Fruit(int price, boolean available, int quality, String color){
		super(price, available);
		this.quality = quality;
		this.color = color;
	}

}
