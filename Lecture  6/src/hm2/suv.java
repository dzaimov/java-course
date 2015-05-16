package hm2;

public class suv extends car {
	boolean allroad;
	
	public suv(){
		super();
		this.allroad = false;
	}
	public suv(int price, boolean allroad){
		super(price);
		this.allroad = allroad;
	}
	
	
	public void sayAllroad(){
		System.out.print("4x4: " + this.allroad);
		System.out.println();
	}
}
