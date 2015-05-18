
public class Lecture extends Person {
	String university;
	final int maxLectures = 10;
	public Lecture(){
		super();
		this.university = "";
	}
	public Lecture(String firstName, String lastName, int years, String university){
		super(firstName, lastName, years);
		this.university = university;
	}
	
	public void CheckingHomework(){
		System.out.println("I am Lecture and I check homework.");
	}
	public void examOne(){
		System.out.println("Conduct examinations first.");
	}
	public void examTwo(){
		System.out.println("Conduct examinations second.");
	}
	public void examThree(){
		System.out.println("Conduct examinations third.");
	}
	
	public void SayGoodafternoon(){
		System.out.println("Good afternoon!");
	}
	
}
