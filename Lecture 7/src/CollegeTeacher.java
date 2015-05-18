public class CollegeTeacher extends Teacher {
	String college;
	
	public CollegeTeacher(){
		super();
		this.college = "";
	}
	public CollegeTeacher(String firstName, String lastName, int years, String subject, String college){
		super(firstName, lastName, years, subject);
		this.college = college;
	}
	public void CheckingHomework(){
		super.CheckingHomework();
	}
}
