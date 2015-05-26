
public class Student {
	protected String firstName;
	protected String lastName;
	protected int facNumber;
	protected int group;
	
	public Student(String firstName, String lastName, int facNumber, int group){
		this.firstName = firstName;
		this.lastName = lastName;
		this.facNumber = facNumber;
		this.group = group;
	}
	
	public String toString(){
		return String.format("First name:%s Last name: %s Fac.Number: %d Group: %d", this.firstName, this.lastName, this.facNumber, this.group);
	}
}
