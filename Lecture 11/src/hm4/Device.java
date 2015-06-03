package hm4;

public abstract class Device implements Information{
	private String brand;
	private String model;
	
	public Device(){
		
	}
	public Device(String brand, String model){
		setBrand(brand);
		setModel(model);
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public void printInfo(){
		System.out.println("Brand: " + this.getBrand());
		System.out.println("Model: " + this.getModel());
	}
}
