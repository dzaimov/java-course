package Employee;

public class Employee {
	
	int hours;
	double salary;

	public Employee(){
		this.hours = 0;
		this.salary = 0;
	}
	
	public Employee(int hours, double salary){
		this();
		
		setHours(hours);
		setSalary(salary);
	}
	
	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void info(){
		System.out.println("I work " +  this.hours + " hours per month");
		System.out.println("My salary is " +  this.salary);
	}
}
