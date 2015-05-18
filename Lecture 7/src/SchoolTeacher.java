public class SchoolTeacher extends Teacher {
	String[] clas = new String[5];
	
	public SchoolTeacher(){
		super();
		this.clas = new String[5];
//		for(int i = 0; i<(clas.length-1); i++){
//		this.clas[i] = "";
//		}
	}
	public SchoolTeacher(String firstName, String lastName, int years, String subject, String[] clas){
		super(firstName, lastName, years, subject);
		this.clas = new String[5];
//		for(int i = 0; i<(clas.length-1); i++){
//			this.clas[i] = clas[i];
//			}
	}
	
	public void printClas(){
		for(int i = 0; i<(clas.length-1); i++){
		System.out.println("Class - " + clas[i]);
		}
	}
	public void CheckingHomework(){
		super.CheckingHomework();
	}
	public void entertainsChildren(){
		System.out.println("I can entertains children!");
	}
}

