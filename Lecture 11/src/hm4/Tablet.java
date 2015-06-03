package hm4;

public class Tablet extends Device{	
	
	public Tablet() {
		super();
	}	
	public Tablet(String brand, String model) {
		super(brand, model);
	}
	
	public void printInfo() {
		System.out.println("Brand: " + this.getBrand());
		System.out.println("Model: " + this.getModel());
	}
}
