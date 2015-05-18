public class Teacher extends Person {
	String subject;
	
	public Teacher(){
		super();
		this.subject = "";
	}
	public Teacher(String firstName, String lastName, int years, String subject){
		super(firstName, lastName, years);
		this.subject = subject;
	}
	
	public void CheckingHomework(){
		System.out.println("I am Teacher and I check homework.");
	}
	public void SayGoodafternoon(){
		System.out.println("Good afternoon!");
	}
	public void SayGoodbye(){
		System.out.println("Goodbye!");
	}
}