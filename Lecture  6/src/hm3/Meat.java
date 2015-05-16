package hm3;

public class Meat extends Stock {
	String kind;
	int protein;

	public Meat(){
		super();
		this.kind = "";
		this.protein = 0;		
	}
	public Meat(int price, boolean available, String kind, int protein){
		super(price, available);
		this.kind = kind;
		this.protein = protein;		
	}
	
}
