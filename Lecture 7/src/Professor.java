public class Professor extends Lecture {
	String title;
	
	public Professor(){
		super();
		this.title = "";
	}
	public Professor(String firstName, String lastName, int years, String university, String title){
		super(firstName, lastName, years, university);
		this.title = title;
	}
	
	public void sayTitle(){
		System.out.println("Title : " + this.title);
	}
	public void sayYears(){
		System.out.println("I work " + super.years + " years.");
	}
	public void sayTakeExams(){
		System.out.println("I can take exams!");
	}
}
