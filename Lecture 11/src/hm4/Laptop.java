package hm4;

public class Laptop extends Device{
	
	public Laptop() {
		super();
	}	
	public Laptop(String brand, String model) {
		super(brand, model);
	}
	
	public void printInfo() {
		System.out.println("Brand: " + this.getBrand());
		System.out.println("Model: " + this.getModel());
	}
}
