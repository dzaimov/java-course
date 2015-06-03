
public class Company {
	protected String name;
	protected int number;
	
	public Company(String name, int number){
		setName(name);
		setNumber(number);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public String toString(){
		return String.format("Name: %s Number: %d", this.name, this.number);
	}
	
}
