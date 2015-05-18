
public class Inheritance {

	public static void main(String[] args){
		CollegeTeacher a = new CollegeTeacher("Ivan", "Ivanov", 6, "Math", "M3 College");
		a.CheckingHomework();
		
		Assistant c = new Assistant("Denis", "Zaimov", 25, "TU Sofia", false);
		System.out.println();
		c.sayName();;
		c.sayChief();
		c.writeMemoir();
		c.sayTakeExams();
		
		Professor d = new Professor("Denis", "Zaimov", -5, "UNSS", "Docent");
		System.out.println();
		d.sayTitle();
		d.sayYears();
		d.sayTakeExams();
		
		Teacher e = new Teacher("Veselin", "Marinov", 2, "Music");
		System.out.println();
		e.SayGoodafternoon();
		e.SayGoodbye();
		
		Lecture f = new Lecture("Boiko", "Borisov", 24, "Parliament");
		System.out.println();
		f.CheckingHomework();
		f.examOne();
		f.examTwo();
		f.examThree();
		f.SayGoodafternoon();
		
		System.out.println();
		System.out.println();
		System.out.println(c.count);
	}

}
