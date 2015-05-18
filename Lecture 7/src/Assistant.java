
public class Assistant extends Lecture {
	boolean chief;
	
	public Assistant(){
		super();
		this.chief = false;
	}
	public Assistant(String firstName, String lastName, int years, String university, boolean chief){
		super(firstName, lastName, years, university);
		this.chief = chief;
	}
	
	public void sayName(){
		System.out.println("My name is " + super.firstName + " " + super.lastName);
	}
	public void sayChief(){
		System.out.println("Chief Assistant: " + this.chief);
	}
	public void writeMemoir(){
		System.out.println("I can write memoir!");
	}
	public void sayTakeExams(){
		System.out.println("I can take exams!");
	}
}
