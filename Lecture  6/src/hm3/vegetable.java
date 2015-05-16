package hm3;

public class vegetable extends Stock {
	String origin;
	String classification;
	
	public vegetable(){
		super();
		this.origin = "";
		this.classification = "";
	}
	public vegetable(int price, boolean available, String origin, String classification){
		super(price, available);
		this.origin = origin;
		this.classification = classification;
	}
}
