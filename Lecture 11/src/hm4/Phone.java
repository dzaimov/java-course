package hm4;

public class Phone extends Device{
	
	public Phone() {
		super();
	}	
	public Phone(String brand, String model) {
		super(brand, model);
	}
	
	public void printInfo() {
		System.out.println("Brand: " + this.getBrand());
		System.out.println("Model: " + this.getModel());
	}
}
