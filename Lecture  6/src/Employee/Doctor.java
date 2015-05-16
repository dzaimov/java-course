package Employee;

public class Doctor extends Employee {
	int day;
	int night;
	
	public Doctor(){
		super();
		this.day = 0;
		this.night = 0;
	}
	public Doctor(int hours, double salary, int day, int night){
		super(hours, salary);
		setDay(day);
		setNight(night);
	}
	
	public int getDay(){
		return day;
	}
	public void setDay(int day){
		this.day = day;
	}
	public int getNight(){
		return night;
	}
	public void setNight(int night){
		this.night = night;
	}
	
	public void docWork(){
		System.out.println("I work " + this.day + " days.");
		System.out.println("I work " + this.night + " nights.");
		System.out.println();
	}
}
