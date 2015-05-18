public abstract class Person {
	protected String firstName;
	protected String lastName;
	protected int years;
	public static int count = 0;
	
	public Person(){
		this.firstName = "";
		this.lastName = "";
		this.years = 0;
	}

	public Person(String firstName, String lastName, int years){
		setFirstName(firstName);
		setLastName(lastName);
		setYears(years);
		count ++;
	}
	
	public String getFirstName(){
		return firstName;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getLasttName(){
		return lastName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public int getYears(){
		return years;
	}
	public void setYears(int years){
		if(this.years > 0){
			this.years = years;
		}
	}
}
